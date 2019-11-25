package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobQueryContainer extends Object {
  /**
    * One or more [job query containers](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobQueryContainer) which are nested under the parent container.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobQueryContainer)
    */
  var containers: js.Array[JobQueryContainer]
  /**
    * The unique id for the container.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobQueryContainer)
    */
  var id: Double
  /**
    * The name of the query container.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobQueryContainer)
    */
  var name: String
  /**
    * An array of [queries](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobQuery) inside the query container.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobQueryContainer)
    */
  var queries: js.Array[JobQuery]
}

object JobQueryContainer {
  @scala.inline
  def apply(
    constructor: js.Function,
    containers: js.Array[JobQueryContainer],
    hasOwnProperty: PropertyKey => Boolean,
    id: Double,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    queries: js.Array[JobQuery]
  ): JobQueryContainer = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], containers = containers.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), queries = queries.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JobQueryContainer]
  }
}

