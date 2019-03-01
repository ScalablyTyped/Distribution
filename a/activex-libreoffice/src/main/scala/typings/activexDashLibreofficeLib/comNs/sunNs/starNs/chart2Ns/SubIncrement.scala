package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubIncrement extends js.Object {
  /** should contain nothing for **auto** , or an integer value for an explicit interval count. */
  var IntervalCount: js.Any
  /** should contain nothing for **auto** , or a boolean value for an explicit setting. */
  var PostEquidistant: js.Any
}

object SubIncrement {
  @scala.inline
  def apply(IntervalCount: js.Any, PostEquidistant: js.Any): SubIncrement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IntervalCount")(IntervalCount)
    __obj.updateDynamic("PostEquidistant")(PostEquidistant)
    __obj.asInstanceOf[SubIncrement]
  }
}

