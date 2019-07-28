package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** has to be supported by charts providing the capabilities of a horizontal axis, i.e., an **x** -axis. */
trait ChartAxisXSupplier extends XAxisXSupplier {
  /**
    * This property determines if the x-axis is shown or hidden.
    * @see ChartAxis
    */
  var HasXAxis: Boolean
  /** Determines if the description of the x-axis is shown or hidden. */
  var HasXAxisDescription: Boolean
  /**
    * Determines if the major grid of the x-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasXAxisGrid: Boolean
  /**
    * Determines if the minor grid of the x-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasXAxisHelpGrid: Boolean
  /**
    * Determines if the title of the x-axis is shown or hidden.
    * @see ChartTitle
    */
  var HasXAxisTitle: Boolean
}

object ChartAxisXSupplier {
  @scala.inline
  def apply(
    HasXAxis: Boolean,
    HasXAxisDescription: Boolean,
    HasXAxisGrid: Boolean,
    HasXAxisHelpGrid: Boolean,
    HasXAxisTitle: Boolean,
    XAxis: XPropertySet,
    XAxisTitle: XShape,
    XHelpGrid: XPropertySet,
    XMainGrid: XPropertySet,
    acquire: () => Unit,
    getXAxis: () => XPropertySet,
    getXAxisTitle: () => XShape,
    getXHelpGrid: () => XPropertySet,
    getXMainGrid: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): ChartAxisXSupplier = {
    val __obj = js.Dynamic.literal(HasXAxis = HasXAxis, HasXAxisDescription = HasXAxisDescription, HasXAxisGrid = HasXAxisGrid, HasXAxisHelpGrid = HasXAxisHelpGrid, HasXAxisTitle = HasXAxisTitle, XAxis = XAxis, XAxisTitle = XAxisTitle, XHelpGrid = XHelpGrid, XMainGrid = XMainGrid, acquire = js.Any.fromFunction0(acquire), getXAxis = js.Any.fromFunction0(getXAxis), getXAxisTitle = js.Any.fromFunction0(getXAxisTitle), getXHelpGrid = js.Any.fromFunction0(getXHelpGrid), getXMainGrid = js.Any.fromFunction0(getXMainGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[ChartAxisXSupplier]
  }
}

