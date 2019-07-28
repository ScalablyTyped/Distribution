package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageServiceIdentifyParameters
  extends Accessor
     with JSONSupport {
  /**
    * Input geometry that defines the location to be identified. The location can be a point or a polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#geometry)
    */
  var geometry: Point | Polygon = js.native
  /**
    * Controls the maximum number of returned catalog items, set to 1 to return the top most raster only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#maxItemCount)
    */
  var maxItemCount: Double = js.native
  /**
    * Specifies the mosaic rules defining the image sorting order. When a mosaic rule is not specified, `center` is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#mosaicRule)
    */
  var mosaicRule: MosaicRule = js.native
  /**
    * Specifies the pixel level being identified on the x and y axis. Defaults to the base resolution of the dataset when not specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#pixelSize)
    */
  var pixelSize: Point = js.native
  /**
    * The pixel level being identified (or the resolution being looked at) on the x-axis. If not specified, it will default to the base resolution of the dataset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#pixelSizeX)
    */
  var pixelSizeX: Double = js.native
  /**
    * The pixel level being identified (or the resolution being looked at) on the y-axis. If not specified, it will default to the base resolution of the dataset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#pixelSizeY)
    */
  var pixelSizeY: Double = js.native
  /**
    * Specifies the rendering rule for how the requested image should be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#renderingRule)
    */
  var renderingRule: RasterFunction = js.native
  /**
    * An array the [rendering rules](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#renderingRule) to retrieve multiple processed pixel values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#renderingRules)
    */
  var renderingRules: RasterFunction = js.native
  /**
    * If `true`, returns both geometry and attributes of the catalog items. Set to `false` when catalog items are not needed to significantly improve identify operation's performance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#returnCatalogItems)
    */
  var returnCatalogItems: Boolean = js.native
  /**
    * When `true`, each feature in the catalog items includes the geometry. Set to `false` to not display the features on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#returnGeometry)
    *
    * @default false
    */
  var returnGeometry: Boolean = js.native
  /**
    * If `true`, the pixel values of all raster catalog items under the requested geometry. Set to `false` when catalog item values are not needed to significantly improve identify operation's performance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#returnPixelValues)
    */
  var returnPixelValues: Boolean = js.native
  /**
    * A time extent for a temporal data against [time-aware imagery layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#timeInfo). For example, it can be used to discover land cover changes by decade.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#timeExtent)
    */
  var timeExtent: TimeExtent = js.native
}

@JSGlobal("__esri.ImageServiceIdentifyParameters")
@js.native
class ImageServiceIdentifyParametersCls () extends ImageServiceIdentifyParameters {
  def this(properties: ImageServiceIdentifyParametersProperties) = this()
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

