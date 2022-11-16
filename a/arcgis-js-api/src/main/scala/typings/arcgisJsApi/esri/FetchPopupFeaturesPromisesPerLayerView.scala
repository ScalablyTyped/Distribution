package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchPopupFeaturesPromisesPerLayerView extends StObject {
  
  /**
    * The associated [layerview](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) in which the features are fetched.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#FetchPopupFeaturesPromisesPerLayerView)
    */
  var layerView: LayerView
  
  /**
    * A promise containing an array of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) for the selected location associated with a specific [layerview](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#FetchPopupFeaturesPromisesPerLayerView)
    */
  var promise: js.Promise[js.Array[Graphic]]
}
object FetchPopupFeaturesPromisesPerLayerView {
  
  inline def apply(layerView: LayerView, promise: js.Promise[js.Array[Graphic]]): FetchPopupFeaturesPromisesPerLayerView = {
    val __obj = js.Dynamic.literal(layerView = layerView.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchPopupFeaturesPromisesPerLayerView]
  }
  
  extension [Self <: FetchPopupFeaturesPromisesPerLayerView](x: Self) {
    
    inline def setLayerView(value: LayerView): Self = StObject.set(x, "layerView", value.asInstanceOf[js.Any])
    
    inline def setPromise(value: js.Promise[js.Array[Graphic]]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
  }
}
