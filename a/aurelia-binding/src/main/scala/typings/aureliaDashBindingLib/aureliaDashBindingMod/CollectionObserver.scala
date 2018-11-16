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

