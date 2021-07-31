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
  
  @scala.inline
  def apply(): ContainerOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerOverrides]
  }
  
  @scala.inline
  implicit class ContainerOverridesMutableBuilder[Self <: ContainerOverrides] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: StringList): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setCommandVarargs(value: String*): Self = StObject.set(x, "command", js.Array(value :_*))
    
    @scala.inline
    def setEnvironment(value: EnvironmentVariables): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setEnvironmentVarargs(value: KeyValuePair*): Self = StObject.set(x, "environment", js.Array(value :_*))
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    @scala.inline
    def setMemory(value: Integer): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    
    @scala.inline
    def setResourceRequirements(value: ResourceRequirements): Self = StObject.set(x, "resourceRequirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceRequirementsUndefined: Self = StObject.set(x, "resourceRequirements", js.undefined)
    
    @scala.inline
    def setResourceRequirementsVarargs(value: ResourceRequirement*): Self = StObject.set(x, "resourceRequirements", js.Array(value :_*))
    
    @scala.inline
    def setVcpus(value: Integer): Self = StObject.set(x, "vcpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVcpusUndefined: Self = StObject.set(x, "vcpus", js.undefined)
  }
}
