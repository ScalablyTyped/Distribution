package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacesQueryParametersProperties
  extends StObject
     with PlacesParametersProperties {
  
  /**
  		 * Filters places to those that match the category Ids.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryParameters.html#categoryIds)
  		 */
  var categoryIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  		 * The extent of the bounding box to be searched inside.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryParameters.html#extent)
  		 */
  var extent: js.UndefOr[ExtentProperties] = js.undefined
  
  /**
  		 * Request results starting from the given offset.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryParameters.html#offset)
  		 */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The number of places that should be sent in the response for a single request.
  		 *
  		 * @default 10
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryParameters.html#pageSize)
  		 */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
  		 * A location defined by X and Y coordinates.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryParameters.html#point)
  		 */
  var point: js.UndefOr[PointProperties] = js.undefined
  
  /**
  		 * The radius in meters to search for places, measured from the supplied [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryParameters.html#point).
  		 *
  		 * @default 1000
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryParameters.html#radius)
  		 */
  var radius: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Free search text for places against names, categories, etc.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryParameters.html#searchText)
  		 */
  var searchText: js.UndefOr[String] = js.undefined
}
object PlacesQueryParametersProperties {
  
  inline def apply(): PlacesQueryParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacesQueryParametersProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlacesQueryParametersProperties] (val x: Self) extends AnyVal {
    
    inline def setCategoryIds(value: js.Array[String]): Self = StObject.set(x, "categoryIds", value.asInstanceOf[js.Any])
    
    inline def setCategoryIdsUndefined: Self = StObject.set(x, "categoryIds", js.undefined)
    
    inline def setCategoryIdsVarargs(value: String*): Self = StObject.set(x, "categoryIds", js.Array(value*))
    
    inline def setExtent(value: ExtentProperties): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPoint(value: PointProperties): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    inline def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
  }
}
