package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeodesicDistanceResult extends StObject {
  
  /**
    * The azimuth (or "bearing") in degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-geodesicUtils.html#GeodesicDistanceResult)
    */
  var azimuth: js.UndefOr[Double] = js.undefined
  
  /**
    * The distance between the two locations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-geodesicUtils.html#GeodesicDistanceResult)
    */
  var distance: js.UndefOr[Double] = js.undefined
  
  /**
    * The azimuth in degrees in the reverse direction.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-geodesicUtils.html#GeodesicDistanceResult)
    */
  var reverseAzimuth: js.UndefOr[Double] = js.undefined
}
object GeodesicDistanceResult {
  
  inline def apply(): GeodesicDistanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeodesicDistanceResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeodesicDistanceResult] (val x: Self) extends AnyVal {
    
    inline def setAzimuth(value: Double): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
    
    inline def setAzimuthUndefined: Self = StObject.set(x, "azimuth", js.undefined)
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setReverseAzimuth(value: Double): Self = StObject.set(x, "reverseAzimuth", value.asInstanceOf[js.Any])
    
    inline def setReverseAzimuthUndefined: Self = StObject.set(x, "reverseAzimuth", js.undefined)
  }
}
