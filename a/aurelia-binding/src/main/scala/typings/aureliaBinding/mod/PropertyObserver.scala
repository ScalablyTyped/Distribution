package typings.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyObserver extends StObject {
  
  /**
    * Subscribe to property change events.
    */
  def subscribe(callback: js.Function2[/* newValue */ Any, /* oldValue */ Any, Unit]): Disposable
}
object PropertyObserver {
  
  inline def apply(subscribe: js.Function2[/* newValue */ Any, /* oldValue */ Any, Unit] => Disposable): PropertyObserver = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[PropertyObserver]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyObserver] (val x: Self) extends AnyVal {
    
    inline def setSubscribe(value: js.Function2[/* newValue */ Any, /* oldValue */ Any, Unit] => Disposable): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
  }
}
