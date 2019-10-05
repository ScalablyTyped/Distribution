package typings.avoscloudDashSdk.leanengineMod

import typings.avoscloudDashSdk.avoscloudDashSdkMod.Push.PushData
import typings.avoscloudDashSdk.avoscloudDashSdkMod.Push.SendOptions
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
object Push extends js.Object {
  def send[T](data: PushData): typings.avoscloudDashSdk.avoscloudDashSdkMod.Promise[T] = js.native
  def send[T](data: PushData, options: SendOptions): typings.avoscloudDashSdk.avoscloudDashSdkMod.Promise[T] = js.native
}

