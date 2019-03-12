package typings
package abstractDashLeveldownLib.abstractDashLeveldownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractIterator[K, V] extends AbstractOptions {
  var db: AbstractLevelDOWN[K, V]
  def end(cb: ErrorCallback): scala.Unit
  def next(cb: ErrorKeyValueCallback[K, V]): this.type
}

object AbstractIterator {
  @scala.inline
  def apply[K, V](
    db: AbstractLevelDOWN[K, V],
    end: ErrorCallback => scala.Unit,
    next: ErrorKeyValueCallback[K, V] => AbstractIterator[K, V]
  ): AbstractIterator[K, V] = {
    val __obj = js.Dynamic.literal(db = db, end = js.Any.fromFunction1(end), next = js.Any.fromFunction1(next))
  
    __obj.asInstanceOf[AbstractIterator[K, V]]
  }
}

