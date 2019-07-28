package typings.avoscloudDashSdk.leanengineMod

import typings.avoscloudDashSdk.avoscloudDashSdkMod.PushNs.PushData
import typings.avoscloudDashSdk.avoscloudDashSdkMod.PushNs.SendOptions
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
  def send[T](data: PushData): typings.avoscloudDashSdk.avoscloudDashSdkMod.Promise[T] = js.native
  def send[T](data: PushData, options: SendOptions): typings.avoscloudDashSdk.avoscloudDashSdkMod.Promise[T] = js.native
}

