package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceInstanceOutputsInput extends StObject {
  
  /**
    * A token that indicates the location of the next output in the array of outputs, after the list of outputs that was previously requested.
    */
  var nextToken: js.UndefOr[EmptyNextToken] = js.undefined
  
  /**
    * The name of the service instance whose outputs you want.
    */
  var serviceInstanceName: ResourceName
  
  /**
    * The name of the service that serviceInstanceName is associated to.
    */
  var serviceName: ResourceName
}
object ListServiceInstanceOutputsInput {
  
  inline def apply(serviceInstanceName: ResourceName, serviceName: ResourceName): ListServiceInstanceOutputsInput = {
    val __obj = js.Dynamic.literal(serviceInstanceName = serviceInstanceName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServiceInstanceOutputsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListServiceInstanceOutputsInput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: EmptyNextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setServiceInstanceName(value: ResourceName): Self = StObject.set(x, "serviceInstanceName", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
