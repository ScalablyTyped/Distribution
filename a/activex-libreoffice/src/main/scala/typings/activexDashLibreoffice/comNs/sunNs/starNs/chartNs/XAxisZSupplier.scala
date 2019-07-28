package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShape
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to the **z** -axis of a chart.
  * @see XDiagram
  */
trait XAxisZSupplier extends XInterface {
  /**
    * @returns the properties of the **z** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  val ZAxis: XPropertySet
  /**
    * @returns the **z** -axis title shape.
    * @see ChartTitle
    */
  val ZAxisTitle: XShape
  /**
    * @returns the properties of the help grid (minor grid) of the **z** -axis of the diagram.
    * @see ChartGrid
    */
  val ZHelpGrid: XPropertySet
  /**
    * @returns the properties of the main grid (major grid) of the **z** -axis of the diagram.
    * @see ChartGrid
    */
  val ZMainGrid: XPropertySet
  /**
    * @returns the properties of the **z** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  def getZAxis(): XPropertySet
  /**
    * @returns the **z** -axis title shape.
    * @see ChartTitle
    */
  def getZAxisTitle(): XShape
  /**
    * @returns the properties of the help grid (minor grid) of the **z** -axis of the diagram.
    * @see ChartGrid
    */
  def getZHelpGrid(): XPropertySet
  /**
    * @returns the properties of the main grid (major grid) of the **z** -axis of the diagram.
    * @see ChartGrid
    */
  def getZMainGrid(): XPropertySet
}

object XAxisZSupplier {
  @scala.inline
  def apply(
    ZAxis: XPropertySet,
    ZAxisTitle: XShape,
    ZHelpGrid: XPropertySet,
    ZMainGrid: XPropertySet,
    acquire: () => Unit,
    getZAxis: () => XPropertySet,
    getZAxisTitle: () => XShape,
    getZHelpGrid: () => XPropertySet,
    getZMainGrid: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAxisZSupplier = {
    val __obj = js.Dynamic.literal(ZAxis = ZAxis, ZAxisTitle = ZAxisTitle, ZHelpGrid = ZHelpGrid, ZMainGrid = ZMainGrid, acquire = js.Any.fromFunction0(acquire), getZAxis = js.Any.fromFunction0(getZAxis), getZAxisTitle = js.Any.fromFunction0(getZAxisTitle), getZHelpGrid = js.Any.fromFunction0(getZHelpGrid), getZMainGrid = js.Any.fromFunction0(getZMainGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAxisZSupplier]
  }
}

