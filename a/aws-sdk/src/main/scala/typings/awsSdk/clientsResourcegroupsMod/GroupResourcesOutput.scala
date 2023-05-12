package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupResourcesOutput extends StObject {
  
  /**
    * A list of ARNs of any resources that this operation failed to add to the group.
    */
  var Failed: js.UndefOr[FailedResourceList] = js.undefined
  
  /**
    * A list of ARNs of any resources that this operation is still in the process adding to the group. These pending additions continue asynchronously. You can check the status of pending additions by using the  ListGroupResources  operation, and checking the Resources array in the response and the Status field of each object in that array. 
    */
  var Pending: js.UndefOr[PendingResourceList] = js.undefined
  
  /**
    * A list of ARNs of the resources that this operation successfully added to the group.
    */
  var Succeeded: js.UndefOr[ResourceArnList] = js.undefined
}
object GroupResourcesOutput {
  
  inline def apply(): GroupResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupResourcesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupResourcesOutput] (val x: Self) extends AnyVal {
    
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
