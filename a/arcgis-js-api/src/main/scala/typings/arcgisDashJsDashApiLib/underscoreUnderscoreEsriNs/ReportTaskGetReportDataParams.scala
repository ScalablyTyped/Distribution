package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportTaskGetReportDataParams
  extends stdLib.Object {
  /**
    * The id of the report.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#getReportData)
    */
  var reportId: scala.Double
  /**
    * The username of the user requesting the report data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#getReportData)
    */
  var user: java.lang.String
}

object ReportTaskGetReportDataParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    reportId: scala.Double,
    user: java.lang.String
  ): ReportTaskGetReportDataParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("reportId")(reportId)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[ReportTaskGetReportDataParams]
  }
}

