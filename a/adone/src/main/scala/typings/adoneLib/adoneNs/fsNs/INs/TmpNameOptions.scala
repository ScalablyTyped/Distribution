package typings
package adoneLib.adoneNs.fsNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TmpNameOptions extends js.Object {
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var ext: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[stdLib.RegExp] = js.undefined
  var tries: js.UndefOr[scala.Double] = js.undefined
}

object TmpNameOptions {
  @scala.inline
  def apply(
    dir: java.lang.String = null,
    ext: java.lang.String = null,
    name: java.lang.String = null,
    prefix: java.lang.String = null,
    template: stdLib.RegExp = null,
    tries: scala.Int | scala.Double = null
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

