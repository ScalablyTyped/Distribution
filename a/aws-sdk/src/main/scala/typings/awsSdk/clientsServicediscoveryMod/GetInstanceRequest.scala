package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceRequest extends StObject {
  
  /**
    * The ID of the instance that you want to get information about.
    */
  var InstanceId: ResourceId
  
  /**
    * The ID of the service that the instance is associated with.
    */
  var ServiceId: ResourceId
}
object GetInstanceRequest {
  
  inline def apply(InstanceId: ResourceId, ServiceId: ResourceId): GetInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], ServiceId = ServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInstanceRequest] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: ResourceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setServiceId(value: ResourceId): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
  }
}
