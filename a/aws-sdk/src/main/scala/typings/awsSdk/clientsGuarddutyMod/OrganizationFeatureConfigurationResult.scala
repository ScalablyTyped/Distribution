package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationFeatureConfigurationResult extends StObject {
  
  /**
    * The additional configuration that is configured for the member accounts within the organization.
    */
  var AdditionalConfiguration: js.UndefOr[OrganizationAdditionalConfigurationResults] = js.undefined
  
  /**
    * Describes how The status of the feature that are configured for the member accounts within the organization. If you set AutoEnable to NEW, a feature will be configured for only the new accounts when they join the organization. If you set AutoEnable to NONE, no feature will be configured for the accounts when they join the organization.
    */
  var AutoEnable: js.UndefOr[OrgFeatureStatus] = js.undefined
  
  /**
    * The name of the feature that is configured for the member accounts within the organization.
    */
  var Name: js.UndefOr[OrgFeature] = js.undefined
}
object OrganizationFeatureConfigurationResult {
  
  inline def apply(): OrganizationFeatureConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationFeatureConfigurationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationFeatureConfigurationResult] (val x: Self) extends AnyVal {
    
    inline def setAdditionalConfiguration(value: OrganizationAdditionalConfigurationResults): Self = StObject.set(x, "AdditionalConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAdditionalConfigurationUndefined: Self = StObject.set(x, "AdditionalConfiguration", js.undefined)
    
    inline def setAdditionalConfigurationVarargs(value: OrganizationAdditionalConfigurationResult*): Self = StObject.set(x, "AdditionalConfiguration", js.Array(value*))
    
    inline def setAutoEnable(value: OrgFeatureStatus): Self = StObject.set(x, "AutoEnable", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableUndefined: Self = StObject.set(x, "AutoEnable", js.undefined)
    
    inline def setName(value: OrgFeature): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
