package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchPopupFeaturesResult extends StObject {
  
  /**
  		 * An array of promises containing graphics from the selected location.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#FetchPopupFeaturesResult)
  		 */
  var allGraphicsPromise: js.UndefOr[js.Promise[js.Array[Graphic]]] = js.undefined
  
  /**
  		 * An array of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) that do not have any associated [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html), ie.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#FetchPopupFeaturesResult)
  		 */
  var clientOnlyGraphics: js.UndefOr[js.Array[Graphic]] = js.undefined
  
  /**
  		 * The resulting location of the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#hitTest)'s' `hitTest`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#FetchPopupFeaturesResult)
  		 */
  var location: js.UndefOr[Point] = js.undefined
  
  /**
  		 * An array of [FetchPopupFeaturesPromisesPerLayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#FetchPopupFeaturesPromisesPerLayerView).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#FetchPopupFeaturesResult)
  		 */
  var promisesPerLayerView: js.UndefOr[js.Array[FetchPopupFeaturesPromisesPerLayerView]] = js.undefined
}
object FetchPopupFeaturesResult {
  
  inline def apply(): FetchPopupFeaturesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchPopupFeaturesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FetchPopupFeaturesResult] (val x: Self) extends AnyVal {
    
    inline def setAllGraphicsPromise(value: js.Promise[js.Array[Graphic]]): Self = StObject.set(x, "allGraphicsPromise", value.asInstanceOf[js.Any])
    
    inline def setAllGraphicsPromiseUndefined: Self = StObject.set(x, "allGraphicsPromise", js.undefined)
    
    inline def setClientOnlyGraphics(value: js.Array[Graphic]): Self = StObject.set(x, "clientOnlyGraphics", value.asInstanceOf[js.Any])
    
    inline def setClientOnlyGraphicsUndefined: Self = StObject.set(x, "clientOnlyGraphics", js.undefined)
    
    inline def setClientOnlyGraphicsVarargs(value: Graphic*): Self = StObject.set(x, "clientOnlyGraphics", js.Array(value*))
    
    inline def setLocation(value: Point): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPromisesPerLayerView(value: js.Array[FetchPopupFeaturesPromisesPerLayerView]): Self = StObject.set(x, "promisesPerLayerView", value.asInstanceOf[js.Any])
    
    inline def setPromisesPerLayerViewUndefined: Self = StObject.set(x, "promisesPerLayerView", js.undefined)
    
    inline def setPromisesPerLayerViewVarargs(value: FetchPopupFeaturesPromisesPerLayerView*): Self = StObject.set(x, "promisesPerLayerView", js.Array(value*))
  }
}
