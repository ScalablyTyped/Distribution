package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleBarViewModelProperties extends StObject {
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar-ScaleBarViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
}
object ScaleBarViewModelProperties {
  
  @scala.inline
  def apply(): ScaleBarViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleBarViewModelProperties]
  }
  
  @scala.inline
  implicit class ScaleBarViewModelPropertiesMutableBuilder[Self <: ScaleBarViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
