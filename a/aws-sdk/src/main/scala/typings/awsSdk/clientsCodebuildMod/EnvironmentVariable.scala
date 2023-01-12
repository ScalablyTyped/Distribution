package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentVariable extends StObject {
  
  /**
    * The name or key of the environment variable.
    */
  var name: NonEmptyString
  
  /**
    * The type of environment variable. Valid values include:    PARAMETER_STORE: An environment variable stored in Systems Manager Parameter Store. To learn how to specify a parameter store environment variable, see env/parameter-store in the CodeBuild User Guide.    PLAINTEXT: An environment variable in plain text format. This is the default value.    SECRETS_MANAGER: An environment variable stored in Secrets Manager. To learn how to specify a secrets manager environment variable, see env/secrets-manager in the CodeBuild User Guide.  
    */
  var `type`: js.UndefOr[EnvironmentVariableType] = js.undefined
  
  /**
    * The value of the environment variable.  We strongly discourage the use of PLAINTEXT environment variables to store sensitive values, especially Amazon Web Services secret key IDs and secret access keys. PLAINTEXT environment variables can be displayed in plain text using the CodeBuild console and the CLI. For sensitive values, we recommend you use an environment variable of type PARAMETER_STORE or SECRETS_MANAGER.  
    */
  var value: String
}
object EnvironmentVariable {
  
  inline def apply(name: NonEmptyString, value: String): EnvironmentVariable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentVariable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvironmentVariable] (val x: Self) extends AnyVal {
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: EnvironmentVariableType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
