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
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeTextContentAfter: js.Function1[XTextContent, scala.Unit],
    removeTextContentBefore: js.Function1[XTextContent, scala.Unit]
  ): XRelativeTextContentRemove = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeTextContentAfter")(removeTextContentAfter)
    __obj.updateDynamic("removeTextContentBefore")(removeTextContentBefore)
    __obj.asInstanceOf[XRelativeTextContentRemove]
  }
}

