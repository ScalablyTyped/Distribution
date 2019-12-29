package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`cursor-update`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`vertex-add`
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.arcgisDashJsDashApi.__esri.VertexAddEventInfo
  - typings.arcgisDashJsDashApi.__esri.CursorUpdateEventInfo
*/
trait CreateToolEventInfo extends js.Object

object CreateToolEventInfo {
  @scala.inline
  def VertexAddEventInfo(
    added: js.Array[Graphic],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `vertex-add`
  ): CreateToolEventInfo = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateToolEventInfo]
  }
  @scala.inline
  def CursorUpdateEventInfo(
    constructor: js.Function,
    coordinates: js.Array[Double],
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `cursor-update`
  ): CreateToolEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateToolEventInfo]
  }
}

