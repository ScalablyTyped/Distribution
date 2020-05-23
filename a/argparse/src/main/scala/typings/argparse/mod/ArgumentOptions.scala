package typings.argparse.mod

import typings.argparse.anon.InstantiableAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgumentOptions extends js.Object {
  var action: js.UndefOr[String | InstantiableAction] = js.undefined
   // tslint:disable-line:ban-types
  var choices: js.UndefOr[String | js.Array[String]] = js.undefined
  var constant: js.UndefOr[js.Any] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var dest: js.UndefOr[String] = js.undefined
  var help: js.UndefOr[String] = js.undefined
  var metavar: js.UndefOr[String | js.Array[String]] = js.undefined
  var nargs: js.UndefOr[String | Double] = js.undefined
  var optionStrings: js.UndefOr[js.Array[String]] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  // type may be a string (primitive) or a Function (constructor)
  var `type`: js.UndefOr[String | js.Function] = js.undefined
}

object ArgumentOptions {
  @scala.inline
  def apply(
    action: String | InstantiableAction = null,
    choices: String | js.Array[String] = null,
    constant: js.Any = null,
    defaultValue: js.Any = null,
    dest: String = null,
    help: String = null,
    metavar: String | js.Array[String] = null,
    nargs: String | Double = null,
    optionStrings: js.Array[String] = null,
    required: js.UndefOr[Boolean] = js.undefined,
    `type`: String | js.Function = null
  ): ArgumentOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (constant != null) __obj.updateDynamic("constant")(constant.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dest != null) __obj.updateDynamic("dest")(dest.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (metavar != null) __obj.updateDynamic("metavar")(metavar.asInstanceOf[js.Any])
    if (nargs != null) __obj.updateDynamic("nargs")(nargs.asInstanceOf[js.Any])
    if (optionStrings != null) __obj.updateDynamic("optionStrings")(optionStrings.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentOptions]
  }
}

