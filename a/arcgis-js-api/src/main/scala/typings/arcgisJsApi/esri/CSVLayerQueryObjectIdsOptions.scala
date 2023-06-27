package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSVLayerQueryObjectIdsOptions extends StObject {
  
  /**
  		 * Signal object that can be used to abort the asynchronous task.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#queryObjectIds)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object CSVLayerQueryObjectIdsOptions {
  
  inline def apply(): CSVLayerQueryObjectIdsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSVLayerQueryObjectIdsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSVLayerQueryObjectIdsOptions] (val x: Self) extends AnyVal {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
