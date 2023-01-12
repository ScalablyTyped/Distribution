package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  /**
    * The ID of the Amazon Web Services account.
    */
  var accountId: AccountId
  
  /**
    * Details of the status of Amazon Inspector scans by resource type.
    */
  var resourceStatus: ResourceStatus
  
  /**
    * The status of Amazon Inspector for the account.
    */
  var status: Status
}
object Account {
  
  inline def apply(accountId: AccountId, resourceStatus: ResourceStatus, status: Status): Account = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], resourceStatus = resourceStatus.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setResourceStatus(value: ResourceStatus): Self = StObject.set(x, "resourceStatus", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
