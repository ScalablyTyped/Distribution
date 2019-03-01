package typings
package argparseLib.argparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgumentOptions extends js.Object {
  var action: js.UndefOr[java.lang.String | argparseLib.Anon_Options] = js.undefined
   // tslint:disable-line:ban-types
  var choices: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var constant: js.UndefOr[js.Any] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var dest: js.UndefOr[java.lang.String] = js.undefined
  var help: js.UndefOr[java.lang.String] = js.undefined
  var metavar: js.UndefOr[java.lang.String] = js.undefined
  var nargs: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var optionStrings: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  // type may be a string (primitive) or a Function (constructor)
  var `type`: js.UndefOr[java.lang.String | js.Function] = js.undefined
}

object ArgumentOptions {
  @scala.inline
  def apply(
    action: java.lang.String | argparseLib.Anon_Options = null,
    choices: java.lang.String | js.Array[java.lang.String] = null,
    constant: js.Any = null,
    defaultValue: js.Any = null,
    dest: java.lang.String = null,
    help: java.lang.String = null,
    metavar: java.lang.String = null,
    nargs: java.lang.String | scala.Double = null,
    optionStrings: js.Array[java.lang.String] = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String | js.Function = null
  ): ArgumentOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (constant != null) __obj.updateDynamic("constant")(constant)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (dest != null) __obj.updateDynamic("dest")(dest)
    if (help != null) __obj.updateDynamic("help")(help)
    if (metavar != null) __obj.updateDynamic("metavar")(metavar)
    if (nargs != null) __obj.updateDynamic("nargs")(nargs.asInstanceOf[js.Any])
    if (optionStrings != null) __obj.updateDynamic("optionStrings")(optionStrings)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentOptions]
  }
}

