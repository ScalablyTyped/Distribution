package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to both the primary and the secondary y-axis of a diagram.
  * @see XChartDocument
  */
trait XTwoAxisYSupplier extends XAxisYSupplier {
  /**
    * @returns the properties of the secondary **y** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  val SecondaryYAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the properties of the secondary **y** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  def getSecondaryYAxis(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}

object XTwoAxisYSupplier {
  @scala.inline
  def apply(
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
  ): XTwoAxisYSupplier = {
    val __obj = js.Dynamic.literal(SecondaryYAxis = SecondaryYAxis, YAxis = YAxis, YAxisTitle = YAxisTitle, YHelpGrid = YHelpGrid, YMainGrid = YMainGrid, acquire = acquire, getSecondaryYAxis = getSecondaryYAxis, getYAxis = getYAxis, getYAxisTitle = getYAxisTitle, getYHelpGrid = getYHelpGrid, getYMainGrid = getYMainGrid, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XTwoAxisYSupplier]
  }
}

