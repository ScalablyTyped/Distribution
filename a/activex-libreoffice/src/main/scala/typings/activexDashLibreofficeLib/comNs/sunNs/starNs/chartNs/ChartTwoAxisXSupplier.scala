package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

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
  var HasSecondaryXAxis: scala.Boolean
  /** determines for the secondary x-axis if the labels at the tick marks are shown or hidden. */
  var HasSecondaryXAxisDescription: scala.Boolean
  /**
    * determines if the title of the secondary X-axis is shown or hidden.
    * @see ChartTitle
    * @since OOo 3.0
    */
  var HasSecondaryXAxisTitle: scala.Boolean
}

object ChartTwoAxisXSupplier {
  @scala.inline
  def apply(
    HasSecondaryXAxis: scala.Boolean,
    HasSecondaryXAxisDescription: scala.Boolean,
    HasSecondaryXAxisTitle: scala.Boolean,
    HasXAxis: scala.Boolean,
    HasXAxisDescription: scala.Boolean,
    HasXAxisGrid: scala.Boolean,
    HasXAxisHelpGrid: scala.Boolean,
    HasXAxisTitle: scala.Boolean,
    SecondaryXAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    XAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    XAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    XHelpGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    XMainGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
    getSecondaryXAxis: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getXAxis: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getXAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getXHelpGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getXMainGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): ChartTwoAxisXSupplier = {
    val __obj = js.Dynamic.literal(HasSecondaryXAxis = HasSecondaryXAxis, HasSecondaryXAxisDescription = HasSecondaryXAxisDescription, HasSecondaryXAxisTitle = HasSecondaryXAxisTitle, HasXAxis = HasXAxis, HasXAxisDescription = HasXAxisDescription, HasXAxisGrid = HasXAxisGrid, HasXAxisHelpGrid = HasXAxisHelpGrid, HasXAxisTitle = HasXAxisTitle, SecondaryXAxis = SecondaryXAxis, XAxis = XAxis, XAxisTitle = XAxisTitle, XHelpGrid = XHelpGrid, XMainGrid = XMainGrid, acquire = acquire, getSecondaryXAxis = getSecondaryXAxis, getXAxis = getXAxis, getXAxisTitle = getXAxisTitle, getXHelpGrid = getXHelpGrid, getXMainGrid = getXMainGrid, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[ChartTwoAxisXSupplier]
  }
}

