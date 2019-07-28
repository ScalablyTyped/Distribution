package typings.avoscloudDashSdk.leanengineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leanengine", "Promise")
@js.native
class Promise[T] ()
  extends typings.avoscloudDashSdk.avoscloudDashSdkMod.Promise[T]

/* static members */
@JSImport("leanengine", "Promise")
@js.native
object Promise extends js.Object {
  def as[U](resolvedValue: U): typings.avoscloudDashSdk.avoscloudDashSdkMod.Promise[U] = js.native
  def error[U](error: U): typings.avoscloudDashSdk.avoscloudDashSdkMod.Promise[U] = js.native
  def is(possiblePromise: js.Any): Boolean = js.native
  def when(promises: js.Array[typings.avoscloudDashSdk.avoscloudDashSdkMod.Promise[_]]): typings.avoscloudDashSdk.avoscloudDashSdkMod.Promise[_] = js.native
}

