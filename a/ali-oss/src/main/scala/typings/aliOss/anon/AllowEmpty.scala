package typings.aliOss.anon

import typings.aliOss.mod.NormalSuccessResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowEmpty extends StObject {
  
  var allowEmpty: Boolean
  
  var referers: js.Array[String]
  
  var res: NormalSuccessResponse
}
object AllowEmpty {
  
  inline def apply(allowEmpty: Boolean, referers: js.Array[String], res: NormalSuccessResponse): AllowEmpty = {
    val __obj = js.Dynamic.literal(allowEmpty = allowEmpty.asInstanceOf[js.Any], referers = referers.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowEmpty]
  }
  
  extension [Self <: AllowEmpty](x: Self) {
    
    inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
    
    inline def setReferers(value: js.Array[String]): Self = StObject.set(x, "referers", value.asInstanceOf[js.Any])
    
    inline def setReferersVarargs(value: String*): Self = StObject.set(x, "referers", js.Array(value :_*))
    
    inline def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
