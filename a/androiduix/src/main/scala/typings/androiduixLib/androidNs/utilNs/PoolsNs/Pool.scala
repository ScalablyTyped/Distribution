package typings
package androiduixLib.androidNs.utilNs.PoolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pool[T] extends js.Object {
  def acquire(): T
  def release(instance: T): scala.Boolean
}

object Pool {
  @scala.inline
  def apply[T](acquire: js.Function0[T], release: js.Function1[T, scala.Boolean]): Pool[T] = {
    val __obj = js.Dynamic.literal(acquire = acquire, release = release)
  
    __obj.asInstanceOf[Pool[T]]
  }
}

