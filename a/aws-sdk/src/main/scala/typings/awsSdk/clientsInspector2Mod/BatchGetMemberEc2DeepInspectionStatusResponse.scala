package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetMemberEc2DeepInspectionStatusResponse extends StObject {
  
  /**
    * An array of objects that provide details on the activation status of Amazon Inspector deep inspection for each of the requested accounts.  &lt;/p&gt; 
    */
  var accountIds: js.UndefOr[MemberAccountEc2DeepInspectionStatusStateList] = js.undefined
  
  /**
    * An array of objects that provide details on any accounts that failed to activate Amazon Inspector deep inspection and why.  &lt;/p&gt; 
    */
  var failedAccountIds: js.UndefOr[FailedMemberAccountEc2DeepInspectionStatusStateList] = js.undefined
}
object BatchGetMemberEc2DeepInspectionStatusResponse {
  
  inline def apply(): BatchGetMemberEc2DeepInspectionStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetMemberEc2DeepInspectionStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetMemberEc2DeepInspectionStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setAccountIds(value: MemberAccountEc2DeepInspectionStatusStateList): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: MemberAccountEc2DeepInspectionStatusState*): Self = StObject.set(x, "accountIds", js.Array(value*))
    
    inline def setFailedAccountIds(value: FailedMemberAccountEc2DeepInspectionStatusStateList): Self = StObject.set(x, "failedAccountIds", value.asInstanceOf[js.Any])
    
    inline def setFailedAccountIdsUndefined: Self = StObject.set(x, "failedAccountIds", js.undefined)
    
    inline def setFailedAccountIdsVarargs(value: FailedMemberAccountEc2DeepInspectionStatusState*): Self = StObject.set(x, "failedAccountIds", js.Array(value*))
  }
}
