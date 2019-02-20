package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to the **z** -axis of a chart.
  * @see XDiagram
  */
trait XAxisZSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @returns the properties of the **z** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  val ZAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the **z** -axis title shape.
    * @see ChartTitle
    */
  val ZAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
  /**
    * @returns the properties of the help grid (minor grid) of the **z** -axis of the diagram.
    * @see ChartGrid
    */
  val ZHelpGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the properties of the main grid (major grid) of the **z** -axis of the diagram.
    * @see ChartGrid
    */
  val ZMainGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the properties of the **z** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  def getZAxis(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the **z** -axis title shape.
    * @see ChartTitle
    */
  def getZAxisTitle(): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
  /**
    * @returns the properties of the help grid (minor grid) of the **z** -axis of the diagram.
    * @see ChartGrid
    */
  def getZHelpGrid(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the properties of the main grid (major grid) of the **z** -axis of the diagram.
    * @see ChartGrid
    */
  def getZMainGrid(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}

