package typings
package apnLib.apnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationAlertOptions extends js.Object {
  var `action-loc-key`: js.UndefOr[java.lang.String] = js.undefined
  var body: java.lang.String
  var `launch-image`: js.UndefOr[java.lang.String] = js.undefined
  var `loc-args`: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `loc-key`: js.UndefOr[java.lang.String] = js.undefined
  var subtitle: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `title-loc-args`: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `title-loc-key`: js.UndefOr[java.lang.String] = js.undefined
}

object NotificationAlertOptions {
  @scala.inline
  def apply(
    body: java.lang.String,
    `action-loc-key`: java.lang.String = null,
    `launch-image`: java.lang.String = null,
    `loc-args`: js.Array[java.lang.String] = null,
    `loc-key`: java.lang.String = null,
    subtitle: java.lang.String = null,
    title: java.lang.String = null,
    `title-loc-args`: js.Array[java.lang.String] = null,
    `title-loc-key`: java.lang.String = null
  ): NotificationAlertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    if (`action-loc-key` != null) __obj.updateDynamic("action-loc-key")(`action-loc-key`)
    if (`launch-image` != null) __obj.updateDynamic("launch-image")(`launch-image`)
    if (`loc-args` != null) __obj.updateDynamic("loc-args")(`loc-args`)
    if (`loc-key` != null) __obj.updateDynamic("loc-key")(`loc-key`)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`title-loc-args` != null) __obj.updateDynamic("title-loc-args")(`title-loc-args`)
    if (`title-loc-key` != null) __obj.updateDynamic("title-loc-key")(`title-loc-key`)
    __obj.asInstanceOf[NotificationAlertOptions]
  }
}

