package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactiveListenerOptions[Target] extends StObject {
  
  var onListenerAdd: js.UndefOr[js.Function1[/* target */ Target, scala.Unit]] = js.undefined
  
  var onListenerRemove: js.UndefOr[js.Function1[/* target */ Target, scala.Unit]] = js.undefined
  
  var once: js.UndefOr[Boolean] = js.undefined
  
  var sync: js.UndefOr[Boolean] = js.undefined
}
object ReactiveListenerOptions {
  
  inline def apply[Target](): ReactiveListenerOptions[Target] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactiveListenerOptions[Target]]
  }
  
  extension [Self <: ReactiveListenerOptions[?], Target](x: Self & ReactiveListenerOptions[Target]) {
    
    inline def setOnListenerAdd(value: /* target */ Target => scala.Unit): Self = StObject.set(x, "onListenerAdd", js.Any.fromFunction1(value))
    
    inline def setOnListenerAddUndefined: Self = StObject.set(x, "onListenerAdd", js.undefined)
    
    inline def setOnListenerRemove(value: /* target */ Target => scala.Unit): Self = StObject.set(x, "onListenerRemove", js.Any.fromFunction1(value))
    
    inline def setOnListenerRemoveUndefined: Self = StObject.set(x, "onListenerRemove", js.undefined)
    
    inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    
    inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
  }
}
