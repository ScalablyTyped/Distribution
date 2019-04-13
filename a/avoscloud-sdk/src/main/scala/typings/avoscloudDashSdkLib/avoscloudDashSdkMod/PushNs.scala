package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod

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
    var alert: js.UndefOr[java.lang.String] = js.undefined
    var badge: js.UndefOr[java.lang.String] = js.undefined
    var channels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var data: js.UndefOr[js.Any] = js.undefined
    var expiration_interval: js.UndefOr[scala.Double] = js.undefined
    var expiration_time: js.UndefOr[stdLib.Date] = js.undefined
    var push_time: js.UndefOr[stdLib.Date] = js.undefined
    var sound: js.UndefOr[java.lang.String] = js.undefined
    var title: js.UndefOr[java.lang.String] = js.undefined
    var where: js.UndefOr[avoscloudDashSdkLib.avoscloudDashSdkMod.Query] = js.undefined
  }
  
  trait SendOptions extends js.Object {
    var error: js.UndefOr[
        js.Function1[/* error */ avoscloudDashSdkLib.avoscloudDashSdkMod.Error, scala.Unit]
      ] = js.undefined
    var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  }
  
  def send[T](data: PushData): avoscloudDashSdkLib.avoscloudDashSdkMod.Promise[T] = js.native
  def send[T](data: PushData, options: SendOptions): avoscloudDashSdkLib.avoscloudDashSdkMod.Promise[T] = js.native
}

