package typings
package argparseLib.argparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgumentParserOptions extends js.Object {
  var addHelp: js.UndefOr[scala.Boolean] = js.undefined
  var argumentDefault: js.UndefOr[js.Any] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var epilog: js.UndefOr[java.lang.String] = js.undefined
  var formatterClass: js.UndefOr[argparseLib.Anon_ArgumentDefaultsHelpFormatter] = js.undefined
  var parents: js.UndefOr[js.Array[ArgumentParser]] = js.undefined
  var prefixChars: js.UndefOr[java.lang.String] = js.undefined
  var prog: js.UndefOr[java.lang.String] = js.undefined
  var usage: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object ArgumentParserOptions {
  @scala.inline
  def apply(
    addHelp: js.UndefOr[scala.Boolean] = js.undefined,
    argumentDefault: js.Any = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    epilog: java.lang.String = null,
    formatterClass: argparseLib.Anon_ArgumentDefaultsHelpFormatter = null,
    parents: js.Array[ArgumentParser] = null,
    prefixChars: java.lang.String = null,
    prog: java.lang.String = null,
    usage: java.lang.String = null,
    version: java.lang.String = null
  ): ArgumentParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addHelp)) __obj.updateDynamic("addHelp")(addHelp)
    if (argumentDefault != null) __obj.updateDynamic("argumentDefault")(argumentDefault)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (description != null) __obj.updateDynamic("description")(description)
    if (epilog != null) __obj.updateDynamic("epilog")(epilog)
    if (formatterClass != null) __obj.updateDynamic("formatterClass")(formatterClass)
    if (parents != null) __obj.updateDynamic("parents")(parents)
    if (prefixChars != null) __obj.updateDynamic("prefixChars")(prefixChars)
    if (prog != null) __obj.updateDynamic("prog")(prog)
    if (usage != null) __obj.updateDynamic("usage")(usage)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ArgumentParserOptions]
  }
}

