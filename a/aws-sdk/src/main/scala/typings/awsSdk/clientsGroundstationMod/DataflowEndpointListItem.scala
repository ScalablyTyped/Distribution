package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataflowEndpointListItem extends StObject {
  
  /**
    * ARN of a dataflow endpoint group.
    */
  var dataflowEndpointGroupArn: js.UndefOr[DataflowEndpointGroupArn] = js.undefined
  
  /**
    * UUID of a dataflow endpoint group.
    */
  var dataflowEndpointGroupId: js.UndefOr[String] = js.undefined
}
object DataflowEndpointListItem {
  
  inline def apply(): DataflowEndpointListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataflowEndpointListItem]
  }
  
  extension [Self <: DataflowEndpointListItem](x: Self) {
    
    inline def setDataflowEndpointGroupArn(value: DataflowEndpointGroupArn): Self = StObject.set(x, "dataflowEndpointGroupArn", value.asInstanceOf[js.Any])
    
    inline def setDataflowEndpointGroupArnUndefined: Self = StObject.set(x, "dataflowEndpointGroupArn", js.undefined)
    
    inline def setDataflowEndpointGroupId(value: String): Self = StObject.set(x, "dataflowEndpointGroupId", value.asInstanceOf[js.Any])
    
    inline def setDataflowEndpointGroupIdUndefined: Self = StObject.set(x, "dataflowEndpointGroupId", js.undefined)
  }
}
