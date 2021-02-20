package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawProperties extends StObject {
  
  /**
    * A reference to the active [draw action](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#activeAction)
    */
  var activeAction: js.UndefOr[DrawActionProperties] = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.native
}
object DrawProperties {
  
  @scala.inline
  def apply(): DrawProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawProperties]
  }
  
  @scala.inline
  implicit class DrawPropertiesMutableBuilder[Self <: DrawProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveAction(value: DrawActionProperties): Self = StObject.set(x, "activeAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveActionUndefined: Self = StObject.set(x, "activeAction", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
