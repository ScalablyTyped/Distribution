package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`cursor-update`
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorUpdateEventInfo
  extends Object
     with CreateToolEventInfo {
  /**
    * An array of numbers representing the coordinates of the cursor location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#CursorUpdateEventInfo)
    */
  var coordinates: js.Array[Double]
  /**
    * Type is always `cursor-update`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#CursorUpdateEventInfo)
    */
  var `type`: `cursor-update`
}

object CursorUpdateEventInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    coordinates: js.Array[Double],
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `cursor-update`
  ): CursorUpdateEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorUpdateEventInfo]
  }
}

