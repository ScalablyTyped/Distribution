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
    * Environment variables that are available to your running App Runner service. An array of key-value pairs. Keys with a prefix of AWSAPPRUNNER are reserved for system use and aren't valid.
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
  
  extension [Self <: ImageConfiguration](x: Self) {
    
    inline def setPort(value: String): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setRuntimeEnvironmentVariables(value: RuntimeEnvironmentVariables): Self = StObject.set(x, "RuntimeEnvironmentVariables", value.asInstanceOf[js.Any])
    
    inline def setRuntimeEnvironmentVariablesUndefined: Self = StObject.set(x, "RuntimeEnvironmentVariables", js.undefined)
    
    inline def setStartCommand(value: StartCommand): Self = StObject.set(x, "StartCommand", value.asInstanceOf[js.Any])
    
    inline def setStartCommandUndefined: Self = StObject.set(x, "StartCommand", js.undefined)
  }
}
