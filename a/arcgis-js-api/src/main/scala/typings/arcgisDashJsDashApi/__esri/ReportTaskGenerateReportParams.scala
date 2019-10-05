package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportTaskGenerateReportParams extends Object {
  /**
    * The id of the report.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#generateReport)
    */
  var reportId: Double
  /**
    * The user name requesting the report.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#generateReport)
    */
  var user: String
}

object ReportTaskGenerateReportParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    reportId: Double,
    user: String
  ): ReportTaskGenerateReportParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), reportId = reportId, user = user)
  
    __obj.asInstanceOf[ReportTaskGenerateReportParams]
  }
}

