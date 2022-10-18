package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceReusePolicy extends StObject {
  
  /**
    * Specifies whether instances in the Auto Scaling group can be returned to the warm pool on scale in. 
    */
  var ReuseOnScaleIn: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.ReuseOnScaleIn] = js.undefined
}
object InstanceReusePolicy {
  
  inline def apply(): InstanceReusePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceReusePolicy]
  }
  
  extension [Self <: InstanceReusePolicy](x: Self) {
    
    inline def setReuseOnScaleIn(value: ReuseOnScaleIn): Self = StObject.set(x, "ReuseOnScaleIn", value.asInstanceOf[js.Any])
    
    inline def setReuseOnScaleInUndefined: Self = StObject.set(x, "ReuseOnScaleIn", js.undefined)
  }
}
