package typings
package autobahnLib.autobahnMod.autobahnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPublishOptions extends js.Object {
  var acknowledge: js.UndefOr[scala.Boolean] = js.undefined
  var disclose_me: js.UndefOr[scala.Boolean] = js.undefined
  var eligible: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var eligible_authid: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var eligible_authrole: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var exclude: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var exclude_authid: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var exclude_authrole: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var exclude_me: js.UndefOr[scala.Boolean] = js.undefined
  var retain: js.UndefOr[scala.Boolean] = js.undefined
}

object IPublishOptions {
  @scala.inline
  def apply(
    acknowledge: js.UndefOr[scala.Boolean] = js.undefined,
    disclose_me: js.UndefOr[scala.Boolean] = js.undefined,
    eligible: js.Array[scala.Double] = null,
    eligible_authid: js.Array[java.lang.String] = null,
    eligible_authrole: js.Array[java.lang.String] = null,
    exclude: js.Array[scala.Double] = null,
    exclude_authid: js.Array[java.lang.String] = null,
    exclude_authrole: js.Array[java.lang.String] = null,
    exclude_me: js.UndefOr[scala.Boolean] = js.undefined,
    retain: js.UndefOr[scala.Boolean] = js.undefined
  ): IPublishOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acknowledge)) __obj.updateDynamic("acknowledge")(acknowledge)
    if (!js.isUndefined(disclose_me)) __obj.updateDynamic("disclose_me")(disclose_me)
    if (eligible != null) __obj.updateDynamic("eligible")(eligible)
    if (eligible_authid != null) __obj.updateDynamic("eligible_authid")(eligible_authid)
    if (eligible_authrole != null) __obj.updateDynamic("eligible_authrole")(eligible_authrole)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (exclude_authid != null) __obj.updateDynamic("exclude_authid")(exclude_authid)
    if (exclude_authrole != null) __obj.updateDynamic("exclude_authrole")(exclude_authrole)
    if (!js.isUndefined(exclude_me)) __obj.updateDynamic("exclude_me")(exclude_me)
    if (!js.isUndefined(retain)) __obj.updateDynamic("retain")(retain)
    __obj.asInstanceOf[IPublishOptions]
  }
}

