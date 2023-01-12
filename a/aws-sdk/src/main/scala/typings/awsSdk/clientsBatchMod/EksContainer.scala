package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EksContainer extends StObject {
  
  /**
    * An array of arguments to the entrypoint. If this isn't specified, the CMD of the container image is used. This corresponds to the args member in the Entrypoint portion of the Pod in Kubernetes. Environment variable references are expanded using the container's environment. If the referenced environment variable doesn't exist, the reference in the command isn't changed. For example, if the reference is to "$(NAME1)" and the NAME1 environment variable doesn't exist, the command string will remain "$(NAME1)." $$ is replaced with $, and the resulting string isn't expanded. For example, $$(VAR_NAME) is passed as $(VAR_NAME) whether or not the VAR_NAME environment variable exists. For more information, see CMD in the Dockerfile reference and Define a command and arguments for a pod in the Kubernetes documentation.
    */
  var args: js.UndefOr[StringList] = js.undefined
  
  /**
    * The entrypoint for the container. This isn't run within a shell. If this isn't specified, the ENTRYPOINT of the container image is used. Environment variable references are expanded using the container's environment. If the referenced environment variable doesn't exist, the reference in the command isn't changed. For example, if the reference is to "$(NAME1)" and the NAME1 environment variable doesn't exist, the command string will remain "$(NAME1)." $$ is replaced with $ and the resulting string isn't expanded. For example, $$(VAR_NAME) will be passed as $(VAR_NAME) whether or not the VAR_NAME environment variable exists. The entrypoint can't be updated. For more information, see ENTRYPOINT in the Dockerfile reference and Define a command and arguments for a container and Entrypoint in the Kubernetes documentation.
    */
  var command: js.UndefOr[StringList] = js.undefined
  
  /**
    * The environment variables to pass to a container.  Environment variables cannot start with "AWS_BATCH". This naming convention is reserved for variables that Batch sets. 
    */
  var env: js.UndefOr[EksContainerEnvironmentVariables] = js.undefined
  
  /**
    * The Docker image used to start the container.
    */
  var image: String
  
  /**
    * The image pull policy for the container. Supported values are Always, IfNotPresent, and Never. This parameter defaults to IfNotPresent. However, if the :latest tag is specified, it defaults to Always. For more information, see Updating images in the Kubernetes documentation.
    */
  var imagePullPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the container. If the name isn't specified, the default name "Default" is used. Each container in a pod must have a unique name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The type and amount of resources to assign to a container. The supported resources include memory, cpu, and nvidia.com/gpu. For more information, see Resource management for pods and containers in the Kubernetes documentation.
    */
  var resources: js.UndefOr[EksContainerResourceRequirements] = js.undefined
  
  /**
    * The security context for a job. For more information, see Configure a security context for a pod or container in the Kubernetes documentation.
    */
  var securityContext: js.UndefOr[EksContainerSecurityContext] = js.undefined
  
  /**
    * The volume mounts for the container. Batch supports emptyDir, hostPath, and secret volume types. For more information about volumes and volume mounts in Kubernetes, see Volumes in the Kubernetes documentation.
    */
  var volumeMounts: js.UndefOr[EksContainerVolumeMounts] = js.undefined
}
object EksContainer {
  
  inline def apply(image: String): EksContainer = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[EksContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EksContainer] (val x: Self) extends AnyVal {
    
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
    
    inline def setImagePullPolicy(value: String): Self = StObject.set(x, "imagePullPolicy", value.asInstanceOf[js.Any])
    
    inline def setImagePullPolicyUndefined: Self = StObject.set(x, "imagePullPolicy", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResources(value: EksContainerResourceRequirements): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setSecurityContext(value: EksContainerSecurityContext): Self = StObject.set(x, "securityContext", value.asInstanceOf[js.Any])
    
    inline def setSecurityContextUndefined: Self = StObject.set(x, "securityContext", js.undefined)
    
    inline def setVolumeMounts(value: EksContainerVolumeMounts): Self = StObject.set(x, "volumeMounts", value.asInstanceOf[js.Any])
    
    inline def setVolumeMountsUndefined: Self = StObject.set(x, "volumeMounts", js.undefined)
    
    inline def setVolumeMountsVarargs(value: EksContainerVolumeMount*): Self = StObject.set(x, "volumeMounts", js.Array(value*))
  }
}
