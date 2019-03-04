package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportDataGroup
  extends stdLib.Object {
  /**
    * The label of the aggregate category as defined in the report, eg. Total Jobs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#ReportDataGroup)
    */
  var aggregateLabel: java.lang.String
  /**
    * The value of the aggregate category based on the calculation defined in the report section options.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#ReportDataGroup)
    */
  var aggregateValue: java.lang.String
  /**
    * The rows containing the data returned in the report.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#ReportDataGroup)
    */
  var row: js.Array[java.lang.String]
  /**
    * The data value based on which the section is created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#ReportDataGroup)
    */
  var value: java.lang.String
}

object ReportDataGroup {
  @scala.inline
  def apply(
    aggregateLabel: java.lang.String,
    aggregateValue: java.lang.String,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    row: js.Array[java.lang.String],
    value: java.lang.String
  ): ReportDataGroup = {
    val __obj = js.Dynamic.literal(aggregateLabel = aggregateLabel, aggregateValue = aggregateValue, constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, row = row, value = value)
  
    __obj.asInstanceOf[ReportDataGroup]
  }
}

