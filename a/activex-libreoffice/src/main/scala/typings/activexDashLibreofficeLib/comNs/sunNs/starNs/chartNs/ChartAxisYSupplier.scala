package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A helper service for the y-axis. */
trait ChartAxisYSupplier extends XAxisYSupplier {
  /**
    * Determines if the y-axis is shown or hidden.
    * @see ChartAxis
    */
  var HasYAxis: scala.Boolean
  /** Determines if the description of the y-axis is shown or hidden. */
  var HasYAxisDescription: scala.Boolean
  /**
    * Determines if the major grid of the y-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasYAxisGrid: scala.Boolean
  /**
    * Determines if the minor grid of the y-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasYAxisHelpGrid: scala.Boolean
  /**
    * Determines if the title of the y-axis is shown or hidden.
    * @see ChartTitle
    */
  var HasYAxisTitle: scala.Boolean
}

object ChartAxisYSupplier {
  @scala.inline
  def apply(
    HasYAxis: scala.Boolean,
    HasYAxisDescription: scala.Boolean,
    HasYAxisGrid: scala.Boolean,
    HasYAxisHelpGrid: scala.Boolean,
    HasYAxisTitle: scala.Boolean,
    YAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    YAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    YHelpGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    YMainGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
    getYAxis: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getYAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getYHelpGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getYMainGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): ChartAxisYSupplier = {
    val __obj = js.Dynamic.literal(HasYAxis = HasYAxis, HasYAxisDescription = HasYAxisDescription, HasYAxisGrid = HasYAxisGrid, HasYAxisHelpGrid = HasYAxisHelpGrid, HasYAxisTitle = HasYAxisTitle, YAxis = YAxis, YAxisTitle = YAxisTitle, YHelpGrid = YHelpGrid, YMainGrid = YMainGrid, acquire = acquire, getYAxis = getYAxis, getYAxisTitle = getYAxisTitle, getYHelpGrid = getYHelpGrid, getYMainGrid = getYMainGrid, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[ChartAxisYSupplier]
  }
}

