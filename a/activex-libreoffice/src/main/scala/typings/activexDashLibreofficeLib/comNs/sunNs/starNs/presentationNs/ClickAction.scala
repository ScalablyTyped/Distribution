package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This enumeration specifies the actions which can be processed when a user clicks on an object. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`12`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`11`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`13`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`10`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`9`
*/
trait ClickAction extends js.Object

object ClickAction {
  /** The presentation jumps to a bookmark. */
  @scala.inline
  def BOOKMARK: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5` = this.cast(5)
  /** The presentation jumps to another document. */
  @scala.inline
  def DOCUMENT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6` = this.cast(6)
  /** The presentation continues with the first page. */
  @scala.inline
  def FIRSTPAGE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /** The object renders itself invisible after a click. */
  @scala.inline
  def INVISIBLE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7` = this.cast(7)
  /** The presentation continues with the last page. */
  @scala.inline
  def LASTPAGE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /** A star basic macro is executed after the click. */
  @scala.inline
  def MACRO: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`12` = this.cast(12)
  /** The presentation jumps to the next page. */
  @scala.inline
  def NEXTPAGE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /**
    * use no animation effects.
    *
    * No action is performed on click.
    *
    * use no fade effects.
    */
  @scala.inline
  def NONE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** The presentation jumps to the previous page. */
  @scala.inline
  def PREVPAGE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** Another program is executed after a click. */
  @scala.inline
  def PROGRAM: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`11` = this.cast(11)
  /** A sound is played after a click. */
  @scala.inline
  def SOUND: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8` = this.cast(8)
  /** The presentation is stopped after the click. */
  @scala.inline
  def STOPPRESENTATION: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`13` = this.cast(13)
  /** The object vanishes with its effect. */
  @scala.inline
  def VANISH: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`10` = this.cast(10)
  /** An OLE verb is performed on this object. */
  @scala.inline
  def VERB: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`9` = this.cast(9)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

