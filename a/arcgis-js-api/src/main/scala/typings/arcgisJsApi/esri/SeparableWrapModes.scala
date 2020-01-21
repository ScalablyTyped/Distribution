package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.clamp
import typings.arcgisJsApi.arcgisJsApiStrings.mirror
import typings.arcgisJsApi.arcgisJsApiStrings.repeat
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
  var horizontal: clamp | repeat | mirror
  /**
    * Vertical wrapping mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#SeparableWrapModes)
    */
  var vertical: clamp | repeat | mirror
}

object SeparableWrapModes {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    horizontal: clamp | repeat | mirror,
    propertyIsEnumerable: PropertyKey => Boolean,
    vertical: clamp | repeat | mirror
  ): SeparableWrapModes = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), horizontal = horizontal.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), vertical = vertical.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SeparableWrapModes]
  }
}

