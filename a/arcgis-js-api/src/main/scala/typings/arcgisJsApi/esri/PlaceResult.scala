package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaceResult
  extends StObject
     with Accessor {
  
  /**
  		 * An arrary of category objects for a place.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlaceResult.html#categories)
  		 */
  var categories: js.Array[Category] = js.native
  
  /**
  		 * The distance, in meters, from the place to the search point.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlaceResult.html#distance)
  		 */
  var distance: Double = js.native
  
  /**
  		 * A location defined by X and Y coordinates in WGS84.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlaceResult.html#location)
  		 */
  var location: Point = js.native
  
  /**
  		 * The name of the place, or point of interest.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlaceResult.html#name)
  		 */
  var name: String = js.native
  
  /**
  		 * The unique Id of this place.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlaceResult.html#placeId)
  		 */
  var placeId: String = js.native
}
