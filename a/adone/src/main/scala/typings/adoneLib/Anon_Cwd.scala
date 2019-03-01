package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cwd extends js.Object {
  /**
    * cwd to use
    */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The delay to wait between busy tries
    */
  var emfileWait: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to consider the given path as a glob pattern
    */
  var glob: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Maximum busy tries, errors when cannot remove a file due to EBUSY, ENOTEMPTY, EPERM
    */
  var maxBusyTries: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Cwd {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    emfileWait: scala.Int | scala.Double = null,
    glob: js.UndefOr[scala.Boolean] = js.undefined,
    maxBusyTries: scala.Int | scala.Double = null
  ): Anon_Cwd = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (emfileWait != null) __obj.updateDynamic("emfileWait")(emfileWait.asInstanceOf[js.Any])
    if (!js.isUndefined(glob)) __obj.updateDynamic("glob")(glob)
    if (maxBusyTries != null) __obj.updateDynamic("maxBusyTries")(maxBusyTries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cwd]
  }
}

