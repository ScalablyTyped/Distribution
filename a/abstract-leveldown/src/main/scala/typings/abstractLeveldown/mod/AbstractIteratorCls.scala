package typings.abstractLeveldown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("abstract-leveldown", "AbstractIterator")
@js.native
class AbstractIteratorCls[K, V] protected () extends AbstractIterator[K, V] {
  // tslint:disable-next-line no-unnecessary-generics
  def this(db: js.Any) = this()
  /* CompleteClass */
  override var db: AbstractLevelDOWN[K, V] = js.native
  /* CompleteClass */
  override def end(cb: ErrorCallback): Unit = js.native
  /* CompleteClass */
  override def next(cb: ErrorKeyValueCallback[K, V]): this.type = js.native
}

