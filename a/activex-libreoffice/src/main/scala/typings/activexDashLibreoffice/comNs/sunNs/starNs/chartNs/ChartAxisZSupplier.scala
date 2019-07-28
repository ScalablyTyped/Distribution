package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A helper service for chart documents which supply a z-axis. */
trait ChartAxisZSupplier extends XAxisZSupplier {
  /**
    * Determines if the z-axis is shown or hidden.
    * @see ChartAxis
    */
  var HasZAxis: Boolean
  /** Determines if the description of the z-axis is shown or hidden. */
  var HasZAxisDescription: Boolean
  /**
    * Determines if the major grid of the z-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasZAxisGrid: Boolean
  /**
    * Determines if the minor grid of the z-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasZAxisHelpGrid: Boolean
  /**
    * Determines if the title of the z-axis is shown or hidden.
    * @see ChartTitle
    */
  var HasZAxisTitle: Boolean
}

object ChartAxisZSupplier {
  @scala.inline
  def apply(
    HasZAxis: Boolean,
    HasZAxisDescription: Boolean,
    HasZAxisGrid: Boolean,
    HasZAxisHelpGrid: Boolean,
    HasZAxisTitle: Boolean,
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
  ): ChartAxisZSupplier = {
    val __obj = js.Dynamic.literal(HasZAxis = HasZAxis, HasZAxisDescription = HasZAxisDescription, HasZAxisGrid = HasZAxisGrid, HasZAxisHelpGrid = HasZAxisHelpGrid, HasZAxisTitle = HasZAxisTitle, ZAxis = ZAxis, ZAxisTitle = ZAxisTitle, ZHelpGrid = ZHelpGrid, ZMainGrid = ZMainGrid, acquire = js.Any.fromFunction0(acquire), getZAxis = js.Any.fromFunction0(getZAxis), getZAxisTitle = js.Any.fromFunction0(getZAxisTitle), getZHelpGrid = js.Any.fromFunction0(getZHelpGrid), getZMainGrid = js.Any.fromFunction0(getZMainGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[ChartAxisZSupplier]
  }
}

