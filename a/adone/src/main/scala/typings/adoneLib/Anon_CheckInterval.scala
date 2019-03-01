package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckInterval extends js.Object {
  /**
    * rotator reads file's stats with this delay
    */
  var checkInterval: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * compress old log files with gz
    */
  var compress: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * number of files at time
    */
  var maxFiles: js.UndefOr[scala.Double] = js.undefined
  /**
    * maximum size of the file that triggers rotation
    */
  var maxSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Anon_CheckInterval {
  @scala.inline
  def apply(
    checkInterval: scala.Double | java.lang.String = null,
    compress: js.UndefOr[scala.Boolean] = js.undefined,
    maxFiles: scala.Int | scala.Double = null,
    maxSize: scala.Double | java.lang.String = null
  ): Anon_CheckInterval = {
    val __obj = js.Dynamic.literal()
    if (checkInterval != null) __obj.updateDynamic("checkInterval")(checkInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (maxFiles != null) __obj.updateDynamic("maxFiles")(maxFiles.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CheckInterval]
  }
}

