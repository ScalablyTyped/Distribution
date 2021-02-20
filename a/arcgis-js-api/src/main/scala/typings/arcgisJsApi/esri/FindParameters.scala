package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindParameters
  extends Accessor
     with JSONSupport {
  
  /**
    * Determines whether to look for an exact match of the search text or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#contains)
    */
  var contains: Boolean = js.native
  
  /**
    * Specify the geodatabase version to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#gdbVersion)
    */
  var gdbVersion: String = js.native
  
  /**
    * Specify the number of decimal places for the geometries returned by the task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#geometryPrecision)
    */
  var geometryPrecision: Double = js.native
  
  /**
    * The layers to perform the find operation on.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#layerIds)
    */
  var layerIds: js.Array[Double] = js.native
  
  /**
    * The maximum allowable offset used for generalizing geometries returned by the find operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#maxAllowableOffset)
    */
  var maxAllowableOffset: Double = js.native
  
  /**
    * The spatial reference of the output geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#outSpatialReference)
    */
  var outSpatialReference: SpatialReference = js.native
  
  /**
    * If `true`, the output will include the geometry associated with each result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#returnGeometry)
    */
  var returnGeometry: Boolean = js.native
  
  /**
    * The names of the fields of a layer to search.
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
