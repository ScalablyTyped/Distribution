package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMembership
  extends stdLib.Object {
  /**
    * The unique id for the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#GroupMembership)
    */
  var id: scala.Double
  /**
    * The name of the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#GroupMembership)
    */
  var name: java.lang.String
}

object GroupMembership {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    id: scala.Double,
    name: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): GroupMembership = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, id = id, name = name, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[GroupMembership]
  }
}

