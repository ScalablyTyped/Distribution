package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchContainerOverrides extends StObject {
  
  /**
    * The command to send to the container that overrides the default command from the Docker image or the task definition.
    */
  var Command: js.UndefOr[StringList] = js.undefined
  
  /**
    * The environment variables to send to the container. You can add new environment variables, which are added to the container at launch, or you can override the existing environment variables from the Docker image or the task definition.  Environment variables cannot start with "Batch". This naming convention is reserved for variables that Batch sets. 
    */
  var Environment: js.UndefOr[BatchEnvironmentVariableList] = js.undefined
  
  /**
    * The instance type to use for a multi-node parallel job.  This parameter isn't applicable to single-node container jobs or jobs that run on Fargate resources, and shouldn't be provided. 
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  
  /**
    * The type and amount of resources to assign to a container. This overrides the settings in the job definition. The supported resources include GPU, MEMORY, and VCPU.
    */
  var ResourceRequirements: js.UndefOr[BatchResourceRequirementsList] = js.undefined
}
object BatchContainerOverrides {
  
  inline def apply(): BatchContainerOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchContainerOverrides]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchContainerOverrides] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: StringList): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "Command", js.undefined)
    
    inline def setCommandVarargs(value: String*): Self = StObject.set(x, "Command", js.Array(value*))
    
    inline def setEnvironment(value: BatchEnvironmentVariableList): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    inline def setEnvironmentVarargs(value: BatchEnvironmentVariable*): Self = StObject.set(x, "Environment", js.Array(value*))
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setResourceRequirements(value: BatchResourceRequirementsList): Self = StObject.set(x, "ResourceRequirements", value.asInstanceOf[js.Any])
    
    inline def setResourceRequirementsUndefined: Self = StObject.set(x, "ResourceRequirements", js.undefined)
    
    inline def setResourceRequirementsVarargs(value: BatchResourceRequirement*): Self = StObject.set(x, "ResourceRequirements", js.Array(value*))
  }
}
