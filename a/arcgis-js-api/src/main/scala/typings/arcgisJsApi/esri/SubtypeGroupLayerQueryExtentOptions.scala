package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtypeGroupLayerQueryExtentOptions extends StObject {
  
  /**
    * Signal object that can be used to abort the asynchronous task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#queryExtent)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object SubtypeGroupLayerQueryExtentOptions {
  
  inline def apply(): SubtypeGroupLayerQueryExtentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubtypeGroupLayerQueryExtentOptions]
  }
  
  extension [Self <: SubtypeGroupLayerQueryExtentOptions](x: Self) {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
