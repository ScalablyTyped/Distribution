package typings.aureliaBinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionObserver extends js.Object {
  /**
    * Subscribe to collection mutation events.
    */
  def subscribe(callback: js.Function1[/* changeRecords */ js.Array[ICollectionObserverSplice[_, _]], Unit]): Disposable
}

object CollectionObserver {
  @scala.inline
  def apply(
    subscribe: js.Function1[/* changeRecords */ js.Array[ICollectionObserverSplice[_, _]], Unit] => Disposable
  ): CollectionObserver = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
  
    __obj.asInstanceOf[CollectionObserver]
  }
}

