package typings.autoBind

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("auto-bind", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[SelfType /* <: Record[String, Any] */](// This has to use `any` to be compatible with classes.
  self: SelfType): SelfType = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(self.asInstanceOf[js.Any]).asInstanceOf[SelfType]
  inline def default[SelfType /* <: Record[String, Any] */](// This has to use `any` to be compatible with classes.
  self: SelfType, options: Options): SelfType = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(self.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SelfType]
  
  trait Options extends StObject {
    
    /**
    	Bind methods except for the given methods.
    	*/
    val exclude: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
    
    /**
    	Bind only the given methods.
    	*/
    val include: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExclude(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setInclude(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "include", js.Array(value*))
    }
  }
}
