package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOrganizationConfigurationRequest extends StObject {
  
  /**
    * Indicates whether to automatically enable member accounts in the organization. Even though this is still supported, we recommend using AutoEnableOrganizationMembers to achieve the similar results.
    */
  var AutoEnable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates the auto-enablement configuration of GuardDuty for the member accounts in the organization.     NEW: Indicates that when a new account joins the organization, they will have GuardDuty enabled automatically.     ALL: Indicates that all accounts in the Amazon Web Services Organization have GuardDuty enabled automatically. This includes NEW accounts that join the organization and accounts that may have been suspended or removed from the organization in GuardDuty.    NONE: Indicates that GuardDuty will not be automatically enabled for any accounts in the organization. GuardDuty must be managed for each account individually by the administrator.  
    */
  var AutoEnableOrganizationMembers: js.UndefOr[AutoEnableMembers] = js.undefined
  
  /**
    * Describes which data sources will be updated.
    */
  var DataSources: js.UndefOr[OrganizationDataSourceConfigurations] = js.undefined
  
  /**
    * The ID of the detector that configures the delegated administrator.
    */
  var DetectorId: typings.awsSdk.clientsGuarddutyMod.DetectorId
  
  /**
    * A list of features that will be configured for the organization.
    */
  var Features: js.UndefOr[OrganizationFeaturesConfigurations] = js.undefined
}
object UpdateOrganizationConfigurationRequest {
  
  inline def apply(DetectorId: DetectorId): UpdateOrganizationConfigurationRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOrganizationConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateOrganizationConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setAutoEnable(value: Boolean): Self = StObject.set(x, "AutoEnable", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableOrganizationMembers(value: AutoEnableMembers): Self = StObject.set(x, "AutoEnableOrganizationMembers", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableOrganizationMembersUndefined: Self = StObject.set(x, "AutoEnableOrganizationMembers", js.undefined)
    
    inline def setAutoEnableUndefined: Self = StObject.set(x, "AutoEnable", js.undefined)
    
    inline def setDataSources(value: OrganizationDataSourceConfigurations): Self = StObject.set(x, "DataSources", value.asInstanceOf[js.Any])
    
    inline def setDataSourcesUndefined: Self = StObject.set(x, "DataSources", js.undefined)
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    inline def setFeatures(value: OrganizationFeaturesConfigurations): Self = StObject.set(x, "Features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "Features", js.undefined)
    
    inline def setFeaturesVarargs(value: OrganizationFeatureConfiguration*): Self = StObject.set(x, "Features", js.Array(value*))
  }
}
