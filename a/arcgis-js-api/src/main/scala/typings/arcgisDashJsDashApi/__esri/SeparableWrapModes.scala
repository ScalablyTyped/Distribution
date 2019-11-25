package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.clamp
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.repeat
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeparableWrapModes extends Object {
  /**
    * Horizontal wrapping mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#SeparableWrapModes)
    */
  var horizontal: clamp | repeat
  /**
    * Vertical wrapping mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#SeparableWrapModes)
    */
  var vertical: clamp | repeat
}

object SeparableWrapModes {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    horizontal: clamp | repeat,
    propertyIsEnumerable: PropertyKey => Boolean,
    vertical: clamp | repeat
  ): SeparableWrapModes = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), horizontal = horizontal.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), vertical = vertical.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SeparableWrapModes]
  }
}

