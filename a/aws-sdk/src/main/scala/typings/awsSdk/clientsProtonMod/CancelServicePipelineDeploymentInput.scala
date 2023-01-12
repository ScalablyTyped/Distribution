package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelServicePipelineDeploymentInput extends StObject {
  
  /**
    * The name of the service with the service pipeline deployment to cancel.
    */
  var serviceName: ResourceName
}
object CancelServicePipelineDeploymentInput {
  
  inline def apply(serviceName: ResourceName): CancelServicePipelineDeploymentInput = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelServicePipelineDeploymentInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelServicePipelineDeploymentInput] (val x: Self) extends AnyVal {
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
