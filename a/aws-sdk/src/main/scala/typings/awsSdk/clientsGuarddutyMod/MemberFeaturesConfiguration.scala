package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberFeaturesConfiguration extends StObject {
  
  /**
    * Additional configuration of the feature for the member account.
    */
  var AdditionalConfiguration: js.UndefOr[MemberAdditionalConfigurations] = js.undefined
  
  /**
    * The name of the feature.
    */
  var Name: js.UndefOr[OrgFeature] = js.undefined
  
  /**
    * The status of the feature.
    */
  var Status: js.UndefOr[FeatureStatus] = js.undefined
}
object MemberFeaturesConfiguration {
  
  inline def apply(): MemberFeaturesConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberFeaturesConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemberFeaturesConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAdditionalConfiguration(value: MemberAdditionalConfigurations): Self = StObject.set(x, "AdditionalConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAdditionalConfigurationUndefined: Self = StObject.set(x, "AdditionalConfiguration", js.undefined)
    
    inline def setAdditionalConfigurationVarargs(value: MemberAdditionalConfiguration*): Self = StObject.set(x, "AdditionalConfiguration", js.Array(value*))
    
    inline def setName(value: OrgFeature): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: FeatureStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
