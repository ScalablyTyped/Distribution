package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportTaskGetReportContentUrlParams
  extends stdLib.Object {
  /**
    * The id of the report.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#getReportContentUrl)
    */
  var reportId: scala.Double
  /**
    * The username of the user requesting the report content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#getReportContentUrl)
    */
  var user: scala.Double
}

object ReportTaskGetReportContentUrlParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    reportId: scala.Double,
    user: scala.Double
  ): ReportTaskGetReportContentUrlParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("reportId")(reportId)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[ReportTaskGetReportContentUrlParams]
  }
}

