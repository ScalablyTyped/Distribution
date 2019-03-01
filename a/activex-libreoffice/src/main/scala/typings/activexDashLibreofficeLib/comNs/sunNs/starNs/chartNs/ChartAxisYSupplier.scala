package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A helper service for the y-axis. */
trait ChartAxisYSupplier extends XAxisYSupplier {
  /**
    * Determines if the y-axis is shown or hidden.
    * @see ChartAxis
    */
  var HasYAxis: scala.Boolean
  /** Determines if the description of the y-axis is shown or hidden. */
  var HasYAxisDescription: scala.Boolean
  /**
    * Determines if the major grid of the y-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasYAxisGrid: scala.Boolean
  /**
    * Determines if the minor grid of the y-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasYAxisHelpGrid: scala.Boolean
  /**
    * Determines if the title of the y-axis is shown or hidden.
    * @see ChartTitle
    */
  var HasYAxisTitle: scala.Boolean
}

object ChartAxisYSupplier {
  @scala.inline
  def apply(
    HasYAxis: scala.Boolean,
    HasYAxisDescription: scala.Boolean,
    HasYAxisGrid: scala.Boolean,
    HasYAxisHelpGrid: scala.Boolean,
    HasYAxisTitle: scala.Boolean,
    YAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    YAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    YHelpGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    YMainGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
    getYAxis: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getYAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getYHelpGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getYMainGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): ChartAxisYSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("HasYAxis")(HasYAxis)
    __obj.updateDynamic("HasYAxisDescription")(HasYAxisDescription)
    __obj.updateDynamic("HasYAxisGrid")(HasYAxisGrid)
    __obj.updateDynamic("HasYAxisHelpGrid")(HasYAxisHelpGrid)
    __obj.updateDynamic("HasYAxisTitle")(HasYAxisTitle)
    __obj.updateDynamic("YAxis")(YAxis)
    __obj.updateDynamic("YAxisTitle")(YAxisTitle)
    __obj.updateDynamic("YHelpGrid")(YHelpGrid)
    __obj.updateDynamic("YMainGrid")(YMainGrid)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getYAxis")(getYAxis)
    __obj.updateDynamic("getYAxisTitle")(getYAxisTitle)
    __obj.updateDynamic("getYHelpGrid")(getYHelpGrid)
    __obj.updateDynamic("getYMainGrid")(getYMainGrid)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[ChartAxisYSupplier]
  }
}

