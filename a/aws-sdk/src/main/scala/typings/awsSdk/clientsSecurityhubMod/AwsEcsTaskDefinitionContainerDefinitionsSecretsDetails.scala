package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionContainerDefinitionsSecretsDetails extends StObject {
  
  /**
    * The name of the secret.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The secret to expose to the container. The value is either the full ARN of the Secrets Manager secret or the full ARN of the parameter in the Systems Manager Parameter Store.
    */
  var ValueFrom: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsTaskDefinitionContainerDefinitionsSecretsDetails {
  
  inline def apply(): AwsEcsTaskDefinitionContainerDefinitionsSecretsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsSecretsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEcsTaskDefinitionContainerDefinitionsSecretsDetails] (val x: Self) extends AnyVal {
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValueFrom(value: NonEmptyString): Self = StObject.set(x, "ValueFrom", value.asInstanceOf[js.Any])
    
    inline def setValueFromUndefined: Self = StObject.set(x, "ValueFrom", js.undefined)
  }
}
