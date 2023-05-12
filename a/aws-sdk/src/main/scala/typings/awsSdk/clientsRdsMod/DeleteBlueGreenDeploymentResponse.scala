package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBlueGreenDeploymentResponse extends StObject {
  
  var BlueGreenDeployment: js.UndefOr[typings.awsSdk.clientsRdsMod.BlueGreenDeployment] = js.undefined
}
object DeleteBlueGreenDeploymentResponse {
  
  inline def apply(): DeleteBlueGreenDeploymentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBlueGreenDeploymentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteBlueGreenDeploymentResponse] (val x: Self) extends AnyVal {
    
    inline def setBlueGreenDeployment(value: BlueGreenDeployment): Self = StObject.set(x, "BlueGreenDeployment", value.asInstanceOf[js.Any])
    
    inline def setBlueGreenDeploymentUndefined: Self = StObject.set(x, "BlueGreenDeployment", js.undefined)
  }
}
