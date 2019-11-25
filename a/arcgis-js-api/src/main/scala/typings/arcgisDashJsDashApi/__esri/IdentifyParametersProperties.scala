package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.all
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.top
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifyParametersProperties extends js.Object {
  /**
    * Resolution of the current map view in dots per inch.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#dpi)
    *
    * @default 96
    */
  var dpi: js.UndefOr[Double] = js.undefined
  /**
    * The geometry used to select features during the Identify operation. The type of the geometry is specified by [Geometry.type](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#type). The most common geometry used with Identify is a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#geometry)
    */
  var geometry: js.UndefOr[GeometryProperties] = js.undefined
  /**
    * Specify the number of decimal places for the geometries returned by the task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#geometryPrecision)
    */
  var geometryPrecision: js.UndefOr[Double] = js.undefined
  /**
    * Height of the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#height)
    *
    * @default 400
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The layers on which to perform the identify operation. The layers are specified as a comma-separated list of layer IDs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#layerIds)
    */
  var layerIds: js.UndefOr[js.Array[Double]] = js.undefined
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
  var layerOption: js.UndefOr[top | visible | all] = js.undefined
  /**
    * The Extent or bounding box of the current map view. The `mapExtent` property is assumed to be in the spatial reference of the map unless [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#spatialReference) has been specified.  The values for [mapExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#mapExtent), [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#height), [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#width), and [dpi](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#dpi) are used to determine the current map scale. Once the scale is known, the map service can exclude layers based on their scale dependency settings. The map service is not performing a spatial intersection based on the provided extent. These properties are also used to calculate the search distance on the map based on the tolerance in screen pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#mapExtent)
    */
  var mapExtent: js.UndefOr[ExtentProperties] = js.undefined
  /**
    * The maximum allowable offset used for generalizing geometries returned by the identify operation. The offset is in the units of the [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#spatialReference). If a [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#spatialReference) is not defined the spatial reference of the view is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#maxAllowableOffset)
    */
  var maxAllowableOffset: js.UndefOr[Double] = js.undefined
  /**
    * If `true`, field names will be returned instead of field aliases. Requires ArcGIS Server service 10.5 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnFieldName)
    *
    * @default false
    */
  var returnFieldName: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the result set includes the geometry associated with each result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnGeometry)
    *
    * @default false
    */
  var returnGeometry: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true`, indicates that M values will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnM)
    *
    * @default false
    */
  var returnM: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the values in the result will not be formatted i.e. numbers will returned as is and dates will be returned as epoch values. Requires ArcGIS Server service 10.5 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnUnformattedValues)
    *
    * @default false
    */
  var returnUnformattedValues: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true`, indicates that Z values will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnZ)
    *
    * @default false
    */
  var returnZ: js.UndefOr[Boolean] = js.undefined
  /**
    * The spatial reference of the input and output geometries as well as of the [mapExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#mapExtent). If the spatial reference is not specified, the geometry and the extent are assumed to be in the spatial reference of the view, and the output geometries will also be in the spatial reference of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  /**
    * The distance in screen pixels from the specified geometry within which the identify should be performed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#tolerance)
    */
  var tolerance: js.UndefOr[Double] = js.undefined
  /**
    * Width of the current map view in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#width)
    *
    * @default 400
    */
  var width: js.UndefOr[Double] = js.undefined
}

object IdentifyParametersProperties {
  @scala.inline
  def apply(
    dpi: Int | Double = null,
    geometry: GeometryProperties = null,
    geometryPrecision: Int | Double = null,
    height: Int | Double = null,
    layerIds: js.Array[Double] = null,
    layerOption: top | visible | all = null,
    mapExtent: ExtentProperties = null,
    maxAllowableOffset: Int | Double = null,
    returnFieldName: js.UndefOr[Boolean] = js.undefined,
    returnGeometry: js.UndefOr[Boolean] = js.undefined,
    returnM: js.UndefOr[Boolean] = js.undefined,
    returnUnformattedValues: js.UndefOr[Boolean] = js.undefined,
    returnZ: js.UndefOr[Boolean] = js.undefined,
    spatialReference: SpatialReferenceProperties = null,
    tolerance: Int | Double = null,
    width: Int | Double = null
  ): IdentifyParametersProperties = {
    val __obj = js.Dynamic.literal()
    if (dpi != null) __obj.updateDynamic("dpi")(dpi.asInstanceOf[js.Any])
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (geometryPrecision != null) __obj.updateDynamic("geometryPrecision")(geometryPrecision.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (layerIds != null) __obj.updateDynamic("layerIds")(layerIds.asInstanceOf[js.Any])
    if (layerOption != null) __obj.updateDynamic("layerOption")(layerOption.asInstanceOf[js.Any])
    if (mapExtent != null) __obj.updateDynamic("mapExtent")(mapExtent.asInstanceOf[js.Any])
    if (maxAllowableOffset != null) __obj.updateDynamic("maxAllowableOffset")(maxAllowableOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(returnFieldName)) __obj.updateDynamic("returnFieldName")(returnFieldName.asInstanceOf[js.Any])
    if (!js.isUndefined(returnGeometry)) __obj.updateDynamic("returnGeometry")(returnGeometry.asInstanceOf[js.Any])
    if (!js.isUndefined(returnM)) __obj.updateDynamic("returnM")(returnM.asInstanceOf[js.Any])
    if (!js.isUndefined(returnUnformattedValues)) __obj.updateDynamic("returnUnformattedValues")(returnUnformattedValues.asInstanceOf[js.Any])
    if (!js.isUndefined(returnZ)) __obj.updateDynamic("returnZ")(returnZ.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference.asInstanceOf[js.Any])
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifyParametersProperties]
  }
}

