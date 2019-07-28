package typings.androiduix.androidNs.utilNs.PoolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.util.Pools.SimplePool")
@js.native
class SimplePool[T] protected () extends Pool[T] {
  def this(maxPoolSize: Double) = this()
  var mPool: js.Array[T] = js.native
  var mPoolSize: Double = js.native
  /* CompleteClass */
  override def acquire(): T = js.native
  /* private */ def isInPool(instance: js.Any): js.Any = js.native
  /* CompleteClass */
  override def release(instance: T): Boolean = js.native
}

