package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageConfiguration extends StObject {
  
  /**
    * The port that your application listens to in the container. Default: 8080 
    */
  var Port: js.UndefOr[String] = js.undefined
  
  /**
    * An array of key-value pairs representing the secrets and parameters that get referenced to your service as an environment variable. The supported values are either the full Amazon Resource Name (ARN) of the Secrets Manager secret or the full ARN of the parameter in the Amazon Web Services Systems Manager Parameter Store.     If the Amazon Web Services Systems Manager Parameter Store parameter exists in the same Amazon Web Services Region as the service that you're launching, you can use either the full ARN or name of the secret. If the parameter exists in a different Region, then the full ARN must be specified.     Currently, cross account referencing of Amazon Web Services Systems Manager Parameter Store parameter is not supported.    
    */
  var RuntimeEnvironmentSecrets: js.UndefOr[typings.awsSdk.clientsApprunnerMod.RuntimeEnvironmentSecrets] = js.undefined
  
  /**
    * Environment variables that are available to your running App Runner service. An array of key-value pairs.
    */
  var RuntimeEnvironmentVariables: js.UndefOr[typings.awsSdk.clientsApprunnerMod.RuntimeEnvironmentVariables] = js.undefined
  
  /**
    * An optional command that App Runner runs to start the application in the source image. If specified, this command overrides the Docker image’s default start command.
    */
  var StartCommand: js.UndefOr[typings.awsSdk.clientsApprunnerMod.StartCommand] = js.undefined
}
object ImageConfiguration {
  
  inline def apply(): ImageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageConfiguration] (val x: Self) extends AnyVal {
    
    inline def setPort(value: String): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setRuntimeEnvironmentSecrets(value: RuntimeEnvironmentSecrets): Self = StObject.set(x, "RuntimeEnvironmentSecrets", value.asInstanceOf[js.Any])
    
    inline def setRuntimeEnvironmentSecretsUndefined: Self = StObject.set(x, "RuntimeEnvironmentSecrets", js.undefined)
    
    inline def setRuntimeEnvironmentVariables(value: RuntimeEnvironmentVariables): Self = StObject.set(x, "RuntimeEnvironmentVariables", value.asInstanceOf[js.Any])
    
    inline def setRuntimeEnvironmentVariablesUndefined: Self = StObject.set(x, "RuntimeEnvironmentVariables", js.undefined)
    
    inline def setStartCommand(value: StartCommand): Self = StObject.set(x, "StartCommand", value.asInstanceOf[js.Any])
    
    inline def setStartCommandUndefined: Self = StObject.set(x, "StartCommand", js.undefined)
  }
}
