package typings.asyncDashLock.asyncDashLockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncLock extends js.Object {
  def acquire[T](key: String, fn: js.Function0[T | js.Thenable[T]]): js.Promise[T] = js.native
  def acquire[T](key: String, fn: js.Function0[T | js.Thenable[T]], opts: AsyncLockOptions): js.Promise[T] = js.native
  def acquire[T](key: String, fn: js.Function1[/* done */ AsyncLockDoneCallback[T], _]): js.Promise[T] = js.native
  def acquire[T](
    key: String,
    fn: js.Function1[/* done */ AsyncLockDoneCallback[T], _],
    cb: AsyncLockDoneCallback[T]
  ): Unit = js.native
  def acquire[T](
    key: String,
    fn: js.Function1[/* done */ AsyncLockDoneCallback[T], _],
    cb: AsyncLockDoneCallback[T],
    opts: AsyncLockOptions
  ): Unit = js.native
  def acquire[T](key: String, fn: js.Function1[/* done */ AsyncLockDoneCallback[T], _], opts: AsyncLockOptions): js.Promise[T] = js.native
  def acquire[T](key: js.Array[String], fn: js.Function0[T | js.Thenable[T]]): js.Promise[T] = js.native
  def acquire[T](key: js.Array[String], fn: js.Function0[T | js.Thenable[T]], opts: AsyncLockOptions): js.Promise[T] = js.native
  def acquire[T](key: js.Array[String], fn: js.Function1[/* done */ AsyncLockDoneCallback[T], _]): js.Promise[T] = js.native
  def acquire[T](
    key: js.Array[String],
    fn: js.Function1[/* done */ AsyncLockDoneCallback[T], _],
    cb: AsyncLockDoneCallback[T]
  ): Unit = js.native
  def acquire[T](
    key: js.Array[String],
    fn: js.Function1[/* done */ AsyncLockDoneCallback[T], _],
    cb: AsyncLockDoneCallback[T],
    opts: AsyncLockOptions
  ): Unit = js.native
  def acquire[T](
    key: js.Array[String],
    fn: js.Function1[/* done */ AsyncLockDoneCallback[T], _],
    opts: AsyncLockOptions
  ): js.Promise[T] = js.native
  def isBusy(): Boolean = js.native
  def isBusy(key: String): Boolean = js.native
}

