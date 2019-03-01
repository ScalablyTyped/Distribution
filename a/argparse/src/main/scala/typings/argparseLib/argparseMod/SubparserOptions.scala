package typings
package argparseLib.argparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubparserOptions extends js.Object {
  var action: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var dest: js.UndefOr[java.lang.String] = js.undefined
  var help: js.UndefOr[java.lang.String] = js.undefined
  var metavar: js.UndefOr[java.lang.String] = js.undefined
  var parserClass: js.UndefOr[argparseLib.Anon_Any] = js.undefined
  var prog: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object SubparserOptions {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    description: java.lang.String = null,
    dest: java.lang.String = null,
    help: java.lang.String = null,
    metavar: java.lang.String = null,
    parserClass: argparseLib.Anon_Any = null,
    prog: java.lang.String = null,
    title: java.lang.String = null
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

