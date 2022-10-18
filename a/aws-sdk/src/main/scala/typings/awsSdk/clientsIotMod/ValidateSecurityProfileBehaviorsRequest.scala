package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateSecurityProfileBehaviorsRequest extends StObject {
  
  /**
    * Specifies the behaviors that, when violated by a device (thing), cause an alert.
    */
  var behaviors: Behaviors
}
object ValidateSecurityProfileBehaviorsRequest {
  
  inline def apply(behaviors: Behaviors): ValidateSecurityProfileBehaviorsRequest = {
    val __obj = js.Dynamic.literal(behaviors = behaviors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateSecurityProfileBehaviorsRequest]
  }
  
  extension [Self <: ValidateSecurityProfileBehaviorsRequest](x: Self) {
    
    inline def setBehaviors(value: Behaviors): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
    
    inline def setBehaviorsVarargs(value: Behavior*): Self = StObject.set(x, "behaviors", js.Array(value*))
  }
}
