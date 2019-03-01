package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AtimeMtime extends js.Object {
  var atime: js.UndefOr[scala.Double] = js.undefined
  var mtime: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AtimeMtime {
  @scala.inline
  def apply(atime: scala.Int | scala.Double = null, mtime: scala.Int | scala.Double = null): Anon_AtimeMtime = {
    val __obj = js.Dynamic.literal()
    if (atime != null) __obj.updateDynamic("atime")(atime.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AtimeMtime]
  }
}

