package typings.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionObserver extends StObject {
  
  /**
    * Subscribe to collection mutation events.
    */
  def subscribe(callback: js.Function1[/* changeRecords */ js.Array[ICollectionObserverSplice[_, _]], Unit]): Disposable = js.native
}
object CollectionObserver {
  
  @scala.inline
  def apply(
    subscribe: js.Function1[/* changeRecords */ js.Array[ICollectionObserverSplice[_, _]], Unit] => Disposable
  ): CollectionObserver = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[CollectionObserver]
  }
  
  @scala.inline
  implicit class CollectionObserverMutableBuilder[Self <: CollectionObserver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscribe(
      value: js.Function1[/* changeRecords */ js.Array[ICollectionObserverSplice[_, _]], Unit] => Disposable
    ): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
  }
}
