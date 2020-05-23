package typings.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPublishOptions extends js.Object {
  var acknowledge: js.UndefOr[Boolean] = js.undefined
  var disclose_me: js.UndefOr[Boolean] = js.undefined
  var eligible: js.UndefOr[js.Array[Double]] = js.undefined
  var eligible_authid: js.UndefOr[js.Array[String]] = js.undefined
  var eligible_authrole: js.UndefOr[js.Array[String]] = js.undefined
  var exclude: js.UndefOr[js.Array[Double]] = js.undefined
  var exclude_authid: js.UndefOr[js.Array[String]] = js.undefined
  var exclude_authrole: js.UndefOr[js.Array[String]] = js.undefined
  var exclude_me: js.UndefOr[Boolean] = js.undefined
  var retain: js.UndefOr[Boolean] = js.undefined
}

object IPublishOptions {
  @scala.inline
  def apply(
    acknowledge: js.UndefOr[Boolean] = js.undefined,
    disclose_me: js.UndefOr[Boolean] = js.undefined,
    eligible: js.Array[Double] = null,
    eligible_authid: js.Array[String] = null,
    eligible_authrole: js.Array[String] = null,
    exclude: js.Array[Double] = null,
    exclude_authid: js.Array[String] = null,
    exclude_authrole: js.Array[String] = null,
    exclude_me: js.UndefOr[Boolean] = js.undefined,
    retain: js.UndefOr[Boolean] = js.undefined
  ): IPublishOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acknowledge)) __obj.updateDynamic("acknowledge")(acknowledge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disclose_me)) __obj.updateDynamic("disclose_me")(disclose_me.get.asInstanceOf[js.Any])
    if (eligible != null) __obj.updateDynamic("eligible")(eligible.asInstanceOf[js.Any])
    if (eligible_authid != null) __obj.updateDynamic("eligible_authid")(eligible_authid.asInstanceOf[js.Any])
    if (eligible_authrole != null) __obj.updateDynamic("eligible_authrole")(eligible_authrole.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (exclude_authid != null) __obj.updateDynamic("exclude_authid")(exclude_authid.asInstanceOf[js.Any])
    if (exclude_authrole != null) __obj.updateDynamic("exclude_authrole")(exclude_authrole.asInstanceOf[js.Any])
    if (!js.isUndefined(exclude_me)) __obj.updateDynamic("exclude_me")(exclude_me.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retain)) __obj.updateDynamic("retain")(retain.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPublishOptions]
  }
}

