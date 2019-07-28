package typings.argparse.argparseMod

import typings.argparse.Anon_Any
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubparserOptions extends js.Object {
  var action: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var dest: js.UndefOr[String] = js.undefined
  var help: js.UndefOr[String] = js.undefined
  var metavar: js.UndefOr[String] = js.undefined
  var parserClass: js.UndefOr[Anon_Any] = js.undefined
  var prog: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object SubparserOptions {
  @scala.inline
  def apply(
    action: String = null,
    description: String = null,
    dest: String = null,
    help: String = null,
    metavar: String = null,
    parserClass: Anon_Any = null,
    prog: String = null,
    title: String = null
  ): SubparserOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (description != null) __obj.updateDynamic("description")(description)
    if (dest != null) __obj.updateDynamic("dest")(dest)
    if (help != null) __obj.updateDynamic("help")(help)
    if (metavar != null) __obj.updateDynamic("metavar")(metavar)
    if (parserClass != null) __obj.updateDynamic("parserClass")(parserClass)
    if (prog != null) __obj.updateDynamic("prog")(prog)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SubparserOptions]
  }
}

