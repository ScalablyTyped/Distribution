package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateComputeEnvironmentRequest extends StObject {
  
  /**
    * The name for your compute environment. It can be up to 128 characters long. It can contain uppercase and lowercase letters, numbers, hyphens (-), and underscores (_).
    */
  var computeEnvironmentName: String
  
  /**
    * Details about the compute resources managed by the compute environment. This parameter is required for managed compute environments. For more information, see Compute Environments in the Batch User Guide.
    */
  var computeResources: js.UndefOr[ComputeResource] = js.undefined
  
  /**
    * The details for the Amazon EKS cluster that supports the compute environment.
    */
  var eksConfiguration: js.UndefOr[EksConfiguration] = js.undefined
  
  /**
    * The full Amazon Resource Name (ARN) of the IAM role that allows Batch to make calls to other Amazon Web Services services on your behalf. For more information, see Batch service IAM role in the Batch User Guide.  If your account already created the Batch service-linked role, that role is used by default for your compute environment unless you specify a different role here. If the Batch service-linked role doesn't exist in your account, and no role is specified here, the service attempts to create the Batch service-linked role in your account.  If your specified role has a path other than /, then you must specify either the full role ARN (recommended) or prefix the role name with the path. For example, if a role with the name bar has a path of /foo/, specify /foo/bar as the role name. For more information, see Friendly names and paths in the IAM User Guide.  Depending on how you created your Batch service role, its ARN might contain the service-role path prefix. When you only specify the name of the service role, Batch assumes that your ARN doesn't use the service-role path prefix. Because of this, we recommend that you specify the full ARN of your service role when you create compute environments. 
    */
  var serviceRole: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the compute environment. If the state is ENABLED, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. If the state is ENABLED, then the Batch scheduler can attempt to place jobs from an associated job queue on the compute resources within the environment. If the compute environment is managed, then it can scale its instances out or in automatically, based on the job queue demand. If the state is DISABLED, then the Batch scheduler doesn't attempt to place jobs within the environment. Jobs in a STARTING or RUNNING state continue to progress normally. Managed compute environments in the DISABLED state don't scale out.   Compute environments in a DISABLED state may continue to incur billing charges. To prevent additional charges, turn off and then delete the compute environment. For more information, see State in the Batch User Guide.  When an instance is idle, the instance scales down to the minvCpus value. However, the instance size doesn't change. For example, consider a c5.8xlarge instance with a minvCpus value of 4 and a desiredvCpus value of 36. This instance doesn't scale down to a c5.large instance.
    */
  var state: js.UndefOr[CEState] = js.undefined
  
  /**
    * The tags that you apply to the compute environment to help you categorize and organize your resources. Each tag consists of a key and an optional value. For more information, see Tagging Amazon Web Services Resources in Amazon Web Services General Reference. These tags can be updated or removed using the TagResource and UntagResource API operations. These tags don't propagate to the underlying compute resources.
    */
  var tags: js.UndefOr[TagrisTagsMap] = js.undefined
  
  /**
    * The type of the compute environment: MANAGED or UNMANAGED. For more information, see Compute Environments in the Batch User Guide.
    */
  var `type`: CEType
  
  /**
    * The maximum number of vCPUs for an unmanaged compute environment. This parameter is only used for fair share scheduling to reserve vCPU capacity for new share identifiers. If this parameter isn't provided for a fair share job queue, no vCPU capacity is reserved.  This parameter is only supported when the type parameter is set to UNMANAGED. 
    */
  var unmanagedvCpus: js.UndefOr[Integer] = js.undefined
}
object CreateComputeEnvironmentRequest {
  
  inline def apply(computeEnvironmentName: String, `type`: CEType): CreateComputeEnvironmentRequest = {
    val __obj = js.Dynamic.literal(computeEnvironmentName = computeEnvironmentName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateComputeEnvironmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateComputeEnvironmentRequest] (val x: Self) extends AnyVal {
    
    inline def setComputeEnvironmentName(value: String): Self = StObject.set(x, "computeEnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setComputeResources(value: ComputeResource): Self = StObject.set(x, "computeResources", value.asInstanceOf[js.Any])
    
    inline def setComputeResourcesUndefined: Self = StObject.set(x, "computeResources", js.undefined)
    
    inline def setEksConfiguration(value: EksConfiguration): Self = StObject.set(x, "eksConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEksConfigurationUndefined: Self = StObject.set(x, "eksConfiguration", js.undefined)
    
    inline def setServiceRole(value: String): Self = StObject.set(x, "serviceRole", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleUndefined: Self = StObject.set(x, "serviceRole", js.undefined)
    
    inline def setState(value: CEState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTags(value: TagrisTagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: CEType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnmanagedvCpus(value: Integer): Self = StObject.set(x, "unmanagedvCpus", value.asInstanceOf[js.Any])
    
    inline def setUnmanagedvCpusUndefined: Self = StObject.set(x, "unmanagedvCpus", js.undefined)
  }
}
