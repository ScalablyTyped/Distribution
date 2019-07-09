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
    * The material used to color the text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#material)
    */
  var material: TextSymbol3DLayerMaterial = js.native
  /**
    * Size of the text label in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`). When set, this property overrides the [font.size](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#size) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#size)
    *
    * @default 9
    */
  var size: scala.Double = js.native
  /**
    * The text to be displayed. To manually create a new line, use the `\n` escape character.
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

@JSGlobal("__esri.TextSymbol3DLayer")
@js.native
/**
  * TextSymbol3DLayer is used to draw text labels for features of any geometry type. This is typically done by adding it to a [LabelSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html) in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) does not support 3D symbols.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html)
  */
class TextSymbol3DLayerCls () extends TextSymbol3DLayer {
  def this(properties: TextSymbol3DLayerProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

