package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to the **x** -axis of a chart.
  *
  * Note that not all diagrams are capable of displaying an **x** -axis, e.g., the {@link PieDiagram} .
  * @see XDiagram
  */
trait XAxisXSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @returns the properties of the **x** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  val XAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the **x** -axis title shape.
    * @see ChartTitle
    */
  val XAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
  /**
    * @returns the properties of the help grid (minor grid) of the **x** -axis of the diagram.
    * @see ChartGrid
    */
  val XHelpGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the properties of the main grid (major grid) of the **x** -axis of the diagram.
    * @see ChartGrid
    */
  val XMainGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the properties of the **x** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  def getXAxis(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the **x** -axis title shape.
    * @see ChartTitle
    */
  def getXAxisTitle(): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
  /**
    * @returns the properties of the help grid (minor grid) of the **x** -axis of the diagram.
    * @see ChartGrid
    */
  def getXHelpGrid(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the properties of the main grid (major grid) of the **x** -axis of the diagram.
    * @see ChartGrid
    */
  def getXMainGrid(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}

object XAxisXSupplier {
  @scala.inline
  def apply(
    XAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    XAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    XHelpGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    XMainGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
    getXAxis: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getXAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getXHelpGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getXMainGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAxisXSupplier = {
    val __obj = js.Dynamic.literal(XAxis = XAxis, XAxisTitle = XAxisTitle, XHelpGrid = XHelpGrid, XMainGrid = XMainGrid, acquire = acquire, getXAxis = getXAxis, getXAxisTitle = getXAxisTitle, getXHelpGrid = getXHelpGrid, getXMainGrid = getXMainGrid, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XAxisXSupplier]
  }
}

