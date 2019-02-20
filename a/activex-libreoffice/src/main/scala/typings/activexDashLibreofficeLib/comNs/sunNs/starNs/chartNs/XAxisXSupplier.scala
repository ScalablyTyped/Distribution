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

