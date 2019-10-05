package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportDataGroup extends Object {
  /**
    * The label of the aggregate category as defined in the report, eg. Total Jobs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#ReportDataGroup)
    */
  var aggregateLabel: String
  /**
    * The value of the aggregate category based on the calculation defined in the report section options.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#ReportDataGroup)
    */
  var aggregateValue: String
  /**
    * The rows containing the data returned in the report.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#ReportDataGroup)
    */
  var row: js.Array[String]
  /**
    * The data value based on which the section is created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#ReportDataGroup)
    */
  var value: String
}

object ReportDataGroup {
  @scala.inline
  def apply(
    aggregateLabel: String,
    aggregateValue: String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    row: js.Array[String],
    value: String
  ): ReportDataGroup = {
    val __obj = js.Dynamic.literal(aggregateLabel = aggregateLabel, aggregateValue = aggregateValue, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), row = row, value = value)
  
    __obj.asInstanceOf[ReportDataGroup]
  }
}

