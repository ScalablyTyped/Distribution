package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountStatus extends StObject {
  
  /**
    * The ID of an account within the Amazon Web Services Organization.
    */
  var AccountId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.AccountId] = js.undefined
  
  /**
    * The status of SLR deployment for the account.
    */
  var SLRDeploymentStatus: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.SLRDeploymentStatus] = js.undefined
}
object AccountStatus {
  
  inline def apply(): AccountStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountStatus] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setSLRDeploymentStatus(value: SLRDeploymentStatus): Self = StObject.set(x, "SLRDeploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setSLRDeploymentStatusUndefined: Self = StObject.set(x, "SLRDeploymentStatus", js.undefined)
  }
}
