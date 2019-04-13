package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudwatchLogsExportConfiguration extends js.Object {
  /**
    * The list of log types to disable.
    */
  var DisableLogTypes: js.UndefOr[LogTypeList] = js.undefined
  /**
    * The list of log types to enable.
    */
  var EnableLogTypes: js.UndefOr[LogTypeList] = js.undefined
}

object CloudwatchLogsExportConfiguration {
  @scala.inline
  def apply(DisableLogTypes: LogTypeList = null, EnableLogTypes: LogTypeList = null): CloudwatchLogsExportConfiguration = {
    val __obj = js.Dynamic.literal()
    if (DisableLogTypes != null) __obj.updateDynamic("DisableLogTypes")(DisableLogTypes)
    if (EnableLogTypes != null) __obj.updateDynamic("EnableLogTypes")(EnableLogTypes)
    __obj.asInstanceOf[CloudwatchLogsExportConfiguration]
  }
}

