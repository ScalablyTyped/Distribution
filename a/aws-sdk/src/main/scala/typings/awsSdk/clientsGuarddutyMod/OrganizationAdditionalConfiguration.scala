package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationAdditionalConfiguration extends StObject {
  
  /**
    * The status of the additional configuration that will be configured for the organization.
    */
  var AutoEnable: js.UndefOr[OrgFeatureStatus] = js.undefined
  
  /**
    * The name of the additional configuration that will be configured for the organization.
    */
  var Name: js.UndefOr[OrgFeatureAdditionalConfiguration] = js.undefined
}
object OrganizationAdditionalConfiguration {
  
  inline def apply(): OrganizationAdditionalConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationAdditionalConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationAdditionalConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAutoEnable(value: OrgFeatureStatus): Self = StObject.set(x, "AutoEnable", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableUndefined: Self = StObject.set(x, "AutoEnable", js.undefined)
    
    inline def setName(value: OrgFeatureAdditionalConfiguration): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
