package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeaturesFetchFeaturesScreenPoint extends StObject {
  
  /**
  		 * The x coordinate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#fetchFeatures)
  		 */
  var x: Double
  
  /**
  		 * The y coordinate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#fetchFeatures)
  		 */
  var y: Double
}
object FeaturesFetchFeaturesScreenPoint {
  
  inline def apply(x: Double, y: Double): FeaturesFetchFeaturesScreenPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeaturesFetchFeaturesScreenPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeaturesFetchFeaturesScreenPoint] (val x: Self) extends AnyVal {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
