package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationProfileSample extends StObject {
  
  /**
    * Distance from the beginning of the path, in the effective selected by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#ElevationProfileSample)
    */
  var distance: Double
  
  /**
    * The elevation of the sample, in the effective units selected by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#ElevationProfileSample)
    */
  var elevation: js.UndefOr[Double] = js.undefined
  
  /**
    * The x coordinate of the sample, in the spatial reference of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#ElevationProfileSample)
    */
  var x: Double
  
  /**
    * The y coordinate of the sample, in the spatial reference of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#ElevationProfileSample)
    */
  var y: Double
  
  /**
    * The z coordinate of the sample, in the spatial reference of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#ElevationProfileSample)
    */
  var z: js.UndefOr[Double] = js.undefined
}
object ElevationProfileSample {
  
  inline def apply(distance: Double, x: Double, y: Double): ElevationProfileSample = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElevationProfileSample]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElevationProfileSample] (val x: Self) extends AnyVal {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
