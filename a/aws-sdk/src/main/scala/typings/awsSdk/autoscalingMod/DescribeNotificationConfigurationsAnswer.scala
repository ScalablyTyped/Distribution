package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNotificationConfigurationsAnswer extends StObject {
  
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.native
  
  /**
    * The notification configurations.
    */
  var NotificationConfigurations: typings.awsSdk.autoscalingMod.NotificationConfigurations = js.native
}
object DescribeNotificationConfigurationsAnswer {
  
  @scala.inline
  def apply(NotificationConfigurations: NotificationConfigurations): DescribeNotificationConfigurationsAnswer = {
    val __obj = js.Dynamic.literal(NotificationConfigurations = NotificationConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNotificationConfigurationsAnswer]
  }
  
  @scala.inline
  implicit class DescribeNotificationConfigurationsAnswerMutableBuilder[Self <: DescribeNotificationConfigurationsAnswer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setNotificationConfigurations(value: NotificationConfigurations): Self = StObject.set(x, "NotificationConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationConfigurationsVarargs(value: NotificationConfiguration*): Self = StObject.set(x, "NotificationConfigurations", js.Array(value :_*))
  }
}
