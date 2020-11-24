package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * offers an easy way to insert bookmarks by name.
  * @see Text
  */
@js.native
trait XBookmarkInsertTool extends XInterface {
  
  /** inserts a bookmark at the specified text position. */
  def insertNewBookmark(xTextRange: XTextRange, aName: String): XTextContent = js.native
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
  implicit class XBookmarkInsertToolOps[Self <: XBookmarkInsertTool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInsertNewBookmark(value: (XTextRange, String) => XTextContent): Self = this.set("insertNewBookmark", js.Any.fromFunction2(value))
  }
}
