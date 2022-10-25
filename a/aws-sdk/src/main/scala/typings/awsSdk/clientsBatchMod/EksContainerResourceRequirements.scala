package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EksContainerResourceRequirements extends StObject {
  
  /**
    * The type and quantity of the resources to reserve for the container. The values vary based on the name that's specified. Resources can be requested using either the limits or the requests objects.  memory  The memory hard limit (in MiB) for the container, using whole integers, with a "Mi" suffix. If your container attempts to exceed the memory specified, the container is terminated. You must specify at least 4 MiB of memory for a job. memory can be specified in limits, requests, or both. If memory is specified in both places, then the value that's specified in limits must be equal to the value that's specified in requests.  To maximize your resource utilization, provide your jobs with as much memory as possible for the specific instance type that you are using. To learn how, see Memory management in the Batch User Guide.   cpu  The number of CPUs that's reserved for the container. Values must be an even multiple of 0.25. cpu can be specified in limits, requests, or both. If cpu is specified in both places, then the value that's specified in limits must be at least as large as the value that's specified in requests.  nvidia.com/gpu  The number of GPUs that's reserved for the container. Values must be a whole integer. memory can be specified in limits, requests, or both. If memory is specified in both places, then the value that's specified in limits must be equal to the value that's specified in requests.  
    */
  var limits: js.UndefOr[EksLimits] = js.undefined
  
  /**
    * The type and quantity of the resources to request for the container. The values vary based on the name that's specified. Resources can be requested by using either the limits or the requests objects.  memory  The memory hard limit (in MiB) for the container, using whole integers, with a "Mi" suffix. If your container attempts to exceed the memory specified, the container is terminated. You must specify at least 4 MiB of memory for a job. memory can be specified in limits, requests, or both. If memory is specified in both, then the value that's specified in limits must be equal to the value that's specified in requests.  If you're trying to maximize your resource utilization by providing your jobs as much memory as possible for a particular instance type, see Memory management in the Batch User Guide.   cpu  The number of CPUs that are reserved for the container. Values must be an even multiple of 0.25. cpu can be specified in limits, requests, or both. If cpu is specified in both, then the value that's specified in limits must be at least as large as the value that's specified in requests.  nvidia.com/gpu  The number of GPUs that are reserved for the container. Values must be a whole integer. nvidia.com/gpu can be specified in limits, requests, or both. If nvidia.com/gpu is specified in both, then the value that's specified in limits must be equal to the value that's specified in requests.  
    */
  var requests: js.UndefOr[EksRequests] = js.undefined
}
object EksContainerResourceRequirements {
  
  inline def apply(): EksContainerResourceRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EksContainerResourceRequirements]
  }
  
  extension [Self <: EksContainerResourceRequirements](x: Self) {
    
    inline def setLimits(value: EksLimits): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    inline def setRequests(value: EksRequests): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
  }
}
