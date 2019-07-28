package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogPublishingOptionsStatus extends js.Object {
  /**
    * The log publishing options configured for the Elasticsearch domain.
    */
  var Options: js.UndefOr[LogPublishingOptions] = js.undefined
  /**
    * The status of the log publishing options for the Elasticsearch domain. See OptionStatus for the status information that's included. 
    */
  var Status: js.UndefOr[OptionStatus] = js.undefined
}

object LogPublishingOptionsStatus {
  @scala.inline
  def apply(Options: LogPublishingOptions = null, Status: OptionStatus = null): LogPublishingOptionsStatus = {
    val __obj = js.Dynamic.literal()
    if (Options != null) __obj.updateDynamic("Options")(Options)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[LogPublishingOptionsStatus]
  }
}

