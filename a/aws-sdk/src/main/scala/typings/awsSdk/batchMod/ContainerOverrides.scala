package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerOverrides extends StObject {
  
  /**
    * The command to send to the container that overrides the default command from the Docker image or the job definition.
    */
  var command: js.UndefOr[StringList] = js.undefined
  
  /**
    * The environment variables to send to the container. You can add new environment variables, which are added to the container at launch, or you can override the existing environment variables from the Docker image or the job definition.  Environment variables must not start with AWS_BATCH; this naming convention is reserved for variables that are set by the AWS Batch service. 
    */
  var environment: js.UndefOr[EnvironmentVariables] = js.undefined
  
  /**
    * The instance type to use for a multi-node parallel job. This parameter is not valid for single-node container jobs.
    */
  var instanceType: js.UndefOr[String] = js.undefined
  
  /**
    * The number of MiB of memory reserved for the job. This value overrides the value set in the job definition.
    */
  var memory: js.UndefOr[Integer] = js.undefined
  
  /**
    * The type and amount of a resource to assign to a container. This value overrides the value set in the job definition. Currently, the only supported resource is GPU.
    */
  var resourceRequirements: js.UndefOr[ResourceRequirements] = js.undefined
  
  /**
    * The number of vCPUs to reserve for the container. This value overrides the value set in the job definition.
    */
  var vcpus: js.UndefOr[Integer] = js.undefined
}
object ContainerOverrides {
  
  inline def apply(): ContainerOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerOverrides]
  }
  
  extension [Self <: ContainerOverrides](x: Self) {
    
    inline def setCommand(value: StringList): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setCommandVarargs(value: String*): Self = StObject.set(x, "command", js.Array(value :_*))
    
    inline def setEnvironment(value: EnvironmentVariables): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setEnvironmentVarargs(value: KeyValuePair*): Self = StObject.set(x, "environment", js.Array(value :_*))
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    inline def setMemory(value: Integer): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    
    inline def setResourceRequirements(value: ResourceRequirements): Self = StObject.set(x, "resourceRequirements", value.asInstanceOf[js.Any])
    
    inline def setResourceRequirementsUndefined: Self = StObject.set(x, "resourceRequirements", js.undefined)
    
    inline def setResourceRequirementsVarargs(value: ResourceRequirement*): Self = StObject.set(x, "resourceRequirements", js.Array(value :_*))
    
    inline def setVcpus(value: Integer): Self = StObject.set(x, "vcpus", value.asInstanceOf[js.Any])
    
    inline def setVcpusUndefined: Self = StObject.set(x, "vcpus", js.undefined)
  }
}
