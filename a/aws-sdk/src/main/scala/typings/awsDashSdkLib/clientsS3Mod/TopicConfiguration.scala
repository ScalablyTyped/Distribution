package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicConfiguration extends js.Object {
  /**
    * The Amazon S3 bucket event about which to send notifications. For more information, see Supported Event Types in the Amazon Simple Storage Service Developer Guide.
    */
  var Events: EventList
  /**
    * 
    */
  var Filter: js.UndefOr[NotificationConfigurationFilter] = js.undefined
  var Id: js.UndefOr[NotificationId] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic to which Amazon S3 publishes a message when it detects events of the specified type.
    */
  var TopicArn: awsDashSdkLib.clientsS3Mod.TopicArn
}

object TopicConfiguration {
  @scala.inline
  def apply(
    Events: EventList,
    TopicArn: TopicArn,
    Filter: NotificationConfigurationFilter = null,
    Id: NotificationId = null
  ): TopicConfiguration = {
    val __obj = js.Dynamic.literal(Events = Events, TopicArn = TopicArn)
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    __obj.asInstanceOf[TopicConfiguration]
  }
}

