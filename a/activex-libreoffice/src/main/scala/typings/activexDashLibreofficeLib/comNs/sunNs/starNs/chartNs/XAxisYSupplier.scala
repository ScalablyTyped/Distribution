package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to the **y** -axis of a chart.
  *
  * Note that not all diagrams are capable of displaying a **y** -axis, e.g., the {@link PieDiagram} .
  * @see XDiagram
  */
trait XAxisYSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @returns the properties of the **y** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  val YAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the **y** -axis title shape.
    * @see ChartTitle
    */
  val YAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
  /**
    * @returns the properties of the help grid (minor grid) of the **y** -axis of the diagram.
    * @see ChartGrid
    */
  val YHelpGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the properties of the main grid (major grid) of the **y** -axis of the diagram.
    * @see ChartGrid
    */
  val YMainGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the properties of the **y** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  def getYAxis(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the **y** -axis title shape.
    * @see ChartTitle
    */
  def getYAxisTitle(): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
  /**
    * @returns the properties of the help grid (minor grid) of the **y** -axis of the diagram.
    * @see ChartGrid
    */
  def getYHelpGrid(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the properties of the main grid (major grid) of the **y** -axis of the diagram.
    * @see ChartGrid
    */
  def getYMainGrid(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}

object XAxisYSupplier {
  @scala.inline
  def apply(
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
  ): XAxisYSupplier = {
    val __obj = js.Dynamic.literal(YAxis = YAxis, YAxisTitle = YAxisTitle, YHelpGrid = YHelpGrid, YMainGrid = YMainGrid, acquire = acquire, getYAxis = getYAxis, getYAxisTitle = getYAxisTitle, getYHelpGrid = getYHelpGrid, getYMainGrid = getYMainGrid, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XAxisYSupplier]
  }
}

