package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoldType
  extends stdLib.Object {
  /**
    * The description of the type of hold.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#HoldType)
    */
  var description: java.lang.String
  /**
    * The unique id for the hold type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#HoldType)
    */
  var id: scala.Double
  /**
    * The name of the hold type
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#HoldType)
    */
  var name: java.lang.String
}

object HoldType {
  @scala.inline
  def apply(
    constructor: js.Function,
    description: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    id: scala.Double,
    name: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): HoldType = {
    val __obj = js.Dynamic.literal(constructor = constructor, description = description, hasOwnProperty = hasOwnProperty, id = id, name = name, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[HoldType]
  }
}

