package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** enables objects to be inserted into a text and to provide their location in a text once they are inserted into it. */
trait XTextContent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  /** @returns the text range to which the content is attached.  Note: The anchor of the actual implementation for text tables does not have a position in the t */
  val Anchor: XTextRange
  /**
    * is called when this object gets embedded in a text.
    *
    * This acts like a multi-phase construction, thus the object may be invalid until it is attached to a text position. Usually this method is called from
    * within {@link XText.insertTextContent()} .
    *
    * Both text objects and text content objects may only be connected to each other if they are created by the same component. When implementing new
    * components, this behavior is deprecated.
    */
  def attach(xTextRange: XTextRange): scala.Unit
  /** @returns the text range to which the content is attached.  Note: The anchor of the actual implementation for text tables does not have a position in the t */
  def getAnchor(): XTextRange
}

