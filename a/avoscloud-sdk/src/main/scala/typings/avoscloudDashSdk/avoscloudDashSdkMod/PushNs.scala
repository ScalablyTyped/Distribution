package typings.avoscloudDashSdk.avoscloudDashSdkMod

import typings.avoscloudDashSdk.avoscloudDashSdkMod.PushNs.PushData
import typings.avoscloudDashSdk.avoscloudDashSdkMod.PushNs.SendOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains functions to deal with Push in AV
  * @name AV.Push
  * @namespace
  */
@JSImport("avoscloud-sdk", "Push")
@js.native
object PushNs extends js.Object {
  trait PushData extends js.Object {
    var alert: js.UndefOr[String] = js.undefined
    var badge: js.UndefOr[String] = js.undefined
    var channels: js.UndefOr[js.Array[String]] = js.undefined
    var data: js.UndefOr[js.Any] = js.undefined
    var expiration_interval: js.UndefOr[Double] = js.undefined
    var expiration_time: js.UndefOr[Date] = js.undefined
    var push_time: js.UndefOr[Date] = js.undefined
    var sound: js.UndefOr[String] = js.undefined
    var title: js.UndefOr[String] = js.undefined
    var where: js.UndefOr[Query] = js.undefined
  }
  
  trait SendOptions extends js.Object {
    var error: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
    var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  
  def send[T](data: PushData): Promise[T] = js.native
  def send[T](data: PushData, options: SendOptions): Promise[T] = js.native
}

