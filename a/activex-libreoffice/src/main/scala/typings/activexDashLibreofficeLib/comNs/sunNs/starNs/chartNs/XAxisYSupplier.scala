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

