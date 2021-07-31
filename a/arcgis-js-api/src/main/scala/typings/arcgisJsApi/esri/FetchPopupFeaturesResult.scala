package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchPopupFeaturesResult
  extends StObject
     with Object {
  
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
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): FetchPopupFeaturesResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[FetchPopupFeaturesResult]
  }
  
  @scala.inline
  implicit class FetchPopupFeaturesResultMutableBuilder[Self <: FetchPopupFeaturesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllGraphicsPromise(value: js.Promise[js.Array[Graphic]]): Self = StObject.set(x, "allGraphicsPromise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllGraphicsPromiseUndefined: Self = StObject.set(x, "allGraphicsPromise", js.undefined)
    
    @scala.inline
    def setClientOnlyGraphics(value: js.Array[Graphic]): Self = StObject.set(x, "clientOnlyGraphics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOnlyGraphicsUndefined: Self = StObject.set(x, "clientOnlyGraphics", js.undefined)
    
    @scala.inline
    def setClientOnlyGraphicsVarargs(value: Graphic*): Self = StObject.set(x, "clientOnlyGraphics", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: Point): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setPromisesPerLayerView(value: js.Array[FetchPopupFeaturesPromisesPerLayerView]): Self = StObject.set(x, "promisesPerLayerView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromisesPerLayerViewUndefined: Self = StObject.set(x, "promisesPerLayerView", js.undefined)
    
    @scala.inline
    def setPromisesPerLayerViewVarargs(value: FetchPopupFeaturesPromisesPerLayerView*): Self = StObject.set(x, "promisesPerLayerView", js.Array(value :_*))
  }
}
