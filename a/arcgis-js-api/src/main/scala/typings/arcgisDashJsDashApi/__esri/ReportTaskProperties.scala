package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportTaskProperties extends TaskProperties

object ReportTaskProperties {
  @scala.inline
  def apply(requestOptions: js.Any = null, url: String = null): ReportTaskProperties = {
    val __obj = js.Dynamic.literal()
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ReportTaskProperties]
  }
}

