package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies sizing aspects of the legend */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
*/
trait ChartLegendExpansion extends js.Object

object ChartLegendExpansion {
  /** The legend entries are arranged in a way that the aspect ratio of the resulting legend is as near to 1 as possible. */
  @scala.inline
  def BALANCED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** The size of the legend is given explicitly */
  @scala.inline
  def CUSTOM: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /**
    * The legend entries are stacked in a single column if possible. If not enough space is available further columns are added. <p>This is usually used for
    * legends that are displayed on the
    *
    * left or right hand side of the page.</p>
    */
  @scala.inline
  def HIGH: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /**
    * The legend entries are arranged in a single row if possible. If not enough space is available further rows are added. <p>This is usually used for
    * legends that are displayed at the
    *
    * top or bottom of the page.</p>
    */
  @scala.inline
  def WIDE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

