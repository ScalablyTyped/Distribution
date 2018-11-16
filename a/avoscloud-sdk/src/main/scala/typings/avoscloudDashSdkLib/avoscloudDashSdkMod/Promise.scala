package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("avoscloud-sdk", "Promise")
@js.native
class Promise[T] ()
  extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Promise[T]

@JSImport("avoscloud-sdk", "Promise")
@js.native
object Promise extends js.Object {
  def as[U](resolvedValue: U): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Promise[U] = js.native
  def error[U](error: U): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Promise[U] = js.native
  def is(possiblePromise: js.Any): scala.Boolean = js.native
  def when(promises: js.Array[avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Promise[_]]): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Promise[_] = js.native
}

