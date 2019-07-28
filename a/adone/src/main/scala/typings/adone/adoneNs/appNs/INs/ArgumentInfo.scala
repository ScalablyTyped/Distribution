package typings.adone.adoneNs.appNs.INs

import typings.adone.adoneStrings.`+`
import typings.adone.adoneStrings.`?`
import typings.adone.adoneStrings.append
import typings.adone.adoneStrings.count
import typings.adone.adoneStrings.set
import typings.adone.adoneStrings.store
import typings.adone.adoneStrings.store_const
import typings.adone.adoneStrings.store_false
import typings.adone.adoneStrings.store_true
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgumentInfo extends js.Object {
  var action: js.UndefOr[store | store_const | store_true | store_false | append | count | set] = js.undefined
  var appendChoicesHelpMessage: js.UndefOr[Boolean] = js.undefined
  var appendDefaultMessage: js.UndefOr[Boolean] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var help: js.UndefOr[String] = js.undefined
  var holder: js.UndefOr[String | js.Array[String]] = js.undefined
  var name: String | js.Array[String]
  var nargs: js.UndefOr[Double | `+` | typings.adone.adoneStrings.`*` | `?`] = js.undefined
   // TODO
  var required: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[ArgumentType | js.Array[ArgumentType]] = js.undefined
  var verify: js.UndefOr[js.Function2[/* args */ js.Any, /* opts */ js.Any, Boolean]] = js.undefined
}

object ArgumentInfo {
  @scala.inline
  def apply(
    name: String | js.Array[String],
    action: store | store_const | store_true | store_false | append | count | set = null,
    appendChoicesHelpMessage: js.UndefOr[Boolean] = js.undefined,
    appendDefaultMessage: js.UndefOr[Boolean] = js.undefined,
    default: js.Any = null,
    description: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    help: String = null,
    holder: String | js.Array[String] = null,
    nargs: Double | `+` | typings.adone.adoneStrings.`*` | `?` = null,
    required: js.UndefOr[Boolean] = js.undefined,
    `type`: ArgumentType | js.Array[ArgumentType] = null,
    verify: (/* args */ js.Any, /* opts */ js.Any) => Boolean = null
  ): ArgumentInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(appendChoicesHelpMessage)) __obj.updateDynamic("appendChoicesHelpMessage")(appendChoicesHelpMessage)
    if (!js.isUndefined(appendDefaultMessage)) __obj.updateDynamic("appendDefaultMessage")(appendDefaultMessage)
    if (default != null) __obj.updateDynamic("default")(default)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (help != null) __obj.updateDynamic("help")(help)
    if (holder != null) __obj.updateDynamic("holder")(holder.asInstanceOf[js.Any])
    if (nargs != null) __obj.updateDynamic("nargs")(nargs.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verify != null) __obj.updateDynamic("verify")(js.Any.fromFunction2(verify))
    __obj.asInstanceOf[ArgumentInfo]
  }
}

