package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindParameters
  extends Accessor
     with JSONSupport {
  /**
    * Determines whether to look for an exact match of the search text or not. If `true`, searches for a value that contains the provided [searchText](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#searchText). This is a case-insensitive search. If `false`, searches for an exact match of the [searchText](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#searchText) string. The exact match is case-sensitive.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#contains)
    *
    * @default true
    */
  var contains: Boolean = js.native
  /**
    * Specify the number of decimal places for the geometries returned by the task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#geometryPrecision)
    */
  var geometryPrecision: Double = js.native
  /**
    * The layers to perform the find operation on. The layers are specified as a comma-separated list of layer ids. The list of ids is returned in [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html) layerInfos.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#layerIds)
    */
  var layerIds: js.Array[Double] = js.native
  /**
    * The maximum allowable offset used for generalizing geometries returned by the find operation. The offset is in the units of [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#outSpatialReference). If [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#outSpatialReference) is not defined, the spatial reference of the map is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#maxAllowableOffset)
    */
  var maxAllowableOffset: Double = js.native
  /**
    * The spatial reference of the output geometries. If this is not specified, the output geometries are returned in the spatial reference of the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#outSpatialReference)
    */
  var outSpatialReference: SpatialReference = js.native
  /**
    * If `true`, the output will include the geometry associated with each result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#returnGeometry)
    *
    * @default false
    */
  var returnGeometry: Boolean = js.native
  /**
    * The names of the fields of a layer to search. The fields are specified as a comma-separated list of field names. If this parameter is not specified, all fields are searched by default.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#searchFields)
    */
  var searchFields: js.Array[String] = js.native
  /**
    * The text that is searched across the layers and the fields as specified in the `layers` and [searchFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#searchFields) properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#searchText)
    */
  var searchText: String = js.native
}

@JSGlobal("__esri.FindParameters")
@js.native
object FindParameters extends TopLevel[FindParametersConstructor]

