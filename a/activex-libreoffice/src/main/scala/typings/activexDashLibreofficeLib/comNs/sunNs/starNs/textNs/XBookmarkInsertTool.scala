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
    acquire: () => scala.Unit,
    insertNewBookmark: (XTextRange, java.lang.String) => XTextContent,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XBookmarkInsertTool = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), insertNewBookmark = js.Any.fromFunction2(insertNewBookmark), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XBookmarkInsertTool]
  }
}

