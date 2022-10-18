package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsClusterClusterSettingsDetails extends StObject {
  
  /**
    * The name of the setting. The valid value is containerInsights.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The value of the setting. Valid values are disabled or enabled.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsClusterClusterSettingsDetails {
  
  inline def apply(): AwsEcsClusterClusterSettingsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsClusterClusterSettingsDetails]
  }
  
  extension [Self <: AwsEcsClusterClusterSettingsDetails](x: Self) {
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
