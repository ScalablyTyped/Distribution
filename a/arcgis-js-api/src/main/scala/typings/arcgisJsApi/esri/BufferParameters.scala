package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferParameters extends Accessor {
  /**
    * The spatial reference in which the geometries are buffered.  If `bufferSpatialReference` is not specified, the geometries are buffered in the spatial reference specified by `outSpatialReference`. If `outSpatialReference` is also not specified, they are buffered in the spatial reference of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#bufferSpatialReference)
    */
  var bufferSpatialReference: SpatialReference = js.native
  /**
    * The distances the input features are buffered. The distance units are specified by `unit`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#distances)
    */
  var distances: js.Array[Double] = js.native
  /**
    * If the input geometries are in a geographic coordinate system, set geodesic to `true` to generate a buffer polygon using a geodesic distance. The `bufferSpatialReference` property is ignored when geodesic is set to `true`. Requires ArcGIS Server 10.1 or greater geometry service. For more information, see the ArcGIS REST API documentation on the GeometryService buffer operation and the geodesic property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#geodesic)
    */
  var geodesic: Boolean = js.native
  /**
    * The input geometries to buffer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#geometries)
    */
  var geometries: js.Array[Geometry_] = js.native
  /**
    * The spatial reference for the returned geometries.  If `outSpatialReference` is not specified, the output geometries are in the spatial reference specified by `bufferSpatialReference`. If `bufferSpatialReference` also is not specified, they are in the spatial reference of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#outSpatialReference)
    */
  var outSpatialReference: SpatialReference = js.native
  /**
    * If `true`, all geometries buffered at a given distance are unioned into a single (possibly multipart) polygon, and the unioned geometry is placed in the output array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#unionResults)
    */
  var unionResults: Boolean = js.native
  /**
    * The units for calculating each buffer distance. If `unit` is not specified, the units are derived from `bufferSpatialReference`. If `bufferSpatialReference` is not specified, the units are derived from the features.  For a list of valid units, see [esriSRUnitType Constants](http://resources.arcgis.com/en/help/arcobjects-cpp/componenthelp/index.html#/esriSRUnitType_Constants/000w00000042000000/) and [esriSRUnit2Type Constants](http://resources.arcgis.com/en/help/arcobjects-cpp/componenthelp/index.html#/esriSRUnit2Type_Constants/000w00000041000000/).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#unit)
    */
  var unit: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards = js.native
  /**
    * Converts an instance of  [this class]() to its ArcGIS portal JSON representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#toJSON)
    *
    *
    */
  def toJSON(): js.Any = js.native
}

@JSGlobal("__esri.BufferParameters")
@js.native
object BufferParameters extends TopLevel[BufferParametersConstructor]

