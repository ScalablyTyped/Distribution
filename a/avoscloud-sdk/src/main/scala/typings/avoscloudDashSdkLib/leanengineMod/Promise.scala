package typings
package avoscloudDashSdkLib.leanengineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leanengine", "Promise")
@js.native
class Promise[T] ()
  extends avoscloudDashSdkLib.avoscloudDashSdkMod.Promise[T]

/* static members */
@JSImport("leanengine", "Promise")
@js.native
object Promise extends js.Object {
  def as[U](resolvedValue: U): avoscloudDashSdkLib.avoscloudDashSdkMod.Promise[U] = js.native
  def error[U](error: U): avoscloudDashSdkLib.avoscloudDashSdkMod.Promise[U] = js.native
  def is(possiblePromise: js.Any): scala.Boolean = js.native
  def when(promises: js.Array[avoscloudDashSdkLib.avoscloudDashSdkMod.Promise[_]]): avoscloudDashSdkLib.avoscloudDashSdkMod.Promise[_] = js.native
}

