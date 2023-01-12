package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerCreateLayerViewOptions extends StObject {
  
  /**
    * A signal to abort the creation of the layerview.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#createLayerView)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object LayerCreateLayerViewOptions {
  
  inline def apply(): LayerCreateLayerViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerCreateLayerViewOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayerCreateLayerViewOptions] (val x: Self) extends AnyVal {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
