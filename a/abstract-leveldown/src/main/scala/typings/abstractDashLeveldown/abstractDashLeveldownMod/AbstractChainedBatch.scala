package typings.abstractDashLeveldown.abstractDashLeveldownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractChainedBatch[K, V] extends AbstractOptions {
  def clear(): this.type = js.native
  def del(key: K): this.type = js.native
  def put(key: K, value: V): this.type = js.native
  def write(cb: ErrorCallback): js.Any = js.native
  def write(options: js.Any, cb: ErrorCallback): js.Any = js.native
}

@JSImport("abstract-leveldown", "AbstractChainedBatch")
@js.native
class AbstractChainedBatchCls[K, V] protected () extends AbstractChainedBatch[K, V] {
  // tslint:disable-next-line no-unnecessary-generics
  def this(db: js.Any) = this()
}

