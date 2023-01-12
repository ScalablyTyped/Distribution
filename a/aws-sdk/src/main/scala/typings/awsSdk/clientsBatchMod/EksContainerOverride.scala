package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EksContainerOverride extends StObject {
  
  /**
    * The arguments to the entrypoint to send to the container that overrides the default arguments from the Docker image or the job definition. For more information, see CMD in the Dockerfile reference and Define a command an arguments for a pod in the Kubernetes documentation.
    */
  var args: js.UndefOr[StringList] = js.undefined
  
  /**
    * The command to send to the container that overrides the default command from the Docker image or the job definition.
    */
  var command: js.UndefOr[StringList] = js.undefined
  
  /**
    * The environment variables to send to the container. You can add new environment variables, which are added to the container at launch. Or, you can override the existing environment variables from the Docker image or the job definition.  Environment variables cannot start with "AWS_BATCH". This naming convention is reserved for variables that Batch sets. 
    */
  var env: js.UndefOr[EksContainerEnvironmentVariables] = js.undefined
  
  /**
    * The override of the Docker image that's used to start the container.
    */
  var image: js.UndefOr[String] = js.undefined
  
  /**
    * The type and amount of resources to assign to a container. These override the settings in the job definition. The supported resources include memory, cpu, and nvidia.com/gpu. For more information, see Resource management for pods and containers in the Kubernetes documentation.
    */
  var resources: js.UndefOr[EksContainerResourceRequirements] = js.undefined
}
object EksContainerOverride {
  
  inline def apply(): EksContainerOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EksContainerOverride]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EksContainerOverride] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: StringList): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setCommand(value: StringList): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setCommandVarargs(value: String*): Self = StObject.set(x, "command", js.Array(value*))
    
    inline def setEnv(value: EksContainerEnvironmentVariables): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setEnvVarargs(value: EksContainerEnvironmentVariable*): Self = StObject.set(x, "env", js.Array(value*))
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setResources(value: EksContainerResourceRequirements): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
  }
}
