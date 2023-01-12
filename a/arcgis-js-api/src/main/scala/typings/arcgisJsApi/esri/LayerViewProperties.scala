package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerViewProperties extends StObject {
  
  /**
    * When `true`, the layer is visible in the view.
    *
    * @default true
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayerViewProperties] (val x: Self) extends AnyVal {
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
