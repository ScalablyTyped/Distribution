package typings.apn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApsAlert extends js.Object {
  var action: js.UndefOr[String] = js.undefined
  var `action-loc-key`: js.UndefOr[String] = js.undefined
  var body: js.UndefOr[String] = js.undefined
  var `loc-args`: js.UndefOr[js.Array[_]] = js.undefined
  var `loc-key`: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `title-loc-args`: js.UndefOr[js.Array[_]] = js.undefined
  var `title-loc-key`: js.UndefOr[String] = js.undefined
}

object ApsAlert {
  @scala.inline
  def apply(
    action: String = null,
    `action-loc-key`: String = null,
    body: String = null,
    `loc-args`: js.Array[_] = null,
    `loc-key`: String = null,
    title: String = null,
    `title-loc-args`: js.Array[_] = null,
    `title-loc-key`: String = null
  ): ApsAlert = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (`action-loc-key` != null) __obj.updateDynamic("action-loc-key")(`action-loc-key`.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (`loc-args` != null) __obj.updateDynamic("loc-args")(`loc-args`.asInstanceOf[js.Any])
    if (`loc-key` != null) __obj.updateDynamic("loc-key")(`loc-key`.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`title-loc-args` != null) __obj.updateDynamic("title-loc-args")(`title-loc-args`.asInstanceOf[js.Any])
    if (`title-loc-key` != null) __obj.updateDynamic("title-loc-key")(`title-loc-key`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApsAlert]
  }
}

