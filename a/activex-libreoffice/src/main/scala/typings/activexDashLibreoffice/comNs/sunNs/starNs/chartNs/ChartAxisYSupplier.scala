package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A helper service for the y-axis. */
trait ChartAxisYSupplier extends XAxisYSupplier {
  /**
    * Determines if the y-axis is shown or hidden.
    * @see ChartAxis
    */
  var HasYAxis: Boolean
  /** Determines if the description of the y-axis is shown or hidden. */
  var HasYAxisDescription: Boolean
  /**
    * Determines if the major grid of the y-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasYAxisGrid: Boolean
  /**
    * Determines if the minor grid of the y-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasYAxisHelpGrid: Boolean
  /**
    * Determines if the title of the y-axis is shown or hidden.
    * @see ChartTitle
    */
  var HasYAxisTitle: Boolean
}

object ChartAxisYSupplier {
  @scala.inline
  def apply(
    HasYAxis: Boolean,
    HasYAxisDescription: Boolean,
    HasYAxisGrid: Boolean,
    HasYAxisHelpGrid: Boolean,
    HasYAxisTitle: Boolean,
    YAxis: XPropertySet,
    YAxisTitle: XShape,
    YHelpGrid: XPropertySet,
    YMainGrid: XPropertySet,
    acquire: () => Unit,
    getYAxis: () => XPropertySet,
    getYAxisTitle: () => XShape,
    getYHelpGrid: () => XPropertySet,
    getYMainGrid: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): ChartAxisYSupplier = {
    val __obj = js.Dynamic.literal(HasYAxis = HasYAxis, HasYAxisDescription = HasYAxisDescription, HasYAxisGrid = HasYAxisGrid, HasYAxisHelpGrid = HasYAxisHelpGrid, HasYAxisTitle = HasYAxisTitle, YAxis = YAxis, YAxisTitle = YAxisTitle, YHelpGrid = YHelpGrid, YMainGrid = YMainGrid, acquire = js.Any.fromFunction0(acquire), getYAxis = js.Any.fromFunction0(getYAxis), getYAxisTitle = js.Any.fromFunction0(getYAxisTitle), getYHelpGrid = js.Any.fromFunction0(getYHelpGrid), getYMainGrid = js.Any.fromFunction0(getYMainGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[ChartAxisYSupplier]
  }
}

