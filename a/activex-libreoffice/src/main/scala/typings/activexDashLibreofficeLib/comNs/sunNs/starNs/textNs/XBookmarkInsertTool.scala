package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * offers an easy way to insert bookmarks by name.
  * @see Text
  */
trait XBookmarkInsertTool
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** inserts a bookmark at the specified text position. */
  def insertNewBookmark(xTextRange: XTextRange, aName: java.lang.String): XTextContent
}

object XBookmarkInsertTool {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    insertNewBookmark: js.Function2[XTextRange, java.lang.String, XTextContent],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XBookmarkInsertTool = {
    val __obj = js.Dynamic.literal(acquire = acquire, insertNewBookmark = insertNewBookmark, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XBookmarkInsertTool]
  }
}

