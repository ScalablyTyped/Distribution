package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationAdditionalConfigurationResult extends StObject {
  
  /**
    * Describes how The status of the additional configuration that are configured for the member accounts within the organization. If you set AutoEnable to NEW, a feature will be configured for only the new accounts when they join the organization. If you set AutoEnable to NONE, no feature will be configured for the accounts when they join the organization.
    */
  var AutoEnable: js.UndefOr[OrgFeatureStatus] = js.undefined
  
  /**
    * The name of the additional configuration that is configured for the member accounts within the organization.
    */
  var Name: js.UndefOr[OrgFeatureAdditionalConfiguration] = js.undefined
}
object OrganizationAdditionalConfigurationResult {
  
  inline def apply(): OrganizationAdditionalConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationAdditionalConfigurationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationAdditionalConfigurationResult] (val x: Self) extends AnyVal {
    
    inline def setAutoEnable(value: OrgFeatureStatus): Self = StObject.set(x, "AutoEnable", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableUndefined: Self = StObject.set(x, "AutoEnable", js.undefined)
    
    inline def setName(value: OrgFeatureAdditionalConfiguration): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
