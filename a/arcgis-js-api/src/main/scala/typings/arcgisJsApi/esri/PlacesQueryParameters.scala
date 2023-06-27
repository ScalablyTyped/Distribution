package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacesQueryParameters
  extends StObject
     with PlacesParameters {
  
  /**
  		 * Filters places to those that match the category Ids.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryParameters.html#categoryIds)
  		 */
  var categoryIds: js.Array[String] = js.native
  
  /**
  		 * The extent of the bounding box to be searched inside.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryParameters.html#extent)
  		 */
  var extent: Extent = js.native
  
  /**
  		 * Request results starting from the given offset.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryParameters.html#offset)
  		 */
  var offset: Double = js.native
  
  /**
  		 * The number of places that should be sent in the response for a single request.
  		 *
  		 * @default 10
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryParameters.html#pageSize)
  		 */
  var pageSize: Double = js.native
  
  /**
  		 * A location defined by X and Y coordinates.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryParameters.html#point)
  		 */
  var point: Point = js.native
  
  /**
  		 * The radius in meters to search for places, measured from the supplied [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryParameters.html#point).
  		 *
  		 * @default 1000
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryParameters.html#radius)
  		 */
  var radius: Double = js.native
  
  /**
  		 * Free search text for places against names, categories, etc.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryParameters.html#searchText)
  		 */
  var searchText: String = js.native
}
