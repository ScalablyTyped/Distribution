package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhaseCallbacks extends StObject {
  
  /**
    * A callback called before rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#PhaseCallbacks)
    */
  var prepare: js.UndefOr[PhaseCallback] = js.undefined
  
  /**
    * A callback to execute rendering logic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#PhaseCallbacks)
    */
  var render: js.UndefOr[PhaseCallback] = js.undefined
  
  /**
    * A callback to execute state update logic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#PhaseCallbacks)
    */
  var update: js.UndefOr[PhaseCallback] = js.undefined
}
object PhaseCallbacks {
  
  inline def apply(): PhaseCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhaseCallbacks]
  }
  
  extension [Self <: PhaseCallbacks](x: Self) {
    
    inline def setPrepare(value: /* event */ js.UndefOr[PhaseEvent] => scala.Unit): Self = StObject.set(x, "prepare", js.Any.fromFunction1(value))
    
    inline def setPrepareUndefined: Self = StObject.set(x, "prepare", js.undefined)
    
    inline def setRender(value: /* event */ js.UndefOr[PhaseEvent] => scala.Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setUpdate(value: /* event */ js.UndefOr[PhaseEvent] => scala.Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
