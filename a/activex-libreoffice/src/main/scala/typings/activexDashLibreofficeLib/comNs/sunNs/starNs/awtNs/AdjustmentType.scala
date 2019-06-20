package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the adjustment type. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
*/
trait AdjustmentType extends js.Object

object AdjustmentType {
  /** adjustment is originated by dragging the thumb. */
  @scala.inline
  def ADJUST_ABS: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /**
    * adjustment is originated by a line jump. <p>A line jump can, for example, be caused by a click on
    *
    * one of the pointer buttons.</p>
    */
  @scala.inline
  def ADJUST_LINE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /**
    * adjustment is originated by a page jump. <p>A page jump can, for example, be caused by a click in the
    *
    * background area of the scrollbar (neither one of the pointer
    *
    * buttons, nor the thumb).</p>
    */
  @scala.inline
  def ADJUST_PAGE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

