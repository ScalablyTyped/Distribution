package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOrganizationConfigurationRequest extends StObject {
  
  /**
    * Indicates whether to automatically enable member accounts in the organization.
    */
  var AutoEnable: Boolean
  
  /**
    * Describes which data sources will be updated.
    */
  var DataSources: js.UndefOr[OrganizationDataSourceConfigurations] = js.undefined
  
  /**
    * The ID of the detector to update the delegated administrator for.
    */
  var DetectorId: typings.awsSdk.clientsGuarddutyMod.DetectorId
}
object UpdateOrganizationConfigurationRequest {
  
  inline def apply(AutoEnable: Boolean, DetectorId: DetectorId): UpdateOrganizationConfigurationRequest = {
    val __obj = js.Dynamic.literal(AutoEnable = AutoEnable.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOrganizationConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateOrganizationConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setAutoEnable(value: Boolean): Self = StObject.set(x, "AutoEnable", value.asInstanceOf[js.Any])
    
    inline def setDataSources(value: OrganizationDataSourceConfigurations): Self = StObject.set(x, "DataSources", value.asInstanceOf[js.Any])
    
    inline def setDataSourcesUndefined: Self = StObject.set(x, "DataSources", js.undefined)
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
