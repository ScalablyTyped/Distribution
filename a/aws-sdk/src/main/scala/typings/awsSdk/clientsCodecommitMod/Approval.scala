package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Approval extends StObject {
  
  /**
    * The state of the approval, APPROVE or REVOKE. REVOKE states are not stored.
    */
  var approvalState: js.UndefOr[ApprovalState] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user.
    */
  var userArn: js.UndefOr[Arn] = js.undefined
}
object Approval {
  
  inline def apply(): Approval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Approval]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Approval] (val x: Self) extends AnyVal {
    
    inline def setApprovalState(value: ApprovalState): Self = StObject.set(x, "approvalState", value.asInstanceOf[js.Any])
    
    inline def setApprovalStateUndefined: Self = StObject.set(x, "approvalState", js.undefined)
    
    inline def setUserArn(value: Arn): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
    
    inline def setUserArnUndefined: Self = StObject.set(x, "userArn", js.undefined)
  }
}
