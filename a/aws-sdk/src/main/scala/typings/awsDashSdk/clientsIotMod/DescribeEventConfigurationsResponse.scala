package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventConfigurationsResponse extends js.Object {
  /**
    * The creation date of the event configuration.
    */
  var creationDate: js.UndefOr[CreationDate] = js.native
  /**
    * The event configurations.
    */
  var eventConfigurations: js.UndefOr[EventConfigurations] = js.native
  /**
    * The date the event configurations were last modified.
    */
  var lastModifiedDate: js.UndefOr[LastModifiedDate] = js.native
}

object DescribeEventConfigurationsResponse {
  @scala.inline
  def apply(
    creationDate: CreationDate = null,
    eventConfigurations: EventConfigurations = null,
    lastModifiedDate: LastModifiedDate = null
  ): DescribeEventConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (eventConfigurations != null) __obj.updateDynamic("eventConfigurations")(eventConfigurations.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventConfigurationsResponse]
  }
}

