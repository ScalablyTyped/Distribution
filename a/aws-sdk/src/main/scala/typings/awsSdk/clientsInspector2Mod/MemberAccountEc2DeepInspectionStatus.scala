package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberAccountEc2DeepInspectionStatus extends StObject {
  
  /**
    * The unique identifier for the Amazon Web Services account of the organization member.
    */
  var accountId: AccountId
  
  /**
    * Whether Amazon Inspector deep inspection is active in the account. If TRUE Amazon Inspector deep inspection is active, if FALSE it is not active.
    */
  var activateDeepInspection: Boolean
}
object MemberAccountEc2DeepInspectionStatus {
  
  inline def apply(accountId: AccountId, activateDeepInspection: Boolean): MemberAccountEc2DeepInspectionStatus = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], activateDeepInspection = activateDeepInspection.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberAccountEc2DeepInspectionStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemberAccountEc2DeepInspectionStatus] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setActivateDeepInspection(value: Boolean): Self = StObject.set(x, "activateDeepInspection", value.asInstanceOf[js.Any])
  }
}
