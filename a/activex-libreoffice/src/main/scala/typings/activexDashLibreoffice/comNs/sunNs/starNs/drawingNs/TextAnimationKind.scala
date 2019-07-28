package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This enumeration specifies the type of animation for a text. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
*/
trait TextAnimationKind extends js.Object

object TextAnimationKind {
  /** Scroll the text from one side to the other and back. */
  @scala.inline
  def ALTERNATE: `3` = this.cast(3)
  /** Let this text switch its state from visible to invisible continuously. */
  @scala.inline
  def BLINK: `1` = this.cast(1)
  /**
    * the area is not filled.
    *
    * the line has no special end.
    *
    * the joint between lines will not be connected
    *
    * the line is hidden.
    *
    * Don't animate this text.
    *
    * the text size is only defined by the font properties
    */
  @scala.inline
  def NONE: `0` = this.cast(0)
  /** Let this text scroll. */
  @scala.inline
  def SCROLL: `2` = this.cast(2)
  /** Scroll the text from one side to the final position and stop there. */
  @scala.inline
  def SLIDE: `4` = this.cast(4)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

