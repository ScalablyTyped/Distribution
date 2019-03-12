package typings
package adoneLib.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgumentInfo extends js.Object {
  var action: js.UndefOr[
    adoneLib.adoneLibStrings.store | adoneLib.adoneLibStrings.store_const | adoneLib.adoneLibStrings.store_true | adoneLib.adoneLibStrings.store_false | adoneLib.adoneLibStrings.append | adoneLib.adoneLibStrings.count | adoneLib.adoneLibStrings.set
  ] = js.undefined
  var appendChoicesHelpMessage: js.UndefOr[scala.Boolean] = js.undefined
  var appendDefaultMessage: js.UndefOr[scala.Boolean] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var help: js.UndefOr[java.lang.String] = js.undefined
  var holder: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var name: java.lang.String | js.Array[java.lang.String]
  var nargs: js.UndefOr[
    scala.Double | adoneLib.adoneLibStrings.`+` | adoneLib.adoneLibStrings.`*` | adoneLib.adoneLibStrings.`?`
  ] = js.undefined
   // TODO
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[ArgumentType | js.Array[ArgumentType]] = js.undefined
  var verify: js.UndefOr[js.Function2[/* args */ js.Any, /* opts */ js.Any, scala.Boolean]] = js.undefined
}

object ArgumentInfo {
  @scala.inline
  def apply(
    name: java.lang.String | js.Array[java.lang.String],
    action: adoneLib.adoneLibStrings.store | adoneLib.adoneLibStrings.store_const | adoneLib.adoneLibStrings.store_true | adoneLib.adoneLibStrings.store_false | adoneLib.adoneLibStrings.append | adoneLib.adoneLibStrings.count | adoneLib.adoneLibStrings.set = null,
    appendChoicesHelpMessage: js.UndefOr[scala.Boolean] = js.undefined,
    appendDefaultMessage: js.UndefOr[scala.Boolean] = js.undefined,
    default: js.Any = null,
    description: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    help: java.lang.String = null,
    holder: java.lang.String | js.Array[java.lang.String] = null,
    nargs: scala.Double | adoneLib.adoneLibStrings.`+` | adoneLib.adoneLibStrings.`*` | adoneLib.adoneLibStrings.`?` = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: ArgumentType | js.Array[ArgumentType] = null,
    verify: (/* args */ js.Any, /* opts */ js.Any) => scala.Boolean = null
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

