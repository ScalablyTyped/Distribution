package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies one of the default positions of the legend in relation to the diagram. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
*/
trait ChartLegendPosition extends js.Object

object ChartLegendPosition {
  /**
    * displays the chart legend beneath the diagram. <p>The second entry in the legend is placed on the right hand
    *
    * side of the first one.</p>
    */
  @scala.inline
  def BOTTOM: `4` = this.cast(4)
  /**
    * displays the chart legend on the left side of the diagram. <p>The second entry in the legend is placed below the first
    *
    * one.</p>
    */
  @scala.inline
  def LEFT: `1` = this.cast(1)
  /**
    * error indicators are not displayed.
    *
    * displays no error indicators.
    *
    * no chart legend is displayed. <p>To disable the legend you should set the property
    *
    * ChartDocument::HasLegend to `FALSE` instead
    *
    * of setting this value.</p>
    *
    *
    *
    * displays no regression curve.
    */
  @scala.inline
  def NONE: `0` = this.cast(0)
  /**
    * displays the chart legend on the right side of the diagram. <p>The second entry in the legend is placed below the first
    *
    * one.</p>
    */
  @scala.inline
  def RIGHT: `3` = this.cast(3)
  /**
    * displays the chart legend above the diagram. <p>The second entry in the legend is placed on the right hand
    *
    * side of the first one.</p>
    */
  @scala.inline
  def TOP: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

