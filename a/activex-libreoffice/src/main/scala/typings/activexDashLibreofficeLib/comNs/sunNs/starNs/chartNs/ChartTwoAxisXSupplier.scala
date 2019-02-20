package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** a helper service for chart documents which supply primary and secondary x-axes. */
trait ChartTwoAxisXSupplier
  extends XTwoAxisXSupplier
     with ChartAxisXSupplier {
  /**
    * determines if the secondary x-axis is shown or hidden.
    * @see ChartAxis
    */
  var HasSecondaryXAxis: scala.Boolean
  /** determines for the secondary x-axis if the labels at the tick marks are shown or hidden. */
  var HasSecondaryXAxisDescription: scala.Boolean
  /**
    * determines if the title of the secondary X-axis is shown or hidden.
    * @see ChartTitle
    * @since OOo 3.0
    */
  var HasSecondaryXAxisTitle: scala.Boolean
}

