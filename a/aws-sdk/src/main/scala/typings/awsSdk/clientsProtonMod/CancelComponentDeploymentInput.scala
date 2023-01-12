package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelComponentDeploymentInput extends StObject {
  
  /**
    * The name of the component with the deployment to cancel.
    */
  var componentName: ResourceName
}
object CancelComponentDeploymentInput {
  
  inline def apply(componentName: ResourceName): CancelComponentDeploymentInput = {
    val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelComponentDeploymentInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelComponentDeploymentInput] (val x: Self) extends AnyVal {
    
    inline def setComponentName(value: ResourceName): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
  }
}
