package typings
package apnLib.apnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aps extends js.Object {
  var alert: js.UndefOr[java.lang.String | ApsAlert] = js.undefined
  var badge: js.UndefOr[scala.Double] = js.undefined
  var category: js.UndefOr[java.lang.String] = js.undefined
  var `content-available`: js.UndefOr[apnLib.apnLibNumbers.`1`] = js.undefined
  var `launch-image`: js.UndefOr[java.lang.String] = js.undefined
  var `mutable-content`: js.UndefOr[apnLib.apnLibNumbers.`1`] = js.undefined
  var sound: js.UndefOr[java.lang.String] = js.undefined
  var `url-args`: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Aps {
  @scala.inline
  def apply(
    alert: java.lang.String | ApsAlert = null,
    badge: scala.Int | scala.Double = null,
    category: java.lang.String = null,
    `content-available`: apnLib.apnLibNumbers.`1` = null,
    `launch-image`: java.lang.String = null,
    `mutable-content`: apnLib.apnLibNumbers.`1` = null,
    sound: java.lang.String = null,
    `url-args`: js.Array[java.lang.String] = null
  ): Aps = {
    val __obj = js.Dynamic.literal()
    if (alert != null) __obj.updateDynamic("alert")(alert.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category)
    if (`content-available` != null) __obj.updateDynamic("content-available")(`content-available`)
    if (`launch-image` != null) __obj.updateDynamic("launch-image")(`launch-image`)
    if (`mutable-content` != null) __obj.updateDynamic("mutable-content")(`mutable-content`)
    if (sound != null) __obj.updateDynamic("sound")(sound)
    if (`url-args` != null) __obj.updateDynamic("url-args")(`url-args`)
    __obj.asInstanceOf[Aps]
  }
}

