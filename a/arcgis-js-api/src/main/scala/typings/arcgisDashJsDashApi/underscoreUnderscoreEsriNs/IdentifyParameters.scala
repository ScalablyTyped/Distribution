package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentifyParameters extends Accessor {
  /**
    * Resolution of the current map view in dots per inch.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#dpi)
    *
    * @default 96
    */
  var dpi: Double = js.native
  /**
    * The geometry used to select features during the Identify operation. The type of the geometry is specified by [Geometry.type](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#type). The most common geometry used with Identify is a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#geometry)
    */
  var geometry: Geometry = js.native
  /**
    * Specify the number of decimal places for the geometries returned by the task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#geometryPrecision)
    */
  var geometryPrecision: Double = js.native
  /**
    * Height of the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#height)
    *
    * @default 400
    */
  var height: Double = js.native
  /**
    * The layers on which to perform the identify operation. The layers are specified as a comma-separated list of layer IDs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#layerIds)
    */
  var layerIds: js.Array[Double] = js.native
  /**
    * Specifies which layers to use when using Identify.
    *
    * Possible values | Description
    * --------------- | -----------
    * top | Only the top-most visible layer on the service is identified.
    * visible | All visible layers on the service are identified.
    * all | All layers on the service are identified, even if they are not visible. If your service has many layers, a request using this option will not perform well. A visible layer means you can see it in the map at the current extent.  If a layer is turned off or not in range based on its scale dependency settings, it cannot be identified.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#layerOption)
    *
    * @default top
    */
  var layerOption: String = js.native
  /**
    * The Extent or bounding box of the current map view. The `mapExtent` property is assumed to be in the spatial reference of the map unless [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#spatialReference) has been specified.  The values for [mapExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#mapExtent), [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#height), [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#width), and [dpi](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#dpi) are used to determine the current map scale. Once the scale is known, the map service can exclude layers based on their scale dependency settings. The map service is not performing a spatial intersection based on the provided extent. These properties are also used to calculate the search distance on the map based on the tolerance in screen pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#mapExtent)
    */
  var mapExtent: Extent = js.native
  /**
    * The maximum allowable offset used for generalizing geometries returned by the identify operation. The offset is in the units of the [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#spatialReference). If a [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#spatialReference) is not defined the spatial reference of the view is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#maxAllowableOffset)
    */
  var maxAllowableOffset: Double = js.native
  /**
    * If `true`, field names will be returned instead of field aliases. Requires ArcGIS Server service 10.5 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnFieldName)
    *
    * @default false
    */
  var returnFieldName: Boolean = js.native
  /**
    * If `true`, the result set includes the geometry associated with each result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnGeometry)
    *
    * @default false
    */
  var returnGeometry: Boolean = js.native
  /**
    * When `true`, indicates that M values will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnM)
    *
    * @default false
    */
  var returnM: Boolean = js.native
  /**
    * If `true`, the values in the result will not be formatted i.e. numbers will returned as is and dates will be returned as epoch values. Requires ArcGIS Server service 10.5 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnUnformattedValues)
    *
    * @default false
    */
  var returnUnformattedValues: Boolean = js.native
  /**
    * When `true`, indicates that Z values will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnZ)
    *
    * @default false
    */
  var returnZ: Boolean = js.native
  /**
    * The spatial reference of the input and output geometries as well as of the [mapExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#mapExtent). If the spatial reference is not specified, the geometry and the extent are assumed to be in the spatial reference of the view, and the output geometries will also be in the spatial reference of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  /**
    * The distance in screen pixels from the specified geometry within which the identify should be performed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#tolerance)
    */
  var tolerance: Double = js.native
  /**
    * Width of the current map view in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#width)
    *
    * @default 400
    */
  var width: Double = js.native
  /**
    * Converts an instance of  [this class]() to its ArcGIS portal JSON representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#toJSON)
    *
    *
    */
  def toJSON(): js.Any = js.native
}

@JSGlobal("__esri.IdentifyParameters")
@js.native
class IdentifyParametersCls () extends IdentifyParameters {
  def this(properties: IdentifyParametersProperties) = this()
}

