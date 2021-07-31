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
trait DensifyParameters
  extends StObject
     with Accessor {
  
  /**
    * If `true`, Geographic Coordinate System spatial references are used or densify geodesic will be performed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DensifyParameters.html#geodesic)
    */
  var geodesic: Boolean = js.native
  
  /**
    * The array of geometries to be densified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DensifyParameters.html#geometries)
    */
  var geometries: js.Array[Geometry_] = js.native
  
  /**
    * The length unit of `maxSegmentLength`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DensifyParameters.html#lengthUnit)
    */
  var lengthUnit: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards = js.native
  
  /**
    * All segments longer than `maxSegmentLength` are replaced with sequences of lines no longer than `maxSegmentLength.`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DensifyParameters.html#maxSegmentLength)
    */
  var maxSegmentLength: Double = js.native
  
  /**
    * Converts an instance of  [this class]() to its ArcGIS portal JSON representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DensifyParameters.html#toJSON)
    */
  def toJSON(): js.Any = js.native
}
