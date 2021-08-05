package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetACLResult extends StObject {
  
  var acl: ACLType
  
  var res: NormalSuccessResponse
}
object GetACLResult {
  
  inline def apply(acl: ACLType, res: NormalSuccessResponse): GetACLResult = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetACLResult]
  }
  
  extension [Self <: GetACLResult](x: Self) {
    
    inline def setAcl(value: ACLType): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    inline def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
