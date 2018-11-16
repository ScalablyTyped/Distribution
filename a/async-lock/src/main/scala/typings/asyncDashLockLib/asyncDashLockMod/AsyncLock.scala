package typings
package asyncDashLockLib.asyncDashLockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncLock extends js.Object {
  def acquire[T](key: java.lang.String, fn: js.Function0[T | stdLib.PromiseLike[T]]): stdLib.Promise[T] = js.native
  def acquire[T](key: java.lang.String, fn: js.Function0[T | stdLib.PromiseLike[T]], opts: AsyncLockOptions): stdLib.Promise[T] = js.native
  def acquire[T](key: java.lang.String, fn: js.Function1[/* done */ asyncDashLockLib.AsyncLockDoneCallback[T], _]): stdLib.Promise[T] = js.native
  def acquire[T](
    key: java.lang.String,
    fn: js.Function1[/* done */ asyncDashLockLib.AsyncLockDoneCallback[T], _],
    cb: asyncDashLockLib.AsyncLockDoneCallback[T]
  ): scala.Unit = js.native
  def acquire[T](
    key: java.lang.String,
    fn: js.Function1[/* done */ asyncDashLockLib.AsyncLockDoneCallback[T], _],
    cb: asyncDashLockLib.AsyncLockDoneCallback[T],
    opts: AsyncLockOptions
  ): scala.Unit = js.native
  def acquire[T](
    key: java.lang.String,
    fn: js.Function1[/* done */ asyncDashLockLib.AsyncLockDoneCallback[T], _],
    opts: AsyncLockOptions
  ): stdLib.Promise[T] = js.native
  def acquire[T](key: js.Array[java.lang.String], fn: js.Function0[T | stdLib.PromiseLike[T]]): stdLib.Promise[T] = js.native
  def acquire[T](
    key: js.Array[java.lang.String],
    fn: js.Function0[T | stdLib.PromiseLike[T]],
    opts: AsyncLockOptions
  ): stdLib.Promise[T] = js.native
  def acquire[T](
    key: js.Array[java.lang.String],
    fn: js.Function1[/* done */ asyncDashLockLib.AsyncLockDoneCallback[T], _]
  ): stdLib.Promise[T] = js.native
  def acquire[T](
    key: js.Array[java.lang.String],
    fn: js.Function1[/* done */ asyncDashLockLib.AsyncLockDoneCallback[T], _],
    cb: asyncDashLockLib.AsyncLockDoneCallback[T]
  ): scala.Unit = js.native
  def acquire[T](
    key: js.Array[java.lang.String],
    fn: js.Function1[/* done */ asyncDashLockLib.AsyncLockDoneCallback[T], _],
    cb: asyncDashLockLib.AsyncLockDoneCallback[T],
    opts: AsyncLockOptions
  ): scala.Unit = js.native
  def acquire[T](
    key: js.Array[java.lang.String],
    fn: js.Function1[/* done */ asyncDashLockLib.AsyncLockDoneCallback[T], _],
    opts: AsyncLockOptions
  ): stdLib.Promise[T] = js.native
  def isBusy(): scala.Boolean = js.native
  def isBusy(key: java.lang.String): scala.Boolean = js.native
}

