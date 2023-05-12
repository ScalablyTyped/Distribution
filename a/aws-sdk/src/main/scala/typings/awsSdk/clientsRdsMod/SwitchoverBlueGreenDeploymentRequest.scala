package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchoverBlueGreenDeploymentRequest extends StObject {
  
  /**
    * The blue/green deployment identifier. Constraints:   Must match an existing blue/green deployment identifier.  
    */
  var BlueGreenDeploymentIdentifier: typings.awsSdk.clientsRdsMod.BlueGreenDeploymentIdentifier
  
  /**
    * The amount of time, in seconds, for the switchover to complete. The default is 300. If the switchover takes longer than the specified duration, then any changes are rolled back, and no changes are made to the environments.
    */
  var SwitchoverTimeout: js.UndefOr[typings.awsSdk.clientsRdsMod.SwitchoverTimeout] = js.undefined
}
object SwitchoverBlueGreenDeploymentRequest {
  
  inline def apply(BlueGreenDeploymentIdentifier: BlueGreenDeploymentIdentifier): SwitchoverBlueGreenDeploymentRequest = {
    val __obj = js.Dynamic.literal(BlueGreenDeploymentIdentifier = BlueGreenDeploymentIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchoverBlueGreenDeploymentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwitchoverBlueGreenDeploymentRequest] (val x: Self) extends AnyVal {
    
    inline def setBlueGreenDeploymentIdentifier(value: BlueGreenDeploymentIdentifier): Self = StObject.set(x, "BlueGreenDeploymentIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSwitchoverTimeout(value: SwitchoverTimeout): Self = StObject.set(x, "SwitchoverTimeout", value.asInstanceOf[js.Any])
    
    inline def setSwitchoverTimeoutUndefined: Self = StObject.set(x, "SwitchoverTimeout", js.undefined)
  }
}
