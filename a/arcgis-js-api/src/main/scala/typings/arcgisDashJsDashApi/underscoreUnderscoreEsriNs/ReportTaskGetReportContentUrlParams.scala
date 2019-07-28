package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportTaskGetReportContentUrlParams extends Object {
  /**
    * The id of the report.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#getReportContentUrl)
    */
  var reportId: Double
  /**
    * The username of the user requesting the report content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#getReportContentUrl)
    */
  var user: Double
}

object ReportTaskGetReportContentUrlParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    reportId: Double,
    user: Double
  ): ReportTaskGetReportContentUrlParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), reportId = reportId, user = user)
  
    __obj.asInstanceOf[ReportTaskGetReportContentUrlParams]
  }
}

