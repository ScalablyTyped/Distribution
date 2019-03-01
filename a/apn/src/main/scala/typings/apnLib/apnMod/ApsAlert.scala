package typings
package apnLib.apnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApsAlert extends js.Object {
  var action: js.UndefOr[java.lang.String] = js.undefined
  var `action-loc-key`: js.UndefOr[java.lang.String] = js.undefined
  var body: js.UndefOr[java.lang.String] = js.undefined
  var `loc-args`: js.UndefOr[js.Array[_]] = js.undefined
  var `loc-key`: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `title-loc-args`: js.UndefOr[js.Array[_]] = js.undefined
  var `title-loc-key`: js.UndefOr[java.lang.String] = js.undefined
}

object ApsAlert {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    `action-loc-key`: java.lang.String = null,
    body: java.lang.String = null,
    `loc-args`: js.Array[_] = null,
    `loc-key`: java.lang.String = null,
    title: java.lang.String = null,
    `title-loc-args`: js.Array[_] = null,
    `title-loc-key`: java.lang.String = null
  ): ApsAlert = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (`action-loc-key` != null) __obj.updateDynamic("action-loc-key")(`action-loc-key`)
    if (body != null) __obj.updateDynamic("body")(body)
    if (`loc-args` != null) __obj.updateDynamic("loc-args")(`loc-args`)
    if (`loc-key` != null) __obj.updateDynamic("loc-key")(`loc-key`)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`title-loc-args` != null) __obj.updateDynamic("title-loc-args")(`title-loc-args`)
    if (`title-loc-key` != null) __obj.updateDynamic("title-loc-key")(`title-loc-key`)
    __obj.asInstanceOf[ApsAlert]
  }
}

