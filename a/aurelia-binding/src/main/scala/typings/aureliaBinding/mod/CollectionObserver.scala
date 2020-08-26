package typings.aureliaBinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionObserver extends js.Object {
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
  implicit class CollectionObserverOps[Self <: CollectionObserver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSubscribe(
      value: js.Function1[/* changeRecords */ js.Array[ICollectionObserverSplice[_, _]], Unit] => Disposable
    ): Self = this.set("subscribe", js.Any.fromFunction1(value))
  }
  
}

