package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextContentAnchorType extends js.Object

/** specify how the text content is attached to its surrounding text. */
@JSGlobal("com.sun.star.text.TextContentAnchorType")
@js.native
object TextContentAnchorType extends js.Object {
  /**
    * The object is anchored instead of a character.
    *
    * <p>The size of the object influences the height of the text line.</p>
    */
  @js.native
  sealed trait AS_CHARACTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextContentAnchorType
  
  /**
    * The object is anchored to a character.
    *
    * <p>The position of the object changes if the position of this
    *
    * character is changed.
    *
    * </p>
    */
  @js.native
  sealed trait AT_CHARACTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextContentAnchorType
  
  /** The object is anchored to a text frame. */
  @js.native
  sealed trait AT_FRAME
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextContentAnchorType
  
  /**
    * The object is anchored to the page.
    *
    * <p>The position does not change if the content of the document is changed.</p>
    */
  @js.native
  sealed trait AT_PAGE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextContentAnchorType
  
  /** The anchor of the object is set at the top left position of the paragraph. */
  @js.native
  sealed trait AT_PARAGRAPH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextContentAnchorType
  
  /* 1 */ val AS_CHARACTER: AS_CHARACTER with scala.Double = js.native
  /* 4 */ val AT_CHARACTER: AT_CHARACTER with scala.Double = js.native
  /* 3 */ val AT_FRAME: AT_FRAME with scala.Double = js.native
  /* 2 */ val AT_PAGE: AT_PAGE with scala.Double = js.native
  /* 0 */ val AT_PARAGRAPH: AT_PARAGRAPH with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextContentAnchorType with scala.Double
  ] = js.native
}

