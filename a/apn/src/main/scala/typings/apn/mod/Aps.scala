package typings.apn.mod

import typings.apn.apnNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aps extends js.Object {
  var alert: js.UndefOr[String | ApsAlert] = js.undefined
  var badge: js.UndefOr[Double] = js.undefined
  var category: js.UndefOr[String] = js.undefined
  var `content-available`: js.UndefOr[`1`] = js.undefined
  var `launch-image`: js.UndefOr[String] = js.undefined
  var `mutable-content`: js.UndefOr[`1`] = js.undefined
  var sound: js.UndefOr[String] = js.undefined
  var `url-args`: js.UndefOr[js.Array[String]] = js.undefined
}

object Aps {
  @scala.inline
  def apply(
    alert: String | ApsAlert = null,
    badge: js.UndefOr[Double] = js.undefined,
    category: String = null,
    `content-available`: `1` = null,
    `launch-image`: String = null,
    `mutable-content`: `1` = null,
    sound: String = null,
    `url-args`: js.Array[String] = null
  ): Aps = {
    val __obj = js.Dynamic.literal()
    if (alert != null) __obj.updateDynamic("alert")(alert.asInstanceOf[js.Any])
    if (!js.isUndefined(badge)) __obj.updateDynamic("badge")(badge.get.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (`content-available` != null) __obj.updateDynamic("content-available")(`content-available`.asInstanceOf[js.Any])
    if (`launch-image` != null) __obj.updateDynamic("launch-image")(`launch-image`.asInstanceOf[js.Any])
    if (`mutable-content` != null) __obj.updateDynamic("mutable-content")(`mutable-content`.asInstanceOf[js.Any])
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (`url-args` != null) __obj.updateDynamic("url-args")(`url-args`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aps]
  }
}

