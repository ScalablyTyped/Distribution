package typings.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionObserver extends StObject {
  
  /**
    * Subscribe to collection mutation events.
    */
  def subscribe(callback: js.Function1[/* changeRecords */ js.Array[ICollectionObserverSplice[Any, Any]], Unit]): Disposable
}
object CollectionObserver {
  
  inline def apply(
    subscribe: js.Function1[/* changeRecords */ js.Array[ICollectionObserverSplice[Any, Any]], Unit] => Disposable
  ): CollectionObserver = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[CollectionObserver]
  }
  
  extension [Self <: CollectionObserver](x: Self) {
    
    inline def setSubscribe(
      value: js.Function1[/* changeRecords */ js.Array[ICollectionObserverSplice[Any, Any]], Unit] => Disposable
    ): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
  }
}
