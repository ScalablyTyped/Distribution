package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchoverBlueGreenDeploymentResponse extends StObject {
  
  var BlueGreenDeployment: js.UndefOr[typings.awsSdk.clientsRdsMod.BlueGreenDeployment] = js.undefined
}
object SwitchoverBlueGreenDeploymentResponse {
  
  inline def apply(): SwitchoverBlueGreenDeploymentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchoverBlueGreenDeploymentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwitchoverBlueGreenDeploymentResponse] (val x: Self) extends AnyVal {
    
    inline def setBlueGreenDeployment(value: BlueGreenDeployment): Self = StObject.set(x, "BlueGreenDeployment", value.asInstanceOf[js.Any])
    
    inline def setBlueGreenDeploymentUndefined: Self = StObject.set(x, "BlueGreenDeployment", js.undefined)
  }
}
