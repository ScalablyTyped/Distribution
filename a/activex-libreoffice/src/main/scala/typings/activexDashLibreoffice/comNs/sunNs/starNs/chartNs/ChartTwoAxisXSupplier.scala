package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** a helper service for chart documents which supply primary and secondary x-axes. */
trait ChartTwoAxisXSupplier
  extends XTwoAxisXSupplier
     with ChartAxisXSupplier {
  /**
    * determines if the secondary x-axis is shown or hidden.
    * @see ChartAxis
    */
  var HasSecondaryXAxis: Boolean
  /** determines for the secondary x-axis if the labels at the tick marks are shown or hidden. */
  var HasSecondaryXAxisDescription: Boolean
  /**
    * determines if the title of the secondary X-axis is shown or hidden.
    * @see ChartTitle
    * @since OOo 3.0
    */
  var HasSecondaryXAxisTitle: Boolean
}

object ChartTwoAxisXSupplier {
  @scala.inline
  def apply(
    HasSecondaryXAxis: Boolean,
    HasSecondaryXAxisDescription: Boolean,
    HasSecondaryXAxisTitle: Boolean,
    HasXAxis: Boolean,
    HasXAxisDescription: Boolean,
    HasXAxisGrid: Boolean,
    HasXAxisHelpGrid: Boolean,
    HasXAxisTitle: Boolean,
    SecondaryXAxis: XPropertySet,
    XAxis: XPropertySet,
    XAxisTitle: XShape,
    XHelpGrid: XPropertySet,
    XMainGrid: XPropertySet,
    acquire: () => Unit,
    getSecondaryXAxis: () => XPropertySet,
    getXAxis: () => XPropertySet,
    getXAxisTitle: () => XShape,
    getXHelpGrid: () => XPropertySet,
    getXMainGrid: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): ChartTwoAxisXSupplier = {
    val __obj = js.Dynamic.literal(HasSecondaryXAxis = HasSecondaryXAxis, HasSecondaryXAxisDescription = HasSecondaryXAxisDescription, HasSecondaryXAxisTitle = HasSecondaryXAxisTitle, HasXAxis = HasXAxis, HasXAxisDescription = HasXAxisDescription, HasXAxisGrid = HasXAxisGrid, HasXAxisHelpGrid = HasXAxisHelpGrid, HasXAxisTitle = HasXAxisTitle, SecondaryXAxis = SecondaryXAxis, XAxis = XAxis, XAxisTitle = XAxisTitle, XHelpGrid = XHelpGrid, XMainGrid = XMainGrid, acquire = js.Any.fromFunction0(acquire), getSecondaryXAxis = js.Any.fromFunction0(getSecondaryXAxis), getXAxis = js.Any.fromFunction0(getXAxis), getXAxisTitle = js.Any.fromFunction0(getXAxisTitle), getXHelpGrid = js.Any.fromFunction0(getXHelpGrid), getXMainGrid = js.Any.fromFunction0(getXMainGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[ChartTwoAxisXSupplier]
  }
}

