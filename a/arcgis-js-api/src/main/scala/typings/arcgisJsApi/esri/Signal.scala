package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Signal extends StObject {
  
  /**
  		 * Calls a mutate function which can modify the value of the signal in place.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-signal.html#Signal)
  		 */
  var mutate: js.UndefOr[MutateFunction] = js.undefined
  
  /**
  		 * The current value of the signal.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-signal.html#Signal)
  		 */
  var value: js.UndefOr[Boolean] = js.undefined
}
object Signal {
  
  inline def apply(): Signal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Signal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Signal] (val x: Self) extends AnyVal {
    
    inline def setMutate(value: /* value */ Any => scala.Unit): Self = StObject.set(x, "mutate", js.Any.fromFunction1(value))
    
    inline def setMutateUndefined: Self = StObject.set(x, "mutate", js.undefined)
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
