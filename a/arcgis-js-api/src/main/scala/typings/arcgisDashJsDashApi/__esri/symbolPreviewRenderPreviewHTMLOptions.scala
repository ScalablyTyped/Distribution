package typings.arcgisDashJsDashApi.__esri

import typings.std.HTMLElement
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait symbolPreviewRenderPreviewHTMLOptions extends Object {
  /**
    * Indicates whether to disable upsampling for raster images.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolPreview.html#renderPreviewHTML)
    */
  var disableUpsampling: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum size of the symbol preview in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolPreview.html#renderPreviewHTML)
    */
  var maxSize: js.UndefOr[Double] = js.undefined
  /**
    * The parent node to append to the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolPreview.html#renderPreviewHTML)
    */
  var node: js.UndefOr[HTMLElement] = js.undefined
  /**
    * The opacity of the layer represented by the `symbol`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolPreview.html#renderPreviewHTML)
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * Indicates whether to scale the symbol preview.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolPreview.html#renderPreviewHTML)
    */
  var scale: js.UndefOr[Boolean] = js.undefined
  /**
    * The size of the symbol preview in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolPreview.html#renderPreviewHTML)
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    * For "tall" symbols in portrait view, then the `tall` value should be used here.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolPreview.html#renderPreviewHTML)
    */
  var symbolConfig: js.UndefOr[String] = js.undefined
}

object symbolPreviewRenderPreviewHTMLOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    disableUpsampling: js.UndefOr[Boolean] = js.undefined,
    maxSize: Int | Double = null,
    node: HTMLElement = null,
    opacity: Int | Double = null,
    scale: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null,
    symbolConfig: String = null
  ): symbolPreviewRenderPreviewHTMLOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(disableUpsampling)) __obj.updateDynamic("disableUpsampling")(disableUpsampling)
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (symbolConfig != null) __obj.updateDynamic("symbolConfig")(symbolConfig)
    __obj.asInstanceOf[symbolPreviewRenderPreviewHTMLOptions]
  }
}

