package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mode extends js.Object {
  /**
    * Defines file mode, 0o40775 by default
    */
  var mode: js.UndefOr[Double] = js.undefined
  /**
    * Defines modified date, now by default
    */
  var mtime: js.UndefOr[Double] = js.undefined
}

object Anon_Mode {
  @scala.inline
  def apply(mode: Int | Double = null, mtime: Int | Double = null): Anon_Mode = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Mode]
  }
}

