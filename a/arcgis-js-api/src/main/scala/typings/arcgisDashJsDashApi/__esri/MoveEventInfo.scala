package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`move-start`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`move-stop`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.move
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveEventInfo
  extends Object
     with UpdateToolEventInfo {
  /**
    * Number of pixels moved on the x-axis from the last known position.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#MoveEventInfo)
    */
  var dx: Double
  /**
    * Number of pixels moved on the y-axis from the last known position.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#MoveEventInfo)
    */
  var dy: Double
  /**
    * The instance of the graphic that is being moved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#MoveEventInfo)
    */
  var mover: Graphic
  /**
    * Returns information indicating the stage of the move operation.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * move-start | The type changes to `move-start` at the start of `move` operation.
    * move | The type changes to `move` while graphics are being moved.
    * move-stop | The type changes to `move-stop` once graphics are moved.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#MoveEventInfo)
    */
  var `type`: `move-start` | move | `move-stop`
}

object MoveEventInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    dx: Double,
    dy: Double,
    hasOwnProperty: PropertyKey => Boolean,
    mover: Graphic,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `move-start` | move | `move-stop`
  ): MoveEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mover = mover.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveEventInfo]
  }
}

