package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BasenameDirname extends js.Object {
  var basename: js.UndefOr[java.lang.String] = js.undefined
  var dirname: js.UndefOr[java.lang.String] = js.undefined
  var extname: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BasenameDirname {
  @scala.inline
  def apply(
    basename: java.lang.String = null,
    dirname: java.lang.String = null,
    extname: java.lang.String = null,
    prefix: java.lang.String = null
  ): Anon_BasenameDirname = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename)
    if (dirname != null) __obj.updateDynamic("dirname")(dirname)
    if (extname != null) __obj.updateDynamic("extname")(extname)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Anon_BasenameDirname]
  }
}

