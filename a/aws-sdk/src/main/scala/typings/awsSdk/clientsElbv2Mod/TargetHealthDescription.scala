package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetHealthDescription extends StObject {
  
  /**
    * The port to use to connect with the target.
    */
  var HealthCheckPort: js.UndefOr[typings.awsSdk.clientsElbv2Mod.HealthCheckPort] = js.undefined
  
  /**
    * The description of the target.
    */
  var Target: js.UndefOr[TargetDescription] = js.undefined
  
  /**
    * The health information for the target.
    */
  var TargetHealth: js.UndefOr[typings.awsSdk.clientsElbv2Mod.TargetHealth] = js.undefined
}
object TargetHealthDescription {
  
  inline def apply(): TargetHealthDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetHealthDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetHealthDescription] (val x: Self) extends AnyVal {
    
    inline def setHealthCheckPort(value: HealthCheckPort): Self = StObject.set(x, "HealthCheckPort", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckPortUndefined: Self = StObject.set(x, "HealthCheckPort", js.undefined)
    
    inline def setTarget(value: TargetDescription): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTargetHealth(value: TargetHealth): Self = StObject.set(x, "TargetHealth", value.asInstanceOf[js.Any])
    
    inline def setTargetHealthUndefined: Self = StObject.set(x, "TargetHealth", js.undefined)
    
    inline def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
  }
}
