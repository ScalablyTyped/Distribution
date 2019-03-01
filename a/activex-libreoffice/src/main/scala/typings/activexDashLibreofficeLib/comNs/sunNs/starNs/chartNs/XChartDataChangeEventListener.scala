package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive events when chart data changes. */
trait XChartDataChangeEventListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is called whenever chart data changes in value or structure.
    *
    * This interface must be implemented by components that wish to get notified of changes in chart data. They can be registered at an {@link XChartData}
    * component.
    * @param aEvent the event that gives further information on what changed.
    * @see ChartDataChangeEvent
    * @see XChartData
    */
  def chartDataChanged(aEvent: ChartDataChangeEvent): scala.Unit
}

object XChartDataChangeEventListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    chartDataChanged: js.Function1[ChartDataChangeEvent, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XChartDataChangeEventListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("chartDataChanged")(chartDataChanged)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XChartDataChangeEventListener]
  }
}

