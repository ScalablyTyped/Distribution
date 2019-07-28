package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`picture-marker`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.symbolsNs.Symbol2D3D because Already inherited- typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.Symbol2D3D because Already inherited */ @js.native
trait PictureMarkerSymbol
  extends MarkerSymbol
     with typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.symbolsNs.MarkerSymbol
     with typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.symbolsNs.Symbol2D
     with Symbol2D
     with symbolsMarkerSymbol {
  /**
    * The height of the image in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).  The maximum allowed height of a picture marker symbol is 200px. If you set any value higher than 200px, then the image will be scaled down to a height of 200px while preserving the aspect ratio of the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#height)
    *
    * @default 12
    */
  var height: Double = js.native
  /**
    * For PictureMarkerSymbol the type is always `picture-marker`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#type)
    */
  @JSName("type")
  val type_PictureMarkerSymbol: `picture-marker` = js.native
  /**
    * The URL to an image or SVG document. To avoid CORS issues with this symbol, do one of the following:
    *   * Make certain that the [image](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#url) is hosted on a [CORS enabled server](https://enable-cors.org/server.html).
    *   * Use an [image](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#url) hosted on the same domain as the application.
    *   * Install a proxy.
    *
    *
    * > **Known Limitations**
    *   * Using this property to render SVG documents as images is not supported in IE11.
    *   * SVG documents must include a definition for width and height to load properly in Firefox.
    *   * Animated gif/png images are not supported. See the [Custom WebGL layer view](https://developers.arcgis.com/javascript/latest/sample-code/custom-gl-visuals/index.html) sample to learn how to accomplish this using WebGL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#url)
    */
  var url: String = js.native
  /**
    * The width of the image in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).  The maximum allowed width of a picture marker symbol is 200px. If you set any value higher than 200px, then the image will be scaled down to a width of 200px while preserving the aspect ratio of the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#width)
    *
    * @default 12
    */
  var width: Double = js.native
}

@JSGlobal("__esri.PictureMarkerSymbol")
@js.native
/**
  * PictureMarkerSymbol renders [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) graphics in either a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) using an image. A [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#url) must point to a valid image. PictureMarkerSymbols may be applied to point features in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) or individual [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html). The image below depicts a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) whose point features are styled with a [PictureMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html)
  */
class PictureMarkerSymbolCls () extends PictureMarkerSymbol {
  def this(properties: PictureMarkerSymbolProperties) = this()
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

