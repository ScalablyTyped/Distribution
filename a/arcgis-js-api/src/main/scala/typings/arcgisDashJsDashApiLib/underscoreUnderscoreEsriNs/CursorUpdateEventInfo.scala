package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorUpdateEventInfo
  extends stdLib.Object
     with CreateToolEventInfo {
  /**
    * An array of numbers representing the coordinates of the cursor location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#CursorUpdateEventInfo)
    */
  var coordinates: js.Array[scala.Double]
  /**
    * Type is always `cursor-update`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#CursorUpdateEventInfo)
    */
  var `type`: java.lang.String
}

object CursorUpdateEventInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    coordinates: js.Array[scala.Double],
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    `type`: java.lang.String
  ): CursorUpdateEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, coordinates = coordinates, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CursorUpdateEventInfo]
  }
}

