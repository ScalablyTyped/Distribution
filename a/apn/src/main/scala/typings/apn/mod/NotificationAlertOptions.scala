package typings.apn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationAlertOptions extends js.Object {
  var `action-loc-key`: js.UndefOr[String] = js.undefined
  var body: String
  var `launch-image`: js.UndefOr[String] = js.undefined
  var `loc-args`: js.UndefOr[js.Array[String]] = js.undefined
  var `loc-key`: js.UndefOr[String] = js.undefined
  var subtitle: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `title-loc-args`: js.UndefOr[js.Array[String]] = js.undefined
  var `title-loc-key`: js.UndefOr[String] = js.undefined
}

object NotificationAlertOptions {
  @scala.inline
  def apply(
    body: String,
    `action-loc-key`: String = null,
    `launch-image`: String = null,
    `loc-args`: js.Array[String] = null,
    `loc-key`: String = null,
    subtitle: String = null,
    title: String = null,
    `title-loc-args`: js.Array[String] = null,
    `title-loc-key`: String = null
  ): NotificationAlertOptions = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (`action-loc-key` != null) __obj.updateDynamic("action-loc-key")(`action-loc-key`.asInstanceOf[js.Any])
    if (`launch-image` != null) __obj.updateDynamic("launch-image")(`launch-image`.asInstanceOf[js.Any])
    if (`loc-args` != null) __obj.updateDynamic("loc-args")(`loc-args`.asInstanceOf[js.Any])
    if (`loc-key` != null) __obj.updateDynamic("loc-key")(`loc-key`.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`title-loc-args` != null) __obj.updateDynamic("title-loc-args")(`title-loc-args`.asInstanceOf[js.Any])
    if (`title-loc-key` != null) __obj.updateDynamic("title-loc-key")(`title-loc-key`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationAlertOptions]
  }
}

