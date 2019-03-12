package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait symbolPreviewRenderPreviewHTMLOptions
  extends stdLib.Object {
  /**
    * Indicates whether to disable upsampling for raster images.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolPreview.html#renderPreviewHTML)
    */
  var disableUpsampling: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The maximum size of the symbol preview in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolPreview.html#renderPreviewHTML)
    */
  var maxSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The parent node to append to the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolPreview.html#renderPreviewHTML)
    */
  var node: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /**
    * The opacity of the layer represented by the `symbol`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolPreview.html#renderPreviewHTML)
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates whether to scale the symbol preview.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolPreview.html#renderPreviewHTML)
    */
  var scale: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The size of the symbol preview in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolPreview.html#renderPreviewHTML)
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
    * For "tall" symbols in portrait view, then the `tall` value should be used here.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolPreview.html#renderPreviewHTML)
    */
  var symbolConfig: js.UndefOr[java.lang.String] = js.undefined
}

object symbolPreviewRenderPreviewHTMLOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    disableUpsampling: js.UndefOr[scala.Boolean] = js.undefined,
    maxSize: scala.Int | scala.Double = null,
    node: stdLib.HTMLElement = null,
    opacity: scala.Int | scala.Double = null,
    scale: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Int | scala.Double = null,
    symbolConfig: java.lang.String = null
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

