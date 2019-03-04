package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobPriority
  extends stdLib.Object {
  /**
    * The description of the priority.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobPriority)
    */
  var description: java.lang.String
  /**
    * The name of the priority.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobPriority)
    */
  var name: java.lang.String
  /**
    * The unique id of the priority.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobPriority)
    */
  var value: scala.Double
}

object JobPriority {
  @scala.inline
  def apply(
    constructor: js.Function,
    description: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    name: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    value: scala.Double
  ): JobPriority = {
    val __obj = js.Dynamic.literal(constructor = constructor, description = description, hasOwnProperty = hasOwnProperty, name = name, propertyIsEnumerable = propertyIsEnumerable, value = value)
  
    __obj.asInstanceOf[JobPriority]
  }
}

