package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.all
import typings.arcgisJsApi.arcgisJsApiStrings.popup
import typings.arcgisJsApi.arcgisJsApiStrings.top_
import typings.arcgisJsApi.arcgisJsApiStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentifyParameters
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Resolution of the current map view in dots per inch.
    *
    * @default 96
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#dpi)
    */
  var dpi: Double = js.native
  
  /**
    * Specify the geodatabase version to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#gdbVersion)
    */
  var gdbVersion: String = js.native
  
  /**
    * The geometry used to select features during the Identify operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#geometry)
    */
  var geometry: Geometry_ = js.native
  
  /**
    * Specify the number of decimal places for the geometries returned by the task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#geometryPrecision)
    */
  var geometryPrecision: Double = js.native
  
  /**
    * Height of the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) in pixels.
    *
    * @default 400
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#height)
    */
  var height: Double = js.native
  
  /**
    * The layers on which to perform the identify operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#layerIds)
    */
  var layerIds: js.Array[Double] = js.native
  
  /**
    * Specifies which layers to use when using Identify.
    *
    * @default top
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#layerOption)
    */
  var layerOption: top_ | visible | all | popup = js.native
  
  /**
    * The Extent or bounding box of the current map view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#mapExtent)
    */
  var mapExtent: Extent = js.native
  
  /**
    * The maximum allowable offset used for generalizing geometries returned by the identify operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#maxAllowableOffset)
    */
  var maxAllowableOffset: Double = js.native
  
  /**
    * If `true`, field names will be returned instead of field aliases.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#returnFieldName)
    */
  var returnFieldName: Boolean = js.native
  
  /**
    * If `true`, the result set includes the geometry associated with each result.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#returnGeometry)
    */
  var returnGeometry: Boolean = js.native
  
  /**
    * When `true`, indicates that M values will be returned.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#returnM)
    */
  var returnM: Boolean = js.native
  
  /**
    * If `true`, the values in the result will not be formatted i.e.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#returnUnformattedValues)
    */
  var returnUnformattedValues: Boolean = js.native
  
  /**
    * When `true`, indicates that z-values will be returned.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#returnZ)
    */
  var returnZ: Boolean = js.native
  
  /**
    * The spatial reference of the input and output geometries as well as of the [mapExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#mapExtent).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  
  /**
    * An [Collection](esri-core-Collection.html) of [Sublayer](esri-layers-support-Sublayer.html) objects used to change the layer ordering and/or rendering, or redefine the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#sublayers)
    */
  var sublayers: js.Array[Sublayer] = js.native
  
  /**
    * Specify the time extent used by identify.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#timeExtent)
    */
  var timeExtent: TimeExtent = js.native
  
  /**
    * The distance in screen pixels from the specified geometry within which the identify should be performed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#tolerance)
    */
  var tolerance: Double = js.native
  
  /**
    * Width of the current map view in pixels.
    *
    * @default 400
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#width)
    */
  var width: Double = js.native
}
