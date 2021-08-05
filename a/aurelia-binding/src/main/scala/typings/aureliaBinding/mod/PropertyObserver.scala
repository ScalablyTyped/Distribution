package typings.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyObserver extends StObject {
  
  /**
    * Subscribe to property change events.
    */
  def subscribe(callback: js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, Unit]): Disposable
}
object PropertyObserver {
  
  inline def apply(subscribe: js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, Unit] => Disposable): PropertyObserver = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[PropertyObserver]
  }
  
  extension [Self <: PropertyObserver](x: Self) {
    
    inline def setSubscribe(value: js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, Unit] => Disposable): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
  }
}
