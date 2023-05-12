package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceInstanceInput extends StObject {
  
  /**
    * The name of a service instance that you want to get the detailed data for.
    */
  var name: ResourceName
  
  /**
    * The name of the service that you want the service instance input for.
    */
  var serviceName: ResourceName
}
object GetServiceInstanceInput {
  
  inline def apply(name: ResourceName, serviceName: ResourceName): GetServiceInstanceInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceInstanceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServiceInstanceInput] (val x: Self) extends AnyVal {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
