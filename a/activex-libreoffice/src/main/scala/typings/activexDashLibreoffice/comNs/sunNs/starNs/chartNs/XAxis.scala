package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows easier access to the different subelements of an axis.
  * @since OOo 3.4
  */
trait XAxis extends XInterface {
  /** @returns the title of the axis. The returned object supports the properties described in service {@link ChartTitle} . */
  val AxisTitle: XPropertySet
  /** @returns the properties of the major grid of the axis. The returned object supports service {@link ChartGrid} . */
  val MajorGrid: XPropertySet
  /** @returns the properties of the minor grid of the axis. The returned object supports service {@link ChartGrid} . */
  val MinorGrid: XPropertySet
  /** @returns the title of the axis. The returned object supports the properties described in service {@link ChartTitle} . */
  def getAxisTitle(): XPropertySet
  /** @returns the properties of the major grid of the axis. The returned object supports service {@link ChartGrid} . */
  def getMajorGrid(): XPropertySet
  /** @returns the properties of the minor grid of the axis. The returned object supports service {@link ChartGrid} . */
  def getMinorGrid(): XPropertySet
}

object XAxis {
  @scala.inline
  def apply(
    AxisTitle: XPropertySet,
    MajorGrid: XPropertySet,
    MinorGrid: XPropertySet,
    acquire: () => Unit,
    getAxisTitle: () => XPropertySet,
    getMajorGrid: () => XPropertySet,
    getMinorGrid: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAxis = {
    val __obj = js.Dynamic.literal(AxisTitle = AxisTitle, MajorGrid = MajorGrid, MinorGrid = MinorGrid, acquire = js.Any.fromFunction0(acquire), getAxisTitle = js.Any.fromFunction0(getAxisTitle), getMajorGrid = js.Any.fromFunction0(getMajorGrid), getMinorGrid = js.Any.fromFunction0(getMinorGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAxis]
  }
}

