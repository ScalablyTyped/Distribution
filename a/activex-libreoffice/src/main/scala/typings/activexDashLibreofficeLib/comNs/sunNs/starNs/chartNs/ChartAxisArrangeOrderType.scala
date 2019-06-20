package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Values specify the arrangement of the axes descriptions. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
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
  def AUTO: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** The descriptions are arranged side by side. */
  @scala.inline
  def SIDE_BY_SIDE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** The descriptions are alternately put on two lines with the even values out of the normal line. */
  @scala.inline
  def STAGGER_EVEN: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** The descriptions are alternately put on two lines with the odd values out of the normal line. */
  @scala.inline
  def STAGGER_ODD: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

