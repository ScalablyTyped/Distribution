package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactiveWatchOptions extends StObject {
  
  @JSName("equals")
  val equals_FReactiveWatchOptions: js.UndefOr[js.Function2[/* newValue */ Any, /* oldValue */ Any, Boolean]] = js.undefined
  
  val initial: js.UndefOr[Boolean] = js.undefined
  
  val once: js.UndefOr[Boolean] = js.undefined
  
  val sync: js.UndefOr[Boolean] = js.undefined
}
object ReactiveWatchOptions {
  
  inline def apply(): ReactiveWatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactiveWatchOptions]
  }
  
  extension [Self <: ReactiveWatchOptions](x: Self) {
    
    inline def setEquals_(value: (/* newValue */ Any, /* oldValue */ Any) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
    
    inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    inline def setInitial(value: Boolean): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    
    inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
  }
}
