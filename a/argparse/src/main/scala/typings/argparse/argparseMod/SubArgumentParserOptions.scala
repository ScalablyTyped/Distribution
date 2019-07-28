package typings.argparse.argparseMod

import typings.argparse.Anon_ArgumentDefaultsHelpFormatter
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
    formatterClass: Anon_ArgumentDefaultsHelpFormatter = null,
    help: String = null,
    parents: js.Array[ArgumentParser] = null,
    prefixChars: String = null,
    prog: String = null,
    usage: String = null,
    version: String = null
  ): SubArgumentParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addHelp)) __obj.updateDynamic("addHelp")(addHelp)
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (argumentDefault != null) __obj.updateDynamic("argumentDefault")(argumentDefault)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (description != null) __obj.updateDynamic("description")(description)
    if (epilog != null) __obj.updateDynamic("epilog")(epilog)
    if (formatterClass != null) __obj.updateDynamic("formatterClass")(formatterClass)
    if (help != null) __obj.updateDynamic("help")(help)
    if (parents != null) __obj.updateDynamic("parents")(parents)
    if (prefixChars != null) __obj.updateDynamic("prefixChars")(prefixChars)
    if (prog != null) __obj.updateDynamic("prog")(prog)
    if (usage != null) __obj.updateDynamic("usage")(usage)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[SubArgumentParserOptions]
  }
}

