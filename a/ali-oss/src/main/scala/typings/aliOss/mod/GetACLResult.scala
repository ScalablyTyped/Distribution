package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetACLResult extends StObject {
  
  var acl: ACLType = js.native
  
  var res: NormalSuccessResponse = js.native
}
object GetACLResult {
  
  @scala.inline
  def apply(acl: ACLType, res: NormalSuccessResponse): GetACLResult = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetACLResult]
  }
  
  @scala.inline
  implicit class GetACLResultMutableBuilder[Self <: GetACLResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcl(value: ACLType): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
