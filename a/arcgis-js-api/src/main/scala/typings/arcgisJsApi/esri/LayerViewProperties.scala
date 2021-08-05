package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerViewProperties extends StObject {
  
  /**
    * When `true`, the layer is visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html#visible)
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object LayerViewProperties {
  
  inline def apply(): LayerViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerViewProperties]
  }
  
  extension [Self <: LayerViewProperties](x: Self) {
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
