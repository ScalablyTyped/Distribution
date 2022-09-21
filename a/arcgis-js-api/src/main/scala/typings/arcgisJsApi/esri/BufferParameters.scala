package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferParameters
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The spatial reference in which the geometries are buffered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BufferParameters.html#bufferSpatialReference)
    */
  var bufferSpatialReference: SpatialReference = js.native
  
  /**
    * The distances the input features are buffered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BufferParameters.html#distances)
    */
  var distances: js.Array[Double] = js.native
  
  /**
    * If the input geometries are in a geographic coordinate system, set geodesic to `true` to generate a buffer polygon using a geodesic distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BufferParameters.html#geodesic)
    */
  var geodesic: Boolean = js.native
  
  /**
    * The input geometries to buffer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BufferParameters.html#geometries)
    */
  var geometries: js.Array[Geometry_] = js.native
  
  /**
    * The spatial reference for the returned geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BufferParameters.html#outSpatialReference)
    */
  var outSpatialReference: SpatialReference = js.native
  
  /**
    * If `true`, all geometries buffered at a given distance are unioned into a single (possibly multipart) polygon, and the unioned geometry is placed in the output array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BufferParameters.html#unionResults)
    */
  var unionResults: Boolean = js.native
  
  /**
    * The units for calculating each buffer distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BufferParameters.html#unit)
    */
  var unit: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards = js.native
}
