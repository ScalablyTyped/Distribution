package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShape
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to the **y** -axis of a chart.
  *
  * Note that not all diagrams are capable of displaying a **y** -axis, e.g., the {@link PieDiagram} .
  * @see XDiagram
  */
trait XAxisYSupplier extends XInterface {
  /**
    * @returns the properties of the **y** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  val YAxis: XPropertySet
  /**
    * @returns the **y** -axis title shape.
    * @see ChartTitle
    */
  val YAxisTitle: XShape
  /**
    * @returns the properties of the help grid (minor grid) of the **y** -axis of the diagram.
    * @see ChartGrid
    */
  val YHelpGrid: XPropertySet
  /**
    * @returns the properties of the main grid (major grid) of the **y** -axis of the diagram.
    * @see ChartGrid
    */
  val YMainGrid: XPropertySet
  /**
    * @returns the properties of the **y** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  def getYAxis(): XPropertySet
  /**
    * @returns the **y** -axis title shape.
    * @see ChartTitle
    */
  def getYAxisTitle(): XShape
  /**
    * @returns the properties of the help grid (minor grid) of the **y** -axis of the diagram.
    * @see ChartGrid
    */
  def getYHelpGrid(): XPropertySet
  /**
    * @returns the properties of the main grid (major grid) of the **y** -axis of the diagram.
    * @see ChartGrid
    */
  def getYMainGrid(): XPropertySet
}

object XAxisYSupplier {
  @scala.inline
  def apply(
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
  ): XAxisYSupplier = {
    val __obj = js.Dynamic.literal(YAxis = YAxis, YAxisTitle = YAxisTitle, YHelpGrid = YHelpGrid, YMainGrid = YMainGrid, acquire = js.Any.fromFunction0(acquire), getYAxis = js.Any.fromFunction0(getYAxis), getYAxisTitle = js.Any.fromFunction0(getYAxisTitle), getYHelpGrid = js.Any.fromFunction0(getYHelpGrid), getYMainGrid = js.Any.fromFunction0(getYMainGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAxisYSupplier]
  }
}

