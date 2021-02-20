package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerViewProperties extends StObject {
  
  /**
    * When `true`, the layer is visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html#visible)
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object LayerViewProperties {
  
  @scala.inline
  def apply(): LayerViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerViewProperties]
  }
  
  @scala.inline
  implicit class LayerViewPropertiesMutableBuilder[Self <: LayerViewProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
