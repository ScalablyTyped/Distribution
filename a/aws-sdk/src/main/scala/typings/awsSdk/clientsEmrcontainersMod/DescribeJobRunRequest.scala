package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobRunRequest extends StObject {
  
  /**
    * The ID of the job run request. 
    */
  var id: ResourceIdString
  
  /**
    * The ID of the virtual cluster for which the job run is submitted.
    */
  var virtualClusterId: ResourceIdString
}
object DescribeJobRunRequest {
  
  inline def apply(id: ResourceIdString, virtualClusterId: ResourceIdString): DescribeJobRunRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], virtualClusterId = virtualClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobRunRequest]
  }
  
  extension [Self <: DescribeJobRunRequest](x: Self) {
    
    inline def setId(value: ResourceIdString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setVirtualClusterId(value: ResourceIdString): Self = StObject.set(x, "virtualClusterId", value.asInstanceOf[js.Any])
  }
}
