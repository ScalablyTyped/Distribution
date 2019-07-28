package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEventConfigurationsResponse extends js.Object {
  /**
    * The creation date of the event configuration.
    */
  var creationDate: js.UndefOr[CreationDate] = js.undefined
  /**
    * The event configurations.
    */
  var eventConfigurations: js.UndefOr[EventConfigurations] = js.undefined
  /**
    * The date the event configurations were last modified.
    */
  var lastModifiedDate: js.UndefOr[LastModifiedDate] = js.undefined
}

object DescribeEventConfigurationsResponse {
  @scala.inline
  def apply(
    creationDate: CreationDate = null,
    eventConfigurations: EventConfigurations = null,
    lastModifiedDate: LastModifiedDate = null
  ): DescribeEventConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (eventConfigurations != null) __obj.updateDynamic("eventConfigurations")(eventConfigurations)
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate)
    __obj.asInstanceOf[DescribeEventConfigurationsResponse]
  }
}

