package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudwatchLogsExportConfiguration extends js.Object {
  /**
    * The list of log types to disable.
    */
  var DisableLogTypes: js.UndefOr[LogTypeList] = js.native
  /**
    * The list of log types to enable.
    */
  var EnableLogTypes: js.UndefOr[LogTypeList] = js.native
}

object CloudwatchLogsExportConfiguration {
  @scala.inline
  def apply(DisableLogTypes: LogTypeList = null, EnableLogTypes: LogTypeList = null): CloudwatchLogsExportConfiguration = {
    val __obj = js.Dynamic.literal()
    if (DisableLogTypes != null) __obj.updateDynamic("DisableLogTypes")(DisableLogTypes.asInstanceOf[js.Any])
    if (EnableLogTypes != null) __obj.updateDynamic("EnableLogTypes")(EnableLogTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudwatchLogsExportConfiguration]
  }
}

