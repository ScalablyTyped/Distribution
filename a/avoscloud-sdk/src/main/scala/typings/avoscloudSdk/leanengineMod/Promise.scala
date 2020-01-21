package typings.avoscloudSdk.leanengineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leanengine", "Promise")
@js.native
class Promise[T] ()
  extends typings.avoscloudSdk.mod.Promise[T]

/* static members */
@JSImport("leanengine", "Promise")
@js.native
object Promise extends js.Object {
  def as[U](resolvedValue: U): typings.avoscloudSdk.mod.Promise[U] = js.native
  def error[U](error: U): typings.avoscloudSdk.mod.Promise[U] = js.native
  def is(possiblePromise: js.Any): Boolean = js.native
  def when(promises: js.Array[typings.avoscloudSdk.mod.Promise[_]]): typings.avoscloudSdk.mod.Promise[_] = js.native
}

