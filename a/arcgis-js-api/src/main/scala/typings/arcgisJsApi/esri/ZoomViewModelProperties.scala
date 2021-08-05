package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoomViewModelProperties extends StObject {
  
  /**
    * Indicates if the view can zoom in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom-ZoomViewModel.html#canZoomIn)
    */
  var canZoomIn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if the view can zoom out.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom-ZoomViewModel.html#canZoomOut)
    */
  var canZoomOut: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The view from which to operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom-ZoomViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
}
object ZoomViewModelProperties {
  
  inline def apply(): ZoomViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomViewModelProperties]
  }
  
  extension [Self <: ZoomViewModelProperties](x: Self) {
    
    inline def setCanZoomIn(value: Boolean): Self = StObject.set(x, "canZoomIn", value.asInstanceOf[js.Any])
    
    inline def setCanZoomInUndefined: Self = StObject.set(x, "canZoomIn", js.undefined)
    
    inline def setCanZoomOut(value: Boolean): Self = StObject.set(x, "canZoomOut", value.asInstanceOf[js.Any])
    
    inline def setCanZoomOutUndefined: Self = StObject.set(x, "canZoomOut", js.undefined)
    
    inline def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
