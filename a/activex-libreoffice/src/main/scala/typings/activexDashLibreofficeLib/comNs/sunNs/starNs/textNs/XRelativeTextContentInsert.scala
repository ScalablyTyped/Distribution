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
    acquire: js.Function0[scala.Unit],
    insertTextContentAfter: js.Function2[XTextContent, XTextContent, scala.Unit],
    insertTextContentBefore: js.Function2[XTextContent, XTextContent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XRelativeTextContentInsert = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("insertTextContentAfter")(insertTextContentAfter)
    __obj.updateDynamic("insertTextContentBefore")(insertTextContentBefore)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XRelativeTextContentInsert]
  }
}

