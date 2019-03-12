package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to remove text contents before or after existing text contents.
  * @deprecated Deprecated
  */
trait XRelativeTextContentRemove
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * removes the text content that follows the argument.
    *
    * This is helpful to remove empty paragraphs following text tables especially in headers, footers or text frames.
    */
  def removeTextContentAfter(xPredecessor: XTextContent): scala.Unit
  /**
    * removes the text content that precedes the argument.
    *
    * This is helpful to remove empty paragraphs before text tables.
    */
  def removeTextContentBefore(xSuccessor: XTextContent): scala.Unit
}

object XRelativeTextContentRemove {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeTextContentAfter: XTextContent => scala.Unit,
    removeTextContentBefore: XTextContent => scala.Unit
  ): XRelativeTextContentRemove = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTextContentAfter = js.Any.fromFunction1(removeTextContentAfter), removeTextContentBefore = js.Any.fromFunction1(removeTextContentBefore))
  
    __obj.asInstanceOf[XRelativeTextContentRemove]
  }
}

