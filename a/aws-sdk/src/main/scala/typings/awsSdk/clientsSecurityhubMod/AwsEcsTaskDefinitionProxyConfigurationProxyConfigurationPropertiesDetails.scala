package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionProxyConfigurationProxyConfigurationPropertiesDetails extends StObject {
  
  /**
    * The name of the property.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The value of the property.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsTaskDefinitionProxyConfigurationProxyConfigurationPropertiesDetails {
  
  inline def apply(): AwsEcsTaskDefinitionProxyConfigurationProxyConfigurationPropertiesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionProxyConfigurationProxyConfigurationPropertiesDetails]
  }
  
  extension [Self <: AwsEcsTaskDefinitionProxyConfigurationProxyConfigurationPropertiesDetails](x: Self) {
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
