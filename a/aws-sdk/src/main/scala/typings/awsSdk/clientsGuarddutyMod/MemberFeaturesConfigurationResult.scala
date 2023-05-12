package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberFeaturesConfigurationResult extends StObject {
  
  /**
    * Indicates the additional configuration of the feature that is configured for the member account.
    */
  var AdditionalConfiguration: js.UndefOr[MemberAdditionalConfigurationResults] = js.undefined
  
  /**
    * Indicates the name of the feature that is enabled for the detector.
    */
  var Name: js.UndefOr[OrgFeature] = js.undefined
  
  /**
    * Indicates the status of the feature that is enabled for the detector.
    */
  var Status: js.UndefOr[FeatureStatus] = js.undefined
  
  /**
    * The timestamp at which the feature object was updated.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object MemberFeaturesConfigurationResult {
  
  inline def apply(): MemberFeaturesConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberFeaturesConfigurationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemberFeaturesConfigurationResult] (val x: Self) extends AnyVal {
    
    inline def setAdditionalConfiguration(value: MemberAdditionalConfigurationResults): Self = StObject.set(x, "AdditionalConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAdditionalConfigurationUndefined: Self = StObject.set(x, "AdditionalConfiguration", js.undefined)
    
    inline def setAdditionalConfigurationVarargs(value: MemberAdditionalConfigurationResult*): Self = StObject.set(x, "AdditionalConfiguration", js.Array(value*))
    
    inline def setName(value: OrgFeature): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: FeatureStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
