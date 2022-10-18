package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAutoScalingNotificationTypesAnswer extends StObject {
  
  /**
    * The notification types.
    */
  var AutoScalingNotificationTypes: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.AutoScalingNotificationTypes] = js.undefined
}
object DescribeAutoScalingNotificationTypesAnswer {
  
  inline def apply(): DescribeAutoScalingNotificationTypesAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAutoScalingNotificationTypesAnswer]
  }
  
  extension [Self <: DescribeAutoScalingNotificationTypesAnswer](x: Self) {
    
    inline def setAutoScalingNotificationTypes(value: AutoScalingNotificationTypes): Self = StObject.set(x, "AutoScalingNotificationTypes", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingNotificationTypesUndefined: Self = StObject.set(x, "AutoScalingNotificationTypes", js.undefined)
    
    inline def setAutoScalingNotificationTypesVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "AutoScalingNotificationTypes", js.Array(value*))
  }
}
