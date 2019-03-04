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
    end: js.Function1[ErrorCallback, scala.Unit],
    next: js.Function1[ErrorKeyValueCallback[K, V], AbstractIterator[K, V]]
  ): AbstractIterator[K, V] = {
    val __obj = js.Dynamic.literal(db = db, end = end, next = next)
  
    __obj.asInstanceOf[AbstractIterator[K, V]]
  }
}

