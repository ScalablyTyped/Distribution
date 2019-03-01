package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconSymbol3DLayer
  extends Symbol3DLayer
     with arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.symbolsNs.Symbol3DLayer
     with symbolsSymbol3DLayer {
  /**
    * The positioning of the icon relative to the geometry.  **Possible values:** center | left | right | top | bottom | top-left | top-right | bottom-left | bottom-right
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchor)
    *
    * @default center
    */
  var anchor: java.lang.String = js.native
  /**
    * The outline of the icon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#outline)
    */
  var outline: IconSymbol3DLayerOutline = js.native
  /**
    * The shape (`primitive`) or image URL (`href`) used to visualize the features. If both properties are present, `href` takes precedence and `primitive` is ignored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#resource)
    *
    * @default { primitive: "circle" }
    */
  var resource: IconSymbol3DLayerResource = js.native
  /**
    * The size of the icon in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#size)
    *
    * @default 12
    */
  var size: scala.Double = js.native
  /**
    * For IconSymbol3DLayer the type is always `icon`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#type)
    */
  @JSName("type")
  val type_IconSymbol3DLayer: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.icon = js.native
}

