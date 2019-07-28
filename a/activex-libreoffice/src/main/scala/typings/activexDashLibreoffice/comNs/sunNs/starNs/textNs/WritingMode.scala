package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this enum covers the different writing directions
  * @deprecated DeprecatedUse WritingMode2 instead
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
*/
trait WritingMode extends js.Object

object WritingMode {
  /**
    * text within lines is written left-to-right. lines and blocks are placed top-to-bottom.
    *
    * Typically, this is the writing mode for normal "alphabetic" text.
    */
  @scala.inline
  def LR_TB: `0` = this.cast(0)
  /**
    * text within a line are written right-to-left. Lines and blocks are placed top-to-bottom.
    *
    * Typically, this writing mode is used in Arabic and Hebrew text.
    */
  @scala.inline
  def RL_TB: `1` = this.cast(1)
  /**
    * text within a line is written top-to-bottom. Lines and blocks are placed right-to-left.
    *
    * Typically, this writing mode is used in Chinese and Japanese text.
    */
  @scala.inline
  def TB_RL: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

