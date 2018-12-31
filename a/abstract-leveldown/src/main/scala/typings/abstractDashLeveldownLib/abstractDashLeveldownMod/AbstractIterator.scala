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

