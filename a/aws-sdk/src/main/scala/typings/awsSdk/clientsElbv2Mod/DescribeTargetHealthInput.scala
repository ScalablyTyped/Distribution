package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTargetHealthInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: typings.awsSdk.clientsElbv2Mod.TargetGroupArn
  
  /**
    * The targets.
    */
  var Targets: js.UndefOr[TargetDescriptions] = js.undefined
}
object DescribeTargetHealthInput {
  
  inline def apply(TargetGroupArn: TargetGroupArn): DescribeTargetHealthInput = {
    val __obj = js.Dynamic.literal(TargetGroupArn = TargetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTargetHealthInput]
  }
  
  extension [Self <: DescribeTargetHealthInput](x: Self) {
    
    inline def setTargetGroupArn(value: TargetGroupArn): Self = StObject.set(x, "TargetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setTargets(value: TargetDescriptions): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    inline def setTargetsVarargs(value: TargetDescription*): Self = StObject.set(x, "Targets", js.Array(value*))
  }
}
