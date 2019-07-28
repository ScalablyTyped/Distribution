package typings.activexDashLibreoffice.comNs.sunNs.starNs.presentationNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`10`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`11`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`12`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`13`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`7`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`8`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This enumeration specifies the actions which can be processed when a user clicks on an object. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`7`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`12`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`11`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`8`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`13`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`10`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`9`
*/
trait ClickAction extends js.Object

object ClickAction {
  /** The presentation jumps to a bookmark. */
  @scala.inline
  def BOOKMARK: `5` = this.cast(5)
  /** The presentation jumps to another document. */
  @scala.inline
  def DOCUMENT: `6` = this.cast(6)
  /** The presentation continues with the first page. */
  @scala.inline
  def FIRSTPAGE: `3` = this.cast(3)
  /** The object renders itself invisible after a click. */
  @scala.inline
  def INVISIBLE: `7` = this.cast(7)
  /** The presentation continues with the last page. */
  @scala.inline
  def LASTPAGE: `4` = this.cast(4)
  /** A star basic macro is executed after the click. */
  @scala.inline
  def MACRO: `12` = this.cast(12)
  /** The presentation jumps to the next page. */
  @scala.inline
  def NEXTPAGE: `2` = this.cast(2)
  /**
    * use no animation effects.
    *
    * No action is performed on click.
    *
    * use no fade effects.
    */
  @scala.inline
  def NONE: `0` = this.cast(0)
  /** The presentation jumps to the previous page. */
  @scala.inline
  def PREVPAGE: `1` = this.cast(1)
  /** Another program is executed after a click. */
  @scala.inline
  def PROGRAM: `11` = this.cast(11)
  /** A sound is played after a click. */
  @scala.inline
  def SOUND: `8` = this.cast(8)
  /** The presentation is stopped after the click. */
  @scala.inline
  def STOPPRESENTATION: `13` = this.cast(13)
  /** The object vanishes with its effect. */
  @scala.inline
  def VANISH: `10` = this.cast(10)
  /** An OLE verb is performed on this object. */
  @scala.inline
  def VERB: `9` = this.cast(9)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

