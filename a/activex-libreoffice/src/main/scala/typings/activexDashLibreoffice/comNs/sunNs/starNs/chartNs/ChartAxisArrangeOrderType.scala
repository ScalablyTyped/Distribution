package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Values specify the arrangement of the axes descriptions. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
*/
trait ChartAxisArrangeOrderType extends js.Object

object ChartAxisArrangeOrderType {
  /**
    * The descriptions are arranged automatically. <p>If there is enough space to put them side by side, this
    *
    * arrangement is preferred. If the descriptions would overlap
    *
    * when arranged side by side, they are staggered.</p>
    */
  @scala.inline
  def AUTO: `0` = this.cast(0)
  /** The descriptions are arranged side by side. */
  @scala.inline
  def SIDE_BY_SIDE: `1` = this.cast(1)
  /** The descriptions are alternately put on two lines with the even values out of the normal line. */
  @scala.inline
  def STAGGER_EVEN: `2` = this.cast(2)
  /** The descriptions are alternately put on two lines with the odd values out of the normal line. */
  @scala.inline
  def STAGGER_ODD: `3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

