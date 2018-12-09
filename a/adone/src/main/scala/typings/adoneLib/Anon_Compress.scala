package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Compress extends js.Object {
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

