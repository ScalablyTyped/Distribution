package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`move-start`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`move-stop`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`reshape-start`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`reshape-stop`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`rotate-start`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`rotate-stop`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`scale-start`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`scale-stop`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`vertex-add`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`vertex-remove`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.move
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.reshape
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.rotate
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.scale
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.arcgisDashJsDashApi.__esri.MoveEventInfo
  - typings.arcgisDashJsDashApi.__esri.ReshapeEventInfo
  - typings.arcgisDashJsDashApi.__esri.RotateEventInfo
  - typings.arcgisDashJsDashApi.__esri.ScaleEventInfo
  - typings.arcgisDashJsDashApi.__esri.VertexAddEventInfo
  - typings.arcgisDashJsDashApi.__esri.VertexRemoveEventInfo
*/
trait UpdateToolEventInfo extends js.Object

object UpdateToolEventInfo {
  @scala.inline
  def VertexRemoveEventInfo(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    removed: js.Array[Graphic],
    `type`: `vertex-remove`
  ): UpdateToolEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), removed = removed.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateToolEventInfo]
  }
  @scala.inline
  def RotateEventInfo(
    angle: Double,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `rotate-start` | rotate | `rotate-stop`
  ): UpdateToolEventInfo = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateToolEventInfo]
  }
  @scala.inline
  def VertexAddEventInfo(
    added: js.Array[Graphic],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `vertex-add`
  ): UpdateToolEventInfo = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateToolEventInfo]
  }
  @scala.inline
  def ReshapeEventInfo(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `reshape-start` | reshape | `reshape-stop`
  ): UpdateToolEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateToolEventInfo]
  }
  @scala.inline
  def MoveEventInfo(
    constructor: js.Function,
    dx: Double,
    dy: Double,
    hasOwnProperty: PropertyKey => Boolean,
    mover: Graphic,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `move-start` | move | `move-stop`
  ): UpdateToolEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mover = mover.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateToolEventInfo]
  }
  @scala.inline
  def ScaleEventInfo(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `scale-start` | scale | `scale-stop`,
    xScale: Double,
    yScale: Double
  ): UpdateToolEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateToolEventInfo]
  }
}

