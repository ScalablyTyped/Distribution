package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageServiceIdentifyParameters extends Accessor {
  /**
    * Input geometry that defines the location to be identified. The location can be a point or a polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#geometry)
    */
  var geometry: Point | Polygon = js.native
  /**
    * Specifies the mosaic rules defining the image sorting order. When a mosaic rule is not specified, `center` is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#mosaicRule)
    */
  var mosaicRule: MosaicRule = js.native
  /**
    * The pixel or RGB color value representing no information. It can be defined as a number `noData = 0` representing a pixel value or as a string `noData = "58,128,187"` representing an RGB color value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#noData)
    */
  var noData: java.lang.String | scala.Double = js.native
  /**
    * Specifies the pixel level being identified on the x and y axis. Defaults to the base resolution of the dataset when not specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#pixelSize)
    */
  var pixelSize: Symbol = js.native
  /**
    * The pixel level being identified (or the resolution being looked at) on the x-axis. If not specified, it will default to the base resolution of the dataset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#pixelSizeX)
    */
  var pixelSizeX: scala.Double = js.native
  /**
    * The pixel level being identified (or the resolution being looked at) on the y-axis. If not specified, it will default to the base resolution of the dataset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#pixelSizeY)
    */
  var pixelSizeY: scala.Double = js.native
  /**
    * Specifies the rendering rule for how the requested image should be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#renderingRule)
    */
  var renderingRule: RasterFunction = js.native
  /**
    * If `true`, returns both geometry and attributes of the catalog items. Set to `false` when catalog items are not needed to significantly improve identify operation's performance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#returnCatalogItems)
    *
    * @default true
    */
  var returnCatalogItems: scala.Boolean = js.native
  /**
    * When `true`, each feature in the catalog items includes the geometry. Set to `false` to not display the features on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#returnGeometry)
    *
    * @default false
    */
  var returnGeometry: scala.Boolean = js.native
  /**
    * Converts an instance of  [this class]() to its ArcGIS portal JSON representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#toJSON)
    *
    *
    */
  def toJSON(): js.Any = js.native
}

