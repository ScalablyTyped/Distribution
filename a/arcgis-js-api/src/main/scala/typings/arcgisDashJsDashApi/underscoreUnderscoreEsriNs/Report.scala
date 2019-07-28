package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Report extends Object {
  /**
    * A description of the report.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#Report)
    */
  var description: String
  /**
    * The category to which the report belongs in the system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#Report)
    */
  var hierarchy: String
  /**
    * A unique id for the report.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#Report)
    */
  var id: Double
  /**
    * The name of the report.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#Report)
    */
  var name: String
  /**
    * The title of the report.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#Report)
    */
  var title: String
}

object Report {
  @scala.inline
  def apply(
    constructor: js.Function,
    description: String,
    hasOwnProperty: PropertyKey => Boolean,
    hierarchy: String,
    id: Double,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    title: String
  ): Report = {
    val __obj = js.Dynamic.literal(constructor = constructor, description = description, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), hierarchy = hierarchy, id = id, name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), title = title)
  
    __obj.asInstanceOf[Report]
  }
}

