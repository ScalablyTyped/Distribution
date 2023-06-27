package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`envelope-intersects`
import typings.arcgisJsApi.arcgisJsApiStrings.`index-intersects`
import typings.arcgisJsApi.arcgisJsApiStrings.contains
import typings.arcgisJsApi.arcgisJsApiStrings.crosses
import typings.arcgisJsApi.arcgisJsApiStrings.envelope
import typings.arcgisJsApi.arcgisJsApiStrings.intersects
import typings.arcgisJsApi.arcgisJsApiStrings.layer
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.overlaps
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import typings.arcgisJsApi.arcgisJsApiStrings.relation
import typings.arcgisJsApi.arcgisJsApiStrings.touches
import typings.arcgisJsApi.arcgisJsApiStrings.within
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataLayer
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * If true, restricted network elements should be considered when finding network locations.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DataLayer.html#doNotLocateOnRestrictedElements)
  		 */
  var doNotLocateOnRestrictedElements: Boolean = js.native
  
  /**
  		 * The geometry to apply to the spatial filter.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DataLayer.html#geometry)
  		 */
  var geometry: Geometry_ = js.native
  
  /**
  		 * The type of geometry specified by the [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DataLayer.html#geometry) property.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DataLayer.html#geometryType)
  		 */
  var geometryType: point | polyline | polygon | envelope | multipoint = js.native
  
  /**
  		 * The name of the data layer in the map service that is being referenced.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DataLayer.html#name)
  		 */
  var name: String = js.native
  
  /**
  		 * The spatial relationship to be applied on the input geometry while performing the query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DataLayer.html#spatialRelationship)
  		 */
  var spatialRelationship: intersects | contains | crosses | `envelope-intersects` | `index-intersects` | overlaps | touches | within | relation = js.native
  
  var `type`: layer = js.native
  
  /**
  		 * A where clause for the query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DataLayer.html#where)
  		 */
  var where: String = js.native
}
