package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UngroupResourcesOutput extends StObject {
  
  /**
    * A list of any resources that failed to be removed from the group by this operation.
    */
  var Failed: js.UndefOr[FailedResourceList] = js.undefined
  
  /**
    * A list of any resources that are still in the process of being removed from the group by this operation. These pending removals continue asynchronously. You can check the status of pending removals by using the  ListGroupResources  operation. After the resource is successfully removed, it no longer appears in the response.
    */
  var Pending: js.UndefOr[PendingResourceList] = js.undefined
  
  /**
    * A list of resources that were successfully removed from the group by this operation.
    */
  var Succeeded: js.UndefOr[ResourceArnList] = js.undefined
}
object UngroupResourcesOutput {
  
  inline def apply(): UngroupResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UngroupResourcesOutput]
  }
  
  extension [Self <: UngroupResourcesOutput](x: Self) {
    
    inline def setFailed(value: FailedResourceList): Self = StObject.set(x, "Failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "Failed", js.undefined)
    
    inline def setFailedVarargs(value: FailedResource*): Self = StObject.set(x, "Failed", js.Array(value*))
    
    inline def setPending(value: PendingResourceList): Self = StObject.set(x, "Pending", value.asInstanceOf[js.Any])
    
    inline def setPendingUndefined: Self = StObject.set(x, "Pending", js.undefined)
    
    inline def setPendingVarargs(value: PendingResource*): Self = StObject.set(x, "Pending", js.Array(value*))
    
    inline def setSucceeded(value: ResourceArnList): Self = StObject.set(x, "Succeeded", value.asInstanceOf[js.Any])
    
    inline def setSucceededUndefined: Self = StObject.set(x, "Succeeded", js.undefined)
    
    inline def setSucceededVarargs(value: ResourceArn*): Self = StObject.set(x, "Succeeded", js.Array(value*))
  }
}
