package typings.avoscloudSdk.mod.Push

import typings.avoscloudSdk.mod.Query
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
    if (alert != null) __obj.updateDynamic("alert")(alert.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (expiration_interval != null) __obj.updateDynamic("expiration_interval")(expiration_interval.asInstanceOf[js.Any])
    if (expiration_time != null) __obj.updateDynamic("expiration_time")(expiration_time.asInstanceOf[js.Any])
    if (push_time != null) __obj.updateDynamic("push_time")(push_time.asInstanceOf[js.Any])
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushData]
  }
}

