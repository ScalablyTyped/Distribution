package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawActionProperties extends StObject {
  
  /**
    * Controls whether the created geometry will have z coordinates or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#hasZ)
    */
  var hasZ: js.UndefOr[Double] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
}
object DrawActionProperties {
  
  @scala.inline
  def apply(): DrawActionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawActionProperties]
  }
  
  @scala.inline
  implicit class DrawActionPropertiesMutableBuilder[Self <: DrawActionProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasZ(value: Double): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
