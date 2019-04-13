package typings
package avoscloudDashSdkLib.leanengineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains functions to deal with Push in AV
  * @name AV.Push
  * @namespace
  */
@JSImport("leanengine", "Push")
@js.native
object PushNs extends js.Object {
  def send[T](data: avoscloudDashSdkLib.avoscloudDashSdkMod.PushNs.PushData): avoscloudDashSdkLib.avoscloudDashSdkMod.Promise[T] = js.native
  def send[T](
    data: avoscloudDashSdkLib.avoscloudDashSdkMod.PushNs.PushData,
    options: avoscloudDashSdkLib.avoscloudDashSdkMod.PushNs.SendOptions
  ): avoscloudDashSdkLib.avoscloudDashSdkMod.Promise[T] = js.native
}

