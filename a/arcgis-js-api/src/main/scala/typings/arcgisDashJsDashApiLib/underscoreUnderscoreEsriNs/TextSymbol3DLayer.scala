package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextSymbol3DLayer
  extends Symbol3DLayer
     with arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.symbolsNs.Symbol3DLayer
     with symbolsSymbol3DLayer {
  /**
    * The font of the text label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#font)
    */
  var font: Font = js.native
  /**
    * The halo surrounding the text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#halo)
    */
  var halo: TextSymbol3DLayerHalo = js.native
  /**
    * Size of the text label in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`). When set, this property overrides the [font.size](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#size) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#size)
    *
    * @default 9
    */
  var size: scala.Double = js.native
  /**
    * The text to be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#text)
    */
  var text: java.lang.String = js.native
  /**
    * For TextSymbol3DLayer the type is always `text`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#type)
    */
  @JSName("type")
  val type_TextSymbol3DLayer: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.text = js.native
}

