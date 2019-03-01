package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextSymbol3DLayerProperties extends Symbol3DLayerProperties {
  /**
    * The font of the text label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#font)
    */
  var font: js.UndefOr[FontProperties] = js.undefined
  /**
    * The halo surrounding the text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#halo)
    */
  var halo: js.UndefOr[TextSymbol3DLayerHaloProperties] = js.undefined
  /**
    * Size of the text label in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`). When set, this property overrides the [font.size](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#size) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#size)
    *
    * @default 9
    */
  var size: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The text to be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#text)
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object TextSymbol3DLayerProperties {
  @scala.inline
  def apply(
    font: FontProperties = null,
    halo: TextSymbol3DLayerHaloProperties = null,
    material: js.Any = null,
    size: scala.Double | java.lang.String = null,
    text: java.lang.String = null
  ): TextSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font)
    if (halo != null) __obj.updateDynamic("halo")(halo)
    if (material != null) __obj.updateDynamic("material")(material)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TextSymbol3DLayerProperties]
  }
}

