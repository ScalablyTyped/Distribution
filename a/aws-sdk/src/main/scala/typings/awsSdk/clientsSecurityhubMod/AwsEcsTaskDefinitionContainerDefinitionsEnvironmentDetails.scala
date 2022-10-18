package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionContainerDefinitionsEnvironmentDetails extends StObject {
  
  /**
    * The name of the environment variable.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The value of the environment variable.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsTaskDefinitionContainerDefinitionsEnvironmentDetails {
  
  inline def apply(): AwsEcsTaskDefinitionContainerDefinitionsEnvironmentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsEnvironmentDetails]
  }
  
  extension [Self <: AwsEcsTaskDefinitionContainerDefinitionsEnvironmentDetails](x: Self) {
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
