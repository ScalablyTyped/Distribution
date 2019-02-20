package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows easier access to the different subelements of an axis.
  * @since OOo 3.4
  */
trait XAxis
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the title of the axis. The returned object supports the properties described in service {@link ChartTitle} . */
  val AxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** @returns the properties of the major grid of the axis. The returned object supports service {@link ChartGrid} . */
  val MajorGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** @returns the properties of the minor grid of the axis. The returned object supports service {@link ChartGrid} . */
  val MinorGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** @returns the title of the axis. The returned object supports the properties described in service {@link ChartTitle} . */
  def getAxisTitle(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** @returns the properties of the major grid of the axis. The returned object supports service {@link ChartGrid} . */
  def getMajorGrid(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** @returns the properties of the minor grid of the axis. The returned object supports service {@link ChartGrid} . */
  def getMinorGrid(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}

