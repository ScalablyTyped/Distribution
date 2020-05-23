package typings.argparse.mod

import typings.argparse.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgumentParserOptions extends js.Object {
  var addHelp: js.UndefOr[Boolean] = js.undefined
  var argumentDefault: js.UndefOr[js.Any] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var epilog: js.UndefOr[String] = js.undefined
  var formatterClass: js.UndefOr[`0`] = js.undefined
  var parents: js.UndefOr[js.Array[ArgumentParser]] = js.undefined
  var prefixChars: js.UndefOr[String] = js.undefined
  var prog: js.UndefOr[String] = js.undefined
  var usage: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object ArgumentParserOptions {
  @scala.inline
  def apply(
    addHelp: js.UndefOr[Boolean] = js.undefined,
    argumentDefault: js.Any = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    epilog: String = null,
    formatterClass: `0` = null,
    parents: js.Array[ArgumentParser] = null,
    prefixChars: String = null,
    prog: String = null,
    usage: String = null,
    version: String = null
  ): ArgumentParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addHelp)) __obj.updateDynamic("addHelp")(addHelp.get.asInstanceOf[js.Any])
    if (argumentDefault != null) __obj.updateDynamic("argumentDefault")(argumentDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (epilog != null) __obj.updateDynamic("epilog")(epilog.asInstanceOf[js.Any])
    if (formatterClass != null) __obj.updateDynamic("formatterClass")(formatterClass.asInstanceOf[js.Any])
    if (parents != null) __obj.updateDynamic("parents")(parents.asInstanceOf[js.Any])
    if (prefixChars != null) __obj.updateDynamic("prefixChars")(prefixChars.asInstanceOf[js.Any])
    if (prog != null) __obj.updateDynamic("prog")(prog.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentParserOptions]
  }
}

