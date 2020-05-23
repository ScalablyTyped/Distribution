package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import typings.activexLibreoffice.activexLibreofficeNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies how cell contents are aligned horizontally. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`5`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait CellHoriJustify extends js.Object

object CellHoriJustify {
  /** contents are justified to the cell width. */
  @scala.inline
  def BLOCK: `4` = 4.asInstanceOf[`4`]
  /**
    * contents are horizontally centered.
    *
    * contents are aligned to the vertical middle of the cell.
    */
  @scala.inline
  def CENTER: `2` = 2.asInstanceOf[`2`]
  /** contents are aligned to the left edge of the cell. */
  @scala.inline
  def LEFT: `1` = 1.asInstanceOf[`1`]
  /** contents are repeated to fill the cell. */
  @scala.inline
  def REPEAT: `5` = 5.asInstanceOf[`5`]
  /** contents are aligned to the right edge of the cell. */
  @scala.inline
  def RIGHT: `3` = 3.asInstanceOf[`3`]
  /**
    * default alignment is used (left for numbers, right for text).
    *
    * contents are printed from left to right.
    *
    * default alignment is used.
    */
  @scala.inline
  def STANDARD: `0` = 0.asInstanceOf[`0`]
}

