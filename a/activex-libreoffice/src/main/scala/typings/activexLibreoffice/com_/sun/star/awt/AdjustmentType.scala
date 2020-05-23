package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the adjustment type. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait AdjustmentType extends js.Object

object AdjustmentType {
  /** adjustment is originated by dragging the thumb. */
  @scala.inline
  def ADJUST_ABS: `2` = 2.asInstanceOf[`2`]
  /**
    * adjustment is originated by a line jump. <p>A line jump can, for example, be caused by a click on
    *
    * one of the pointer buttons.</p>
    */
  @scala.inline
  def ADJUST_LINE: `0` = 0.asInstanceOf[`0`]
  /**
    * adjustment is originated by a page jump. <p>A page jump can, for example, be caused by a click in the
    *
    * background area of the scrollbar (neither one of the pointer
    *
    * buttons, nor the thumb).</p>
    */
  @scala.inline
  def ADJUST_PAGE: `1` = 1.asInstanceOf[`1`]
}

