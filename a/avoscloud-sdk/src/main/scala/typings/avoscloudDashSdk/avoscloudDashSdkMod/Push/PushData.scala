package typings.avoscloudDashSdk.avoscloudDashSdkMod.Push

import typings.avoscloudDashSdk.avoscloudDashSdkMod.Query
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object PushData {
  @scala.inline
  def apply(
    alert: String = null,
    badge: String = null,
    channels: js.Array[String] = null,
    data: js.Any = null,
    expiration_interval: Int | Double = null,
    expiration_time: Date = null,
    push_time: Date = null,
    sound: String = null,
    title: String = null,
    where: Query = null
  ): PushData = {
    val __obj = js.Dynamic.literal()
    if (alert != null) __obj.updateDynamic("alert")(alert)
    if (badge != null) __obj.updateDynamic("badge")(badge)
    if (channels != null) __obj.updateDynamic("channels")(channels)
    if (data != null) __obj.updateDynamic("data")(data)
    if (expiration_interval != null) __obj.updateDynamic("expiration_interval")(expiration_interval.asInstanceOf[js.Any])
    if (expiration_time != null) __obj.updateDynamic("expiration_time")(expiration_time)
    if (push_time != null) __obj.updateDynamic("push_time")(push_time)
    if (sound != null) __obj.updateDynamic("sound")(sound)
    if (title != null) __obj.updateDynamic("title")(title)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[PushData]
  }
}

