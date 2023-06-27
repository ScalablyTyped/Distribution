package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`us-nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureFilter
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * Creates [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) parameters that can be used to fetch features that satisfy the layer's current filters and definitions.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#createQuery)
  		 */
  def createQuery(): Query_ = js.native
  
  /**
  		 * Specifies a search distance from a given [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#geometry) in a spatial filter.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#distance)
  		 */
  var distance: Double = js.native
  
  /**
  		 * The geometry to apply to the spatial filter.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#geometry)
  		 */
  var geometry: Geometry_ = js.native
  
  /**
  		 * An array of objectIds of the features to be filtered.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#objectIds)
  		 */
  var objectIds: js.Array[Double] = js.native
  
  /**
  		 * For spatial filters, this parameter defines the spatial relationship to filter features in the layer view against the filter [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#geometry).
  		 *
  		 * @default intersects
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#spatialRelationship)
  		 */
  var spatialRelationship: String = js.native
  
  /**
  		 * A range of time with start and end date.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#timeExtent)
  		 */
  var timeExtent: TimeExtent = js.native
  
  /**
  		 * The unit for calculating the buffer distance when [distance](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#distance) is specified in a spatial filter.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#units)
  		 */
  var units: feet_ | miles_ | `nautical-miles` | `us-nautical-miles` | meters_ | kilometers_ = js.native
  
  /**
  		 * A where clause for the feature filter.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#where)
  		 */
  var where: String = js.native
}
