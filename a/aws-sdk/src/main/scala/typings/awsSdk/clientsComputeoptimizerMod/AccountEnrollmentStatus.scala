package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountEnrollmentStatus extends StObject {
  
  /**
    * The Amazon Web Services account ID.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The Unix epoch timestamp, in seconds, of when the account enrollment status was last updated.
    */
  var lastUpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The account enrollment status.
    */
  var status: js.UndefOr[Status] = js.undefined
  
  /**
    * The reason for the account enrollment status. For example, an account might show a status of Pending because member accounts of an organization require more time to be enrolled in the service.
    */
  var statusReason: js.UndefOr[StatusReason] = js.undefined
}
object AccountEnrollmentStatus {
  
  inline def apply(): AccountEnrollmentStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountEnrollmentStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountEnrollmentStatus] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "lastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "lastUpdatedTimestamp", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: StatusReason): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
