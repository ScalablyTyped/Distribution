package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceSyncBlockerSummaryInput extends StObject {
  
  /**
    * The name of the service instance that you want to get the service sync blocker summary for. If given bothe the instance name and the service name, only the instance is blocked.
    */
  var serviceInstanceName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The name of the service that you want to get the service sync blocker summary for. If given only the service name, all instances are blocked.
    */
  var serviceName: ResourceName
}
object GetServiceSyncBlockerSummaryInput {
  
  inline def apply(serviceName: ResourceName): GetServiceSyncBlockerSummaryInput = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceSyncBlockerSummaryInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServiceSyncBlockerSummaryInput] (val x: Self) extends AnyVal {
    
    inline def setServiceInstanceName(value: ResourceName): Self = StObject.set(x, "serviceInstanceName", value.asInstanceOf[js.Any])
    
    inline def setServiceInstanceNameUndefined: Self = StObject.set(x, "serviceInstanceName", js.undefined)
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
