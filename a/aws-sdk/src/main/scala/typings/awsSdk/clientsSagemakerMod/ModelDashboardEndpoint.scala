package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelDashboardEndpoint extends StObject {
  
  /**
    * A timestamp that indicates when the endpoint was created.
    */
  var CreationTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint.
    */
  var EndpointArn: typings.awsSdk.clientsSagemakerMod.EndpointArn
  
  /**
    * The endpoint name.
    */
  var EndpointName: typings.awsSdk.clientsSagemakerMod.EndpointName
  
  /**
    * The endpoint status.
    */
  var EndpointStatus: typings.awsSdk.clientsSagemakerMod.EndpointStatus
  
  /**
    * The last time the endpoint was modified.
    */
  var LastModifiedTime: js.Date
}
object ModelDashboardEndpoint {
  
  inline def apply(
    CreationTime: js.Date,
    EndpointArn: EndpointArn,
    EndpointName: EndpointName,
    EndpointStatus: EndpointStatus,
    LastModifiedTime: js.Date
  ): ModelDashboardEndpoint = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], EndpointArn = EndpointArn.asInstanceOf[js.Any], EndpointName = EndpointName.asInstanceOf[js.Any], EndpointStatus = EndpointStatus.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelDashboardEndpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelDashboardEndpoint] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setEndpointArn(value: EndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setEndpointStatus(value: EndpointStatus): Self = StObject.set(x, "EndpointStatus", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
  }
}
