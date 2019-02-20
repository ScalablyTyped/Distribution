package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** a helper service for chart documents which supply primary and secondary y-axes. */
trait ChartTwoAxisYSupplier
  extends XTwoAxisYSupplier
     with ChartAxisYSupplier {
  /**
    * determines if the secondary y-axis is shown or hidden.
    * @see ChartAxis
    */
  var HasSecondaryYAxis: scala.Boolean
  /** determines for the secondary y-axis if the labels at the tick marks are shown or hidden. */
  var HasSecondaryYAxisDescription: scala.Boolean
  /**
    * determines if the title of the secondary y-axis is shown or hidden.
    * @see ChartTitle
    * @since OOo 3.0
    */
  var HasSecondaryYAxisTitle: scala.Boolean
}

