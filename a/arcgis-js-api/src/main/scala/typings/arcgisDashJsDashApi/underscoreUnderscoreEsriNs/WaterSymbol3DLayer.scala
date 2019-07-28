package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.calm
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.large
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.medium
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.moderate
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.rippled
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.slight
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.small
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.water
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaterSymbol3DLayer
  extends Symbol3DLayer
     with typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.symbolsNs.Symbol3DLayer
     with symbolsSymbol3DLayer {
  /**
    * The dominant color used to shade the water. The water has different shades of the dominant color based on the reflection of the light. The image below shows how different types of water can be represented with different colors. For example for deep water the dominant color could be navy blue.  ![symbol3D-water](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbol3d-water-colors.png)  The color can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#color)
    *
    * @default #0077BE
    */
  var color: Color = js.native
  /**
    * For WaterSymbol3DLayer the type is always `water`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#type)
    */
  @JSName("type")
  val type_WaterSymbol3DLayer: water = js.native
  /**
    * Indicates the size of the waterbody which is represented by the symbol layer. `small` can be set for small lakes, rivers or swimming pools, `medium` can be set for large lakes, whereas `large` is recommended for ocean and sea waterbodies.  **Possible values:** small | medium | large
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#waterbodySize)
    *
    * @default medium
    */
  var waterbodySize: small | medium | large = js.native
  /**
    * Indicates the direction in which the waves travel. This value represents the geographic rotation in degrees and it ranges from 0 to 360 degrees. A value of 0 degrees corresponds to geographic north, which means that the wave travels from south to north.  The default is set to `null`, which will display the waves without a distinct direction.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#waveDirection)
    *
    * @default null
    */
  var waveDirection: Double = js.native
  /**
    * Indicates the shape and intensity of the waves. Currently only calm to moderate waterbodies can be represented. A `calm` wave strength represents water without waves, acting almost like a mirror. A water with `rippled` wave strength has very small and short waves. `slight` wave strength displays the waves with a more pronounced form, but they are still quite short. Choosing `moderate` will display waves with a longer form and a slightly increased intensity.  **Possible values:** calm | rippled | slight | moderate
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#waveStrength)
    *
    * @default moderate
    */
  var waveStrength: calm | rippled | slight | moderate = js.native
}

@JSGlobal("__esri.WaterSymbol3DLayer")
@js.native
/**
  * WaterSymbol3DLayer is used to render [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometries as realistic, animated water surfaces, therefore it can only be used inside a [PolygonSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html)
  */
class WaterSymbol3DLayerCls () extends WaterSymbol3DLayer {
  def this(properties: WaterSymbol3DLayerProperties) = this()
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

