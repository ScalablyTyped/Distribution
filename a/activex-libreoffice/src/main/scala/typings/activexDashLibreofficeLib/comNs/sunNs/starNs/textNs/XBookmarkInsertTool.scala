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

