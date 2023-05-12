package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcsContainerOverride extends StObject {
  
  /**
    * The command to send to the container that overrides the default command from the Docker image or the task definition. You must also specify a container name.
    */
  var Command: js.UndefOr[StringList] = js.undefined
  
  /**
    * The number of cpu units reserved for the container, instead of the default value from the task definition. You must also specify a container name.
    */
  var Cpu: js.UndefOr[Integer] = js.undefined
  
  /**
    * The environment variables to send to the container. You can add new environment variables, which are added to the container at launch, or you can override the existing environment variables from the Docker image or the task definition. You must also specify a container name.
    */
  var Environment: js.UndefOr[EcsEnvironmentVariableList] = js.undefined
  
  /**
    * A list of files containing the environment variables to pass to a container, instead of the value from the container definition.
    */
  var EnvironmentFiles: js.UndefOr[EcsEnvironmentFileList] = js.undefined
  
  /**
    * The hard limit (in MiB) of memory to present to the container, instead of the default value from the task definition. If your container attempts to exceed the memory specified here, the container is killed. You must also specify a container name.
    */
  var Memory: js.UndefOr[Integer] = js.undefined
  
  /**
    * The soft limit (in MiB) of memory to reserve for the container, instead of the default value from the task definition. You must also specify a container name.
    */
  var MemoryReservation: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the container that receives the override. This parameter is required if any override is specified.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The type and amount of a resource to assign to a container, instead of the default value from the task definition. The only supported resource is a GPU.
    */
  var ResourceRequirements: js.UndefOr[EcsResourceRequirementsList] = js.undefined
}
object EcsContainerOverride {
  
  inline def apply(): EcsContainerOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EcsContainerOverride]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EcsContainerOverride] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: StringList): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "Command", js.undefined)
    
    inline def setCommandVarargs(value: String*): Self = StObject.set(x, "Command", js.Array(value*))
    
    inline def setCpu(value: Integer): Self = StObject.set(x, "Cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuUndefined: Self = StObject.set(x, "Cpu", js.undefined)
    
    inline def setEnvironment(value: EcsEnvironmentVariableList): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentFiles(value: EcsEnvironmentFileList): Self = StObject.set(x, "EnvironmentFiles", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentFilesUndefined: Self = StObject.set(x, "EnvironmentFiles", js.undefined)
    
    inline def setEnvironmentFilesVarargs(value: EcsEnvironmentFile*): Self = StObject.set(x, "EnvironmentFiles", js.Array(value*))
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    inline def setEnvironmentVarargs(value: EcsEnvironmentVariable*): Self = StObject.set(x, "Environment", js.Array(value*))
    
    inline def setMemory(value: Integer): Self = StObject.set(x, "Memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryReservation(value: Integer): Self = StObject.set(x, "MemoryReservation", value.asInstanceOf[js.Any])
    
    inline def setMemoryReservationUndefined: Self = StObject.set(x, "MemoryReservation", js.undefined)
    
    inline def setMemoryUndefined: Self = StObject.set(x, "Memory", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setResourceRequirements(value: EcsResourceRequirementsList): Self = StObject.set(x, "ResourceRequirements", value.asInstanceOf[js.Any])
    
    inline def setResourceRequirementsUndefined: Self = StObject.set(x, "ResourceRequirements", js.undefined)
    
    inline def setResourceRequirementsVarargs(value: EcsResourceRequirement*): Self = StObject.set(x, "ResourceRequirements", js.Array(value*))
  }
}
