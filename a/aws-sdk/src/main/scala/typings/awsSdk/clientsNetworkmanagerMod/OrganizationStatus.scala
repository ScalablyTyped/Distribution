package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationStatus extends StObject {
  
  /**
    * The current service-linked role (SLR) deployment status for an Amazon Web Services Organization's accounts. This will be either SUCCEEDED or IN_PROGRESS.
    */
  var AccountStatusList: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.AccountStatusList] = js.undefined
  
  /**
    * The status of the organization's AWS service access. This will be ENABLED or DISABLED.
    */
  var OrganizationAwsServiceAccessStatus: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.OrganizationAwsServiceAccessStatus] = js.undefined
  
  /**
    * The ID of an Amazon Web Services Organization.
    */
  var OrganizationId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.OrganizationId] = js.undefined
  
  /**
    * The status of the SLR deployment for the account. This will be either SUCCEEDED or IN_PROGRESS.
    */
  var SLRDeploymentStatus: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.SLRDeploymentStatus] = js.undefined
}
object OrganizationStatus {
  
  inline def apply(): OrganizationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationStatus] (val x: Self) extends AnyVal {
    
    inline def setAccountStatusList(value: AccountStatusList): Self = StObject.set(x, "AccountStatusList", value.asInstanceOf[js.Any])
    
    inline def setAccountStatusListUndefined: Self = StObject.set(x, "AccountStatusList", js.undefined)
    
    inline def setAccountStatusListVarargs(value: AccountStatus*): Self = StObject.set(x, "AccountStatusList", js.Array(value*))
    
    inline def setOrganizationAwsServiceAccessStatus(value: OrganizationAwsServiceAccessStatus): Self = StObject.set(x, "OrganizationAwsServiceAccessStatus", value.asInstanceOf[js.Any])
    
    inline def setOrganizationAwsServiceAccessStatusUndefined: Self = StObject.set(x, "OrganizationAwsServiceAccessStatus", js.undefined)
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationIdUndefined: Self = StObject.set(x, "OrganizationId", js.undefined)
    
    inline def setSLRDeploymentStatus(value: SLRDeploymentStatus): Self = StObject.set(x, "SLRDeploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setSLRDeploymentStatusUndefined: Self = StObject.set(x, "SLRDeploymentStatus", js.undefined)
  }
}
