package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightOptions extends StObject {
  
  /**
    * The color of the highlight fill.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#HighlightOptions)
    */
  var color: js.UndefOr[Color_] = js.undefined
  
  /**
    * The opacity of the fill (area within the halo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#HighlightOptions)
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The color of the halo surrounding the highlight.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#HighlightOptions)
    */
  var haloColor: js.UndefOr[Color_] = js.undefined
  
  /**
    * The opacity of the highlight halo.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#HighlightOptions)
    */
  var haloOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The color of the highlighted feature's shadow in [3D SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#HighlightOptions)
    */
  var shadowColor: js.UndefOr[Color_] = js.undefined
  
  /**
    * Defines the intensity of the shadow area obtained by overlapping the shadow of the highlighted feature and the shadow of other objects in [3D SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#HighlightOptions)
    */
  var shadowDifference: js.UndefOr[Double] = js.undefined
  
  /**
    * The opacity of the highlighted feature's shadow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#HighlightOptions)
    */
  var shadowOpacity: js.UndefOr[Double] = js.undefined
}
object HighlightOptions {
  
  inline def apply(): HighlightOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HighlightOptions] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setHaloColor(value: Color_): Self = StObject.set(x, "haloColor", value.asInstanceOf[js.Any])
    
    inline def setHaloColorUndefined: Self = StObject.set(x, "haloColor", js.undefined)
    
    inline def setHaloOpacity(value: Double): Self = StObject.set(x, "haloOpacity", value.asInstanceOf[js.Any])
    
    inline def setHaloOpacityUndefined: Self = StObject.set(x, "haloOpacity", js.undefined)
    
    inline def setShadowColor(value: Color_): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    inline def setShadowDifference(value: Double): Self = StObject.set(x, "shadowDifference", value.asInstanceOf[js.Any])
    
    inline def setShadowDifferenceUndefined: Self = StObject.set(x, "shadowDifference", js.undefined)
    
    inline def setShadowOpacity(value: Double): Self = StObject.set(x, "shadowOpacity", value.asInstanceOf[js.Any])
    
    inline def setShadowOpacityUndefined: Self = StObject.set(x, "shadowOpacity", js.undefined)
  }
}
