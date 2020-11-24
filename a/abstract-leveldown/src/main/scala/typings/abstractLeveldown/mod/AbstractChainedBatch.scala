package typings.abstractLeveldown.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object AbstractChainedBatch extends TopLevel[AbstractChainedBatchConstructor]
