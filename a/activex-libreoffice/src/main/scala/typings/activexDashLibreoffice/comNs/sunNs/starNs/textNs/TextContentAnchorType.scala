package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specify how the text content is attached to its surrounding text. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
*/
trait TextContentAnchorType extends js.Object

object TextContentAnchorType {
  /**
    * The object is anchored instead of a character.
    *
    * <p>The size of the object influences the height of the text line.</p>
    */
  @scala.inline
  def AS_CHARACTER: `1` = this.cast(1)
  /**
    * The object is anchored to a character.
    *
    * <p>The position of the object changes if the position of this
    *
    * character is changed.
    *
    * </p>
    */
  @scala.inline
  def AT_CHARACTER: `4` = this.cast(4)
  /** The object is anchored to a text frame. */
  @scala.inline
  def AT_FRAME: `3` = this.cast(3)
  /**
    * The object is anchored to the page.
    *
    * <p>The position does not change if the content of the document is changed.</p>
    */
  @scala.inline
  def AT_PAGE: `2` = this.cast(2)
  /** The anchor of the object is set at the top left position of the paragraph. */
  @scala.inline
  def AT_PARAGRAPH: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

