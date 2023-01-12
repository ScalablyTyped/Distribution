package typings.asana.mod.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Params extends StObject {
  
  var opt_expand: js.UndefOr[String] = js.undefined
  
  var opt_fields: js.UndefOr[String] = js.undefined
}
object Params {
  
  inline def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
    
    inline def setOpt_expand(value: String): Self = StObject.set(x, "opt_expand", value.asInstanceOf[js.Any])
    
    inline def setOpt_expandUndefined: Self = StObject.set(x, "opt_expand", js.undefined)
    
    inline def setOpt_fields(value: String): Self = StObject.set(x, "opt_fields", value.asInstanceOf[js.Any])
    
    inline def setOpt_fieldsUndefined: Self = StObject.set(x, "opt_fields", js.undefined)
  }
}
