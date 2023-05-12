package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceInstanceSyncStatusInput extends StObject {
  
  /**
    * The name of the service instance that you want the sync status input for.
    */
  var serviceInstanceName: ResourceName
  
  /**
    * The name of the service that the service instance belongs to.
    */
  var serviceName: ResourceName
}
object GetServiceInstanceSyncStatusInput {
  
  inline def apply(serviceInstanceName: ResourceName, serviceName: ResourceName): GetServiceInstanceSyncStatusInput = {
    val __obj = js.Dynamic.literal(serviceInstanceName = serviceInstanceName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceInstanceSyncStatusInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServiceInstanceSyncStatusInput] (val x: Self) extends AnyVal {
    
    inline def setServiceInstanceName(value: ResourceName): Self = StObject.set(x, "serviceInstanceName", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
