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

object ChartTwoAxisYSupplier {
  @scala.inline
  def apply(
    HasSecondaryYAxis: scala.Boolean,
    HasSecondaryYAxisDescription: scala.Boolean,
    HasSecondaryYAxisTitle: scala.Boolean,
    HasYAxis: scala.Boolean,
    HasYAxisDescription: scala.Boolean,
    HasYAxisGrid: scala.Boolean,
    HasYAxisHelpGrid: scala.Boolean,
    HasYAxisTitle: scala.Boolean,
    SecondaryYAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    YAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    YAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    YHelpGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    YMainGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
    getSecondaryYAxis: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getYAxis: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getYAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getYHelpGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getYMainGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): ChartTwoAxisYSupplier = {
    val __obj = js.Dynamic.literal(HasSecondaryYAxis = HasSecondaryYAxis, HasSecondaryYAxisDescription = HasSecondaryYAxisDescription, HasSecondaryYAxisTitle = HasSecondaryYAxisTitle, HasYAxis = HasYAxis, HasYAxisDescription = HasYAxisDescription, HasYAxisGrid = HasYAxisGrid, HasYAxisHelpGrid = HasYAxisHelpGrid, HasYAxisTitle = HasYAxisTitle, SecondaryYAxis = SecondaryYAxis, YAxis = YAxis, YAxisTitle = YAxisTitle, YHelpGrid = YHelpGrid, YMainGrid = YMainGrid, acquire = acquire, getSecondaryYAxis = getSecondaryYAxis, getYAxis = getYAxis, getYAxisTitle = getYAxisTitle, getYHelpGrid = getYHelpGrid, getYMainGrid = getYMainGrid, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[ChartTwoAxisYSupplier]
  }
}

