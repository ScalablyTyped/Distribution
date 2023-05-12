package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetMemberEc2DeepInspectionStatusRequest extends StObject {
  
  /**
    * The unique identifiers for the Amazon Web Services accounts to retrieve Amazon Inspector deep inspection activation status for.  &lt;/p&gt; 
    */
  var accountIds: js.UndefOr[AccountIdSet] = js.undefined
}
object BatchGetMemberEc2DeepInspectionStatusRequest {
  
  inline def apply(): BatchGetMemberEc2DeepInspectionStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetMemberEc2DeepInspectionStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetMemberEc2DeepInspectionStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountIds(value: AccountIdSet): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "accountIds", js.Array(value*))
  }
}
