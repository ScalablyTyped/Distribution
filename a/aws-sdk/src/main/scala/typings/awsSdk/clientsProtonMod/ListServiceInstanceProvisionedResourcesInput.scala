package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceInstanceProvisionedResourcesInput extends StObject {
  
  /**
    * A token that indicates the location of the next provisioned resource in the array of provisioned resources, after the list of provisioned resources that was previously requested.
    */
  var nextToken: js.UndefOr[EmptyNextToken] = js.undefined
  
  /**
    * The name of the service instance whose provisioned resources you want.
    */
  var serviceInstanceName: ResourceName
  
  /**
    * The name of the service that serviceInstanceName is associated to.
    */
  var serviceName: ResourceName
}
object ListServiceInstanceProvisionedResourcesInput {
  
  inline def apply(serviceInstanceName: ResourceName, serviceName: ResourceName): ListServiceInstanceProvisionedResourcesInput = {
    val __obj = js.Dynamic.literal(serviceInstanceName = serviceInstanceName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServiceInstanceProvisionedResourcesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListServiceInstanceProvisionedResourcesInput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: EmptyNextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setServiceInstanceName(value: ResourceName): Self = StObject.set(x, "serviceInstanceName", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
