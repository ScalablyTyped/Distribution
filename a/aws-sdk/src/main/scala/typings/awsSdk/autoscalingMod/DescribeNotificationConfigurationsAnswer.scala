package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNotificationConfigurationsAnswer extends js.Object {
  
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
  implicit class DescribeNotificationConfigurationsAnswerOps[Self <: DescribeNotificationConfigurationsAnswer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNotificationConfigurationsVarargs(value: NotificationConfiguration*): Self = this.set("NotificationConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setNotificationConfigurations(value: NotificationConfigurations): Self = this.set("NotificationConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: XmlString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
