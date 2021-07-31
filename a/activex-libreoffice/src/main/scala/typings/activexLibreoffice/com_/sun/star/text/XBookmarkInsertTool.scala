package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * offers an easy way to insert bookmarks by name.
  * @see Text
  */
trait XBookmarkInsertTool
  extends StObject
     with XInterface {
  
  /** inserts a bookmark at the specified text position. */
  def insertNewBookmark(xTextRange: XTextRange, aName: String): XTextContent
}
object XBookmarkInsertTool {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    insertNewBookmark: (XTextRange, String) => XTextContent,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XBookmarkInsertTool = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), insertNewBookmark = js.Any.fromFunction2(insertNewBookmark), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XBookmarkInsertTool]
  }
  
  @scala.inline
  implicit class XBookmarkInsertToolMutableBuilder[Self <: XBookmarkInsertTool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsertNewBookmark(value: (XTextRange, String) => XTextContent): Self = StObject.set(x, "insertNewBookmark", js.Any.fromFunction2(value))
  }
}
