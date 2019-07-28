package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShape
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
  var HasSecondaryYAxis: Boolean
  /** determines for the secondary y-axis if the labels at the tick marks are shown or hidden. */
  var HasSecondaryYAxisDescription: Boolean
  /**
    * determines if the title of the secondary y-axis is shown or hidden.
    * @see ChartTitle
    * @since OOo 3.0
    */
  var HasSecondaryYAxisTitle: Boolean
}

object ChartTwoAxisYSupplier {
  @scala.inline
  def apply(
    HasSecondaryYAxis: Boolean,
    HasSecondaryYAxisDescription: Boolean,
    HasSecondaryYAxisTitle: Boolean,
    HasYAxis: Boolean,
    HasYAxisDescription: Boolean,
    HasYAxisGrid: Boolean,
    HasYAxisHelpGrid: Boolean,
    HasYAxisTitle: Boolean,
    SecondaryYAxis: XPropertySet,
    YAxis: XPropertySet,
    YAxisTitle: XShape,
    YHelpGrid: XPropertySet,
    YMainGrid: XPropertySet,
    acquire: () => Unit,
    getSecondaryYAxis: () => XPropertySet,
    getYAxis: () => XPropertySet,
    getYAxisTitle: () => XShape,
    getYHelpGrid: () => XPropertySet,
    getYMainGrid: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): ChartTwoAxisYSupplier = {
    val __obj = js.Dynamic.literal(HasSecondaryYAxis = HasSecondaryYAxis, HasSecondaryYAxisDescription = HasSecondaryYAxisDescription, HasSecondaryYAxisTitle = HasSecondaryYAxisTitle, HasYAxis = HasYAxis, HasYAxisDescription = HasYAxisDescription, HasYAxisGrid = HasYAxisGrid, HasYAxisHelpGrid = HasYAxisHelpGrid, HasYAxisTitle = HasYAxisTitle, SecondaryYAxis = SecondaryYAxis, YAxis = YAxis, YAxisTitle = YAxisTitle, YHelpGrid = YHelpGrid, YMainGrid = YMainGrid, acquire = js.Any.fromFunction0(acquire), getSecondaryYAxis = js.Any.fromFunction0(getSecondaryYAxis), getYAxis = js.Any.fromFunction0(getYAxis), getYAxisTitle = js.Any.fromFunction0(getYAxisTitle), getYHelpGrid = js.Any.fromFunction0(getYHelpGrid), getYMainGrid = js.Any.fromFunction0(getYMainGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[ChartTwoAxisYSupplier]
  }
}

