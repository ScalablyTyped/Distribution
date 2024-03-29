package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTargetGroupInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: typings.awsSdk.clientsElbv2Mod.TargetGroupArn
}
object DeleteTargetGroupInput {
  
  inline def apply(TargetGroupArn: TargetGroupArn): DeleteTargetGroupInput = {
    val __obj = js.Dynamic.literal(TargetGroupArn = TargetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTargetGroupInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTargetGroupInput] (val x: Self) extends AnyVal {
    
    inline def setTargetGroupArn(value: TargetGroupArn): Self = StObject.set(x, "TargetGroupArn", value.asInstanceOf[js.Any])
  }
}
