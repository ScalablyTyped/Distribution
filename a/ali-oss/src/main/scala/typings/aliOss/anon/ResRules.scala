package typings.aliOss.anon

import typings.aliOss.mod.CORSRule
import typings.aliOss.mod.NormalSuccessResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResRules extends StObject {
  
  var res: NormalSuccessResponse
  
  var rules: js.Array[CORSRule]
}
object ResRules {
  
  inline def apply(res: NormalSuccessResponse, rules: js.Array[CORSRule]): ResRules = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResRules]
  }
  
  extension [Self <: ResRules](x: Self) {
    
    inline def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    inline def setRules(value: js.Array[CORSRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: CORSRule*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
