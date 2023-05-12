package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataflowEndpointGroupRequest extends StObject {
  
  /**
    * Amount of time, in seconds, after a contact ends that the Ground Station Dataflow Endpoint Group will be in a POSTPASS state. A Ground Station Dataflow Endpoint Group State Change event will be emitted when the Dataflow Endpoint Group enters and exits the POSTPASS state.
    */
  var contactPostPassDurationSeconds: js.UndefOr[DataflowEndpointGroupDurationInSeconds] = js.undefined
  
  /**
    * Amount of time, in seconds, before a contact starts that the Ground Station Dataflow Endpoint Group will be in a PREPASS state. A Ground Station Dataflow Endpoint Group State Change event will be emitted when the Dataflow Endpoint Group enters and exits the PREPASS state.
    */
  var contactPrePassDurationSeconds: js.UndefOr[DataflowEndpointGroupDurationInSeconds] = js.undefined
  
  /**
    * Endpoint details of each endpoint in the dataflow endpoint group.
    */
  var endpointDetails: EndpointDetailsList
  
  /**
    * Tags of a dataflow endpoint group.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object CreateDataflowEndpointGroupRequest {
  
  inline def apply(endpointDetails: EndpointDetailsList): CreateDataflowEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(endpointDetails = endpointDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataflowEndpointGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDataflowEndpointGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setContactPostPassDurationSeconds(value: DataflowEndpointGroupDurationInSeconds): Self = StObject.set(x, "contactPostPassDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setContactPostPassDurationSecondsUndefined: Self = StObject.set(x, "contactPostPassDurationSeconds", js.undefined)
    
    inline def setContactPrePassDurationSeconds(value: DataflowEndpointGroupDurationInSeconds): Self = StObject.set(x, "contactPrePassDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setContactPrePassDurationSecondsUndefined: Self = StObject.set(x, "contactPrePassDurationSeconds", js.undefined)
    
    inline def setEndpointDetails(value: EndpointDetailsList): Self = StObject.set(x, "endpointDetails", value.asInstanceOf[js.Any])
    
    inline def setEndpointDetailsVarargs(value: EndpointDetails*): Self = StObject.set(x, "endpointDetails", js.Array(value*))
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
