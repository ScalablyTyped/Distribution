package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupViewModelFetchFeaturesScreenPoint extends StObject {
  
  /**
    * The x coordinate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#fetchFeatures)
    */
  var x: Double
  
  /**
    * The y coordinate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#fetchFeatures)
    */
  var y: Double
}
object PopupViewModelFetchFeaturesScreenPoint {
  
  inline def apply(x: Double, y: Double): PopupViewModelFetchFeaturesScreenPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupViewModelFetchFeaturesScreenPoint]
  }
  
  extension [Self <: PopupViewModelFetchFeaturesScreenPoint](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
