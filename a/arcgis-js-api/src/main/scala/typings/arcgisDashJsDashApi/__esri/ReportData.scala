package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportData extends Object {
  /**
    * The name of columns returned as part of the report.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#ReportData)
    */
  var columns: js.Array[String]
  /**
    * A description of the report.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#ReportData)
    */
  var description: String
  /**
    * The [aggregation of the report data](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#ReportDataGroup) into subcategories.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#ReportData)
    */
  var groups: js.Array[ReportDataGroup]
  /**
    * The title of the report.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#ReportData)
    */
  var title: String
}

object ReportData {
  @scala.inline
  def apply(
    columns: js.Array[String],
    constructor: js.Function,
    description: String,
    groups: js.Array[ReportDataGroup],
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    title: String
  ): ReportData = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReportData]
  }
}

