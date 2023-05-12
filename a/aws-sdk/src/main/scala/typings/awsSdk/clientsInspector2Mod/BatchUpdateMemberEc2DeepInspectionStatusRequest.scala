package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateMemberEc2DeepInspectionStatusRequest extends StObject {
  
  /**
    * The unique identifiers for the Amazon Web Services accounts to change Amazon Inspector deep inspection status for.
    */
  var accountIds: MemberAccountEc2DeepInspectionStatusList
}
object BatchUpdateMemberEc2DeepInspectionStatusRequest {
  
  inline def apply(accountIds: MemberAccountEc2DeepInspectionStatusList): BatchUpdateMemberEc2DeepInspectionStatusRequest = {
    val __obj = js.Dynamic.literal(accountIds = accountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateMemberEc2DeepInspectionStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpdateMemberEc2DeepInspectionStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountIds(value: MemberAccountEc2DeepInspectionStatusList): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsVarargs(value: MemberAccountEc2DeepInspectionStatus*): Self = StObject.set(x, "accountIds", js.Array(value*))
  }
}
