package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportData
  extends stdLib.Object {
  /**
    * The name of columns returned as part of the report.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#ReportData)
    */
  var columns: js.Array[java.lang.String]
  /**
    * A description of the report.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#ReportData)
    */
  var description: java.lang.String
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
  var title: java.lang.String
}

object ReportData {
  @scala.inline
  def apply(
    columns: js.Array[java.lang.String],
    constructor: js.Function,
    description: java.lang.String,
    groups: js.Array[ReportDataGroup],
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    title: java.lang.String
  ): ReportData = {
    val __obj = js.Dynamic.literal(columns = columns, constructor = constructor, description = description, groups = groups, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), title = title)
  
    __obj.asInstanceOf[ReportData]
  }
}

