package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to remove text contents before or after existing text contents.
  * @deprecated Deprecated
  */
trait XRelativeTextContentRemove extends XInterface {
  /**
    * removes the text content that follows the argument.
    *
    * This is helpful to remove empty paragraphs following text tables especially in headers, footers or text frames.
    */
  def removeTextContentAfter(xPredecessor: XTextContent): Unit
  /**
    * removes the text content that precedes the argument.
    *
    * This is helpful to remove empty paragraphs before text tables.
    */
  def removeTextContentBefore(xSuccessor: XTextContent): Unit
}

object XRelativeTextContentRemove {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeTextContentAfter: XTextContent => Unit,
    removeTextContentBefore: XTextContent => Unit
  ): XRelativeTextContentRemove = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTextContentAfter = js.Any.fromFunction1(removeTextContentAfter), removeTextContentBefore = js.Any.fromFunction1(removeTextContentBefore))
  
    __obj.asInstanceOf[XRelativeTextContentRemove]
  }
}

