package typings.argparse.mod

import typings.argparse.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubparserOptions extends js.Object {
  var action: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var dest: js.UndefOr[String] = js.undefined
  var help: js.UndefOr[String] = js.undefined
  var metavar: js.UndefOr[String] = js.undefined
  var parserClass: js.UndefOr[Instantiable] = js.undefined
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
    parserClass: Instantiable = null,
    prog: String = null,
    title: String = null
  ): SubparserOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dest != null) __obj.updateDynamic("dest")(dest.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (metavar != null) __obj.updateDynamic("metavar")(metavar.asInstanceOf[js.Any])
    if (parserClass != null) __obj.updateDynamic("parserClass")(parserClass.asInstanceOf[js.Any])
    if (prog != null) __obj.updateDynamic("prog")(prog.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubparserOptions]
  }
}

