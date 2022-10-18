package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterTargetsInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: typings.awsSdk.clientsElbv2Mod.TargetGroupArn
  
  /**
    * The targets. If you specified a port override when you registered a target, you must specify both the target ID and the port when you deregister it.
    */
  var Targets: TargetDescriptions
}
object DeregisterTargetsInput {
  
  inline def apply(TargetGroupArn: TargetGroupArn, Targets: TargetDescriptions): DeregisterTargetsInput = {
    val __obj = js.Dynamic.literal(TargetGroupArn = TargetGroupArn.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterTargetsInput]
  }
  
  extension [Self <: DeregisterTargetsInput](x: Self) {
    
    inline def setTargetGroupArn(value: TargetGroupArn): Self = StObject.set(x, "TargetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setTargets(value: TargetDescriptions): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: TargetDescription*): Self = StObject.set(x, "Targets", js.Array(value*))
  }
}
