package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A helper service for chart documents which supply a z-axis. */
trait ChartAxisZSupplier extends XAxisZSupplier {
  /**
    * Determines if the z-axis is shown or hidden.
    * @see ChartAxis
    */
  var HasZAxis: scala.Boolean
  /** Determines if the description of the z-axis is shown or hidden. */
  var HasZAxisDescription: scala.Boolean
  /**
    * Determines if the major grid of the z-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasZAxisGrid: scala.Boolean
  /**
    * Determines if the minor grid of the z-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasZAxisHelpGrid: scala.Boolean
  /**
    * Determines if the title of the z-axis is shown or hidden.
    * @see ChartTitle
    */
  var HasZAxisTitle: scala.Boolean
}

object ChartAxisZSupplier {
  @scala.inline
  def apply(
    HasZAxis: scala.Boolean,
    HasZAxisDescription: scala.Boolean,
    HasZAxisGrid: scala.Boolean,
    HasZAxisHelpGrid: scala.Boolean,
    HasZAxisTitle: scala.Boolean,
    ZAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    ZAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    ZHelpGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    ZMainGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
    getZAxis: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getZAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getZHelpGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getZMainGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): ChartAxisZSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("HasZAxis")(HasZAxis)
    __obj.updateDynamic("HasZAxisDescription")(HasZAxisDescription)
    __obj.updateDynamic("HasZAxisGrid")(HasZAxisGrid)
    __obj.updateDynamic("HasZAxisHelpGrid")(HasZAxisHelpGrid)
    __obj.updateDynamic("HasZAxisTitle")(HasZAxisTitle)
    __obj.updateDynamic("ZAxis")(ZAxis)
    __obj.updateDynamic("ZAxisTitle")(ZAxisTitle)
    __obj.updateDynamic("ZHelpGrid")(ZHelpGrid)
    __obj.updateDynamic("ZMainGrid")(ZMainGrid)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getZAxis")(getZAxis)
    __obj.updateDynamic("getZAxisTitle")(getZAxisTitle)
    __obj.updateDynamic("getZHelpGrid")(getZHelpGrid)
    __obj.updateDynamic("getZMainGrid")(getZMainGrid)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[ChartAxisZSupplier]
  }
}

