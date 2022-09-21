package typings.awsSdk.apprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeConfigurationValues extends StObject {
  
  /**
    * The command App Runner runs to build your application.
    */
  var BuildCommand: js.UndefOr[typings.awsSdk.apprunnerMod.BuildCommand] = js.undefined
  
  /**
    * The port that your application listens to in the container. Default: 8080 
    */
  var Port: js.UndefOr[String] = js.undefined
  
  /**
    * A runtime environment type for building and running an App Runner service. It represents a programming language runtime.
    */
  var Runtime: typings.awsSdk.apprunnerMod.Runtime
  
  /**
    * The environment variables that are available to your running App Runner service. An array of key-value pairs. Keys with a prefix of AWSAPPRUNNER are reserved for system use and aren't valid.
    */
  var RuntimeEnvironmentVariables: js.UndefOr[typings.awsSdk.apprunnerMod.RuntimeEnvironmentVariables] = js.undefined
  
  /**
    * The command App Runner runs to start your application.
    */
  var StartCommand: js.UndefOr[typings.awsSdk.apprunnerMod.StartCommand] = js.undefined
}
object CodeConfigurationValues {
  
  inline def apply(Runtime: Runtime): CodeConfigurationValues = {
    val __obj = js.Dynamic.literal(Runtime = Runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeConfigurationValues]
  }
  
  extension [Self <: CodeConfigurationValues](x: Self) {
    
    inline def setBuildCommand(value: BuildCommand): Self = StObject.set(x, "BuildCommand", value.asInstanceOf[js.Any])
    
    inline def setBuildCommandUndefined: Self = StObject.set(x, "BuildCommand", js.undefined)
    
    inline def setPort(value: String): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setRuntime(value: Runtime): Self = StObject.set(x, "Runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeEnvironmentVariables(value: RuntimeEnvironmentVariables): Self = StObject.set(x, "RuntimeEnvironmentVariables", value.asInstanceOf[js.Any])
    
    inline def setRuntimeEnvironmentVariablesUndefined: Self = StObject.set(x, "RuntimeEnvironmentVariables", js.undefined)
    
    inline def setStartCommand(value: StartCommand): Self = StObject.set(x, "StartCommand", value.asInstanceOf[js.Any])
    
    inline def setStartCommandUndefined: Self = StObject.set(x, "StartCommand", js.undefined)
  }
}
