package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to insert new text contents before or after existing text contents.
  * @deprecated Deprecated
  */
trait XRelativeTextContentInsert
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * inserts text the new text content after the predecessor argument.
    *
    * This is helpful to insert paragraphs after text tables especially in headers, footers or text frames.
    */
  def insertTextContentAfter(xNewContent: XTextContent, xPredecessor: XTextContent): scala.Unit
  /**
    * inserts text the new text content before of the successor argument.
    *
    * This is helpful to insert paragraphs before of text tables.
    */
  def insertTextContentBefore(xNewContent: XTextContent, xSuccessor: XTextContent): scala.Unit
}

object XRelativeTextContentInsert {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    insertTextContentAfter: (XTextContent, XTextContent) => scala.Unit,
    insertTextContentBefore: (XTextContent, XTextContent) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XRelativeTextContentInsert = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), insertTextContentAfter = js.Any.fromFunction2(insertTextContentAfter), insertTextContentBefore = js.Any.fromFunction2(insertTextContentBefore), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XRelativeTextContentInsert]
  }
}

