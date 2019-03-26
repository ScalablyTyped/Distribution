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

@JSImport("abstract-leveldown", "AbstractIterator")
@js.native
class AbstractIteratorCls[K, V] protected () extends AbstractIterator[K, V] {
  // tslint:disable-next-line no-unnecessary-generics
  def this(db: js.Any) = this()
  /* CompleteClass */
  override var db: AbstractLevelDOWN[K, V] = js.native
  /* CompleteClass */
  override def end(cb: ErrorCallback): scala.Unit = js.native
  /* CompleteClass */
  override def next(cb: ErrorKeyValueCallback[K, V]): this.type = js.native
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

