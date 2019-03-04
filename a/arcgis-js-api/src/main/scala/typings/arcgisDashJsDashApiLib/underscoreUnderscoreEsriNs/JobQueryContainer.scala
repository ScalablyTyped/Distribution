package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobQueryContainer
  extends stdLib.Object {
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
  var id: scala.Double
  /**
    * The name of the query container.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobQueryContainer)
    */
  var name: java.lang.String
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
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    id: scala.Double,
    name: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    queries: js.Array[JobQuery]
  ): JobQueryContainer = {
    val __obj = js.Dynamic.literal(constructor = constructor, containers = containers, hasOwnProperty = hasOwnProperty, id = id, name = name, propertyIsEnumerable = propertyIsEnumerable, queries = queries)
  
    __obj.asInstanceOf[JobQueryContainer]
  }
}

