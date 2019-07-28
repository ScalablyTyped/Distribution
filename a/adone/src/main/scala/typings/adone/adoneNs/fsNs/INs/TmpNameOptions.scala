package typings.adone.adoneNs.fsNs.INs

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TmpNameOptions extends js.Object {
  var dir: js.UndefOr[String] = js.undefined
  var ext: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[RegExp] = js.undefined
  var tries: js.UndefOr[Double] = js.undefined
}

object TmpNameOptions {
  @scala.inline
  def apply(
    dir: String = null,
    ext: String = null,
    name: String = null,
    prefix: String = null,
    template: RegExp = null,
    tries: Int | Double = null
  ): TmpNameOptions = {
    val __obj = js.Dynamic.literal()
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (name != null) __obj.updateDynamic("name")(name)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (template != null) __obj.updateDynamic("template")(template)
    if (tries != null) __obj.updateDynamic("tries")(tries.asInstanceOf[js.Any])
    __obj.asInstanceOf[TmpNameOptions]
  }
}

