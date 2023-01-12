package typings.avocat

import typings.hapiBoom.mod.Boom
import typings.hapiHapi.mod.ResponseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("avocat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rethrow(err: Boom[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("rethrow")(err.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def rethrow(err: Boom[Any], options: Options): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("rethrow")(err.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def rethrow(err: ResponseObject): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("rethrow")(err.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def rethrow(err: ResponseObject, options: Options): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("rethrow")(err.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait Options extends StObject {
    
    var includeMessage: js.UndefOr[Boolean] = js.undefined
    
    var `return`: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setIncludeMessage(value: Boolean): Self = StObject.set(x, "includeMessage", value.asInstanceOf[js.Any])
      
      inline def setIncludeMessageUndefined: Self = StObject.set(x, "includeMessage", js.undefined)
      
      inline def setReturn(value: Boolean): Self = StObject.set(x, "return", value.asInstanceOf[js.Any])
      
      inline def setReturnUndefined: Self = StObject.set(x, "return", js.undefined)
    }
  }
}
