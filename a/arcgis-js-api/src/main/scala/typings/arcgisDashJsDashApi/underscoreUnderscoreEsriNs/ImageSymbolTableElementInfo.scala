package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageSymbolTableElementInfo
  extends Object
     with SymbolTableElementType {
  /**
    * The height of the image in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ImageSymbolTableElementInfo)
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The label of the category corresponding to the given image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ImageSymbolTableElementInfo)
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * The opacity of the image (`0` to `1`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ImageSymbolTableElementInfo)
    */
  var opacity: Double
  /**
    * The data URI of the image representing a colored pixel in the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ImageSymbolTableElementInfo)
    */
  var src: String
  /**
    * The width of the image in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ImageSymbolTableElementInfo)
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ImageSymbolTableElementInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    src: String,
    height: Int | Double = null,
    label: String = null,
    width: Int | Double = null
  ): ImageSymbolTableElementInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), opacity = opacity, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), src = src)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageSymbolTableElementInfo]
  }
}

