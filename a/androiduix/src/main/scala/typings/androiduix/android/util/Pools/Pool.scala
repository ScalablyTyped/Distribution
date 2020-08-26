package typings.androiduix.android.util.Pools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pool[T] extends js.Object {
  def acquire(): T = js.native
  def release(instance: T): Boolean = js.native
}

object Pool {
  @scala.inline
  def apply[T](acquire: () => T, release: T => Boolean): Pool[T] = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), release = js.Any.fromFunction1(release))
    __obj.asInstanceOf[Pool[T]]
  }
  @scala.inline
  implicit class PoolOps[Self <: Pool[_], T] (val x: Self with Pool[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcquire(value: () => T): Self = this.set("acquire", js.Any.fromFunction0(value))
    @scala.inline
    def setRelease(value: T => Boolean): Self = this.set("release", js.Any.fromFunction1(value))
  }
  
}

