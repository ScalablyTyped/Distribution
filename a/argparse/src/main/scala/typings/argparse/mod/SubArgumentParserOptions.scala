package typings.argparse.mod

import typings.argparse.Anon0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubArgumentParserOptions extends ArgumentParserOptions {
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  var help: js.UndefOr[String] = js.undefined
}

object SubArgumentParserOptions {
  @scala.inline
  def apply(
    addHelp: js.UndefOr[Boolean] = js.undefined,
    aliases: js.Array[String] = null,
    argumentDefault: js.Any = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    epilog: String = null,
    formatterClass: Anon0 = null,
    help: String = null,
    parents: js.Array[ArgumentParser] = null,
    prefixChars: String = null,
    prog: String = null,
    usage: String = null,
    version: String = null
  ): SubArgumentParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addHelp)) __obj.updateDynamic("addHelp")(addHelp.asInstanceOf[js.Any])
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (argumentDefault != null) __obj.updateDynamic("argumentDefault")(argumentDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (epilog != null) __obj.updateDynamic("epilog")(epilog.asInstanceOf[js.Any])
    if (formatterClass != null) __obj.updateDynamic("formatterClass")(formatterClass.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (parents != null) __obj.updateDynamic("parents")(parents.asInstanceOf[js.Any])
    if (prefixChars != null) __obj.updateDynamic("prefixChars")(prefixChars.asInstanceOf[js.Any])
    if (prog != null) __obj.updateDynamic("prog")(prog.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubArgumentParserOptions]
  }
}

