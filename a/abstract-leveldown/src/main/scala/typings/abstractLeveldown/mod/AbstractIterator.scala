package typings.abstractLeveldown.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractIterator[K, V] extends AbstractOptions {
  var db: AbstractLevelDOWN[K, V]
  def end(cb: ErrorCallback): Unit
  def next(cb: ErrorKeyValueCallback[K, V]): this.type
}

@JSImport("abstract-leveldown", "AbstractIterator")
@js.native
object AbstractIterator extends TopLevel[AbstractIteratorConstructor]

