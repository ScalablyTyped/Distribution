package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawProperties extends StObject {
  
  /**
    * A reference to the active [draw action](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#activeAction)
    */
  var activeAction: js.UndefOr[DrawActionProperties] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
}
object DrawProperties {
  
  inline def apply(): DrawProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrawProperties] (val x: Self) extends AnyVal {
    
    inline def setActiveAction(value: DrawActionProperties): Self = StObject.set(x, "activeAction", value.asInstanceOf[js.Any])
    
    inline def setActiveActionUndefined: Self = StObject.set(x, "activeAction", js.undefined)
    
    inline def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
