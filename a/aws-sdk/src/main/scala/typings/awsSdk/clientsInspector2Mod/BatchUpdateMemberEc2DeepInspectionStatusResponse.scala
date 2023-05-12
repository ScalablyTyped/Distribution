package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateMemberEc2DeepInspectionStatusResponse extends StObject {
  
  /**
    * An array of objects that provide details for each of the accounts that Amazon Inspector deep inspection status was successfully changed for. 
    */
  var accountIds: js.UndefOr[MemberAccountEc2DeepInspectionStatusStateList] = js.undefined
  
  /**
    * An array of objects that provide details for each of the accounts that Amazon Inspector deep inspection status could not be successfully changed for. 
    */
  var failedAccountIds: js.UndefOr[FailedMemberAccountEc2DeepInspectionStatusStateList] = js.undefined
}
object BatchUpdateMemberEc2DeepInspectionStatusResponse {
  
  inline def apply(): BatchUpdateMemberEc2DeepInspectionStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateMemberEc2DeepInspectionStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpdateMemberEc2DeepInspectionStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setAccountIds(value: MemberAccountEc2DeepInspectionStatusStateList): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: MemberAccountEc2DeepInspectionStatusState*): Self = StObject.set(x, "accountIds", js.Array(value*))
    
    inline def setFailedAccountIds(value: FailedMemberAccountEc2DeepInspectionStatusStateList): Self = StObject.set(x, "failedAccountIds", value.asInstanceOf[js.Any])
    
    inline def setFailedAccountIdsUndefined: Self = StObject.set(x, "failedAccountIds", js.undefined)
    
    inline def setFailedAccountIdsVarargs(value: FailedMemberAccountEc2DeepInspectionStatusState*): Self = StObject.set(x, "failedAccountIds", js.Array(value*))
  }
}
