package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationFeatureConfiguration extends StObject {
  
  /**
    * The additional information that will be configured for the organization.
    */
  var AdditionalConfiguration: js.UndefOr[OrganizationAdditionalConfigurations] = js.undefined
  
  /**
    * The status of the feature that will be configured for the organization.
    */
  var AutoEnable: js.UndefOr[OrgFeatureStatus] = js.undefined
  
  /**
    * The name of the feature that will be configured for the organization.
    */
  var Name: js.UndefOr[OrgFeature] = js.undefined
}
object OrganizationFeatureConfiguration {
  
  inline def apply(): OrganizationFeatureConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationFeatureConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationFeatureConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAdditionalConfiguration(value: OrganizationAdditionalConfigurations): Self = StObject.set(x, "AdditionalConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAdditionalConfigurationUndefined: Self = StObject.set(x, "AdditionalConfiguration", js.undefined)
    
    inline def setAdditionalConfigurationVarargs(value: OrganizationAdditionalConfiguration*): Self = StObject.set(x, "AdditionalConfiguration", js.Array(value*))
    
    inline def setAutoEnable(value: OrgFeatureStatus): Self = StObject.set(x, "AutoEnable", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableUndefined: Self = StObject.set(x, "AutoEnable", js.undefined)
    
    inline def setName(value: OrgFeature): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
