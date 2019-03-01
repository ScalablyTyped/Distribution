package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ModeMtime extends js.Object {
  /**
    * Defines file mode, 0o40775 by default
    */
  var mode: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defines modified date, now by default
    */
  var mtime: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ModeMtime {
  @scala.inline
  def apply(mode: scala.Int | scala.Double = null, mtime: scala.Int | scala.Double = null): Anon_ModeMtime = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ModeMtime]
  }
}

