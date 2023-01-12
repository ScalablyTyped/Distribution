package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterTargetsInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: typings.awsSdk.clientsElbv2Mod.TargetGroupArn
  
  /**
    * The targets.
    */
  var Targets: TargetDescriptions
}
object RegisterTargetsInput {
  
  inline def apply(TargetGroupArn: TargetGroupArn, Targets: TargetDescriptions): RegisterTargetsInput = {
    val __obj = js.Dynamic.literal(TargetGroupArn = TargetGroupArn.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterTargetsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterTargetsInput] (val x: Self) extends AnyVal {
    
    inline def setTargetGroupArn(value: TargetGroupArn): Self = StObject.set(x, "TargetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setTargets(value: TargetDescriptions): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: TargetDescription*): Self = StObject.set(x, "Targets", js.Array(value*))
  }
}
