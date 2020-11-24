package typings.abstractLeveldown.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractLevelDOWN[K, V] extends AbstractOptions {
  
  def batch(): AbstractChainedBatch[K, V] = js.native
  def batch(array: js.Array[AbstractBatch[K, V]], cb: ErrorCallback): AbstractChainedBatch[K, V] = js.native
  def batch(array: js.Array[AbstractBatch[K, V]], options: AbstractOptions, cb: ErrorCallback): AbstractChainedBatch[K, V] = js.native
  
  def close(cb: ErrorCallback): Unit = js.native
  
  def del(key: K, cb: ErrorCallback): Unit = js.native
  def del(key: K, options: AbstractOptions, cb: ErrorCallback): Unit = js.native
  
  def get(key: K, cb: ErrorValueCallback[V]): Unit = js.native
  def get(key: K, options: AbstractGetOptions, cb: ErrorValueCallback[V]): Unit = js.native
  
  def iterator(): AbstractIterator[K, V] = js.native
  def iterator(options: AbstractIteratorOptions[K]): AbstractIterator[K, V] = js.native
  
  def open(cb: ErrorCallback): Unit = js.native
  def open(options: AbstractOpenOptions, cb: ErrorCallback): Unit = js.native
  
  def put(key: K, value: V, cb: ErrorCallback): Unit = js.native
  def put(key: K, value: V, options: AbstractOptions, cb: ErrorCallback): Unit = js.native
}
@JSImport("abstract-leveldown", "AbstractLevelDOWN")
@js.native
object AbstractLevelDOWN extends TopLevel[AbstractLevelDOWNConstructor]
