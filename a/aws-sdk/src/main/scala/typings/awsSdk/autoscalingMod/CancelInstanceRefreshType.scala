package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelInstanceRefreshType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
}
object CancelInstanceRefreshType {
  
  @scala.inline
  def apply(AutoScalingGroupName: XmlStringMaxLen255): CancelInstanceRefreshType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelInstanceRefreshType]
  }
  
  @scala.inline
  implicit class CancelInstanceRefreshTypeMutableBuilder[Self <: CancelInstanceRefreshType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
  }
}
