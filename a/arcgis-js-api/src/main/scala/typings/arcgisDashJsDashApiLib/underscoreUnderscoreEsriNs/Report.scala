package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Report
  extends stdLib.Object {
  /**
    * A description of the report.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#Report)
    */
  var description: java.lang.String
  /**
    * The category to which the report belongs in the system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#Report)
    */
  var hierarchy: java.lang.String
  /**
    * A unique id for the report.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#Report)
    */
  var id: scala.Double
  /**
    * The name of the report.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#Report)
    */
  var name: java.lang.String
  /**
    * The title of the report.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#Report)
    */
  var title: java.lang.String
}

object Report {
  @scala.inline
  def apply(
    constructor: js.Function,
    description: java.lang.String,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    hierarchy: java.lang.String,
    id: scala.Double,
    name: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    title: java.lang.String
  ): Report = {
    val __obj = js.Dynamic.literal(constructor = constructor, description = description, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), hierarchy = hierarchy, id = id, name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), title = title)
  
    __obj.asInstanceOf[Report]
  }
}

