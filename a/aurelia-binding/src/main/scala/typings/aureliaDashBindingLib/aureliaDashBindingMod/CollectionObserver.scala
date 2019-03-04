package typings
package aureliaDashBindingLib.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionObserver extends js.Object {
  /**
    * Subscribe to collection mutation events.
    */
  def subscribe(callback: js.Function1[/* changeRecords */ js.Array[ICollectionObserverSplice[_, _]], scala.Unit]): Disposable
}

object CollectionObserver {
  @scala.inline
  def apply(
    subscribe: js.Function1[
      js.Function1[/* changeRecords */ js.Array[ICollectionObserverSplice[_, _]], scala.Unit], 
      Disposable
    ]
  ): CollectionObserver = {
    val __obj = js.Dynamic.literal(subscribe = subscribe)
  
    __obj.asInstanceOf[CollectionObserver]
  }
}

