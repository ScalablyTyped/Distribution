package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to both the primary and the secondary **x** -axis of a chart.
  * @see XDiagram
  */
trait XTwoAxisXSupplier extends XAxisXSupplier {
  /**
    * @returns the properties of the secondary **x** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  val SecondaryXAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the properties of the secondary **x** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  def getSecondaryXAxis(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}

object XTwoAxisXSupplier {
  @scala.inline
  def apply(
    SecondaryXAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    XAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    XAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    XHelpGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    XMainGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
    getSecondaryXAxis: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getXAxis: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getXAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getXHelpGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getXMainGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTwoAxisXSupplier = {
    val __obj = js.Dynamic.literal(SecondaryXAxis = SecondaryXAxis, XAxis = XAxis, XAxisTitle = XAxisTitle, XHelpGrid = XHelpGrid, XMainGrid = XMainGrid, acquire = acquire, getSecondaryXAxis = getSecondaryXAxis, getXAxis = getXAxis, getXAxisTitle = getXAxisTitle, getXHelpGrid = getXHelpGrid, getXMainGrid = getXMainGrid, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XTwoAxisXSupplier]
  }
}

