package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAutoScalingNotificationTypesAnswer extends StObject {
  
  /**
    * The notification types.
    */
  var AutoScalingNotificationTypes: js.UndefOr[typings.awsSdk.autoscalingMod.AutoScalingNotificationTypes] = js.native
}
object DescribeAutoScalingNotificationTypesAnswer {
  
  @scala.inline
  def apply(): DescribeAutoScalingNotificationTypesAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAutoScalingNotificationTypesAnswer]
  }
  
  @scala.inline
  implicit class DescribeAutoScalingNotificationTypesAnswerMutableBuilder[Self <: DescribeAutoScalingNotificationTypesAnswer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingNotificationTypes(value: AutoScalingNotificationTypes): Self = StObject.set(x, "AutoScalingNotificationTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingNotificationTypesUndefined: Self = StObject.set(x, "AutoScalingNotificationTypes", js.undefined)
    
    @scala.inline
    def setAutoScalingNotificationTypesVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "AutoScalingNotificationTypes", js.Array(value :_*))
  }
}
