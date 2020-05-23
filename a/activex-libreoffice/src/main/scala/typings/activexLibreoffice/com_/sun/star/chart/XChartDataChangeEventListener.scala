package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive events when chart data changes. */
trait XChartDataChangeEventListener extends XEventListener {
  /**
    * is called whenever chart data changes in value or structure.
    *
    * This interface must be implemented by components that wish to get notified of changes in chart data. They can be registered at an {@link XChartData}
    * component.
    * @param aEvent the event that gives further information on what changed.
    * @see ChartDataChangeEvent
    * @see XChartData
    */
  def chartDataChanged(aEvent: ChartDataChangeEvent): Unit
}

object XChartDataChangeEventListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    chartDataChanged: ChartDataChangeEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XChartDataChangeEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), chartDataChanged = js.Any.fromFunction1(chartDataChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XChartDataChangeEventListener]
  }
}

