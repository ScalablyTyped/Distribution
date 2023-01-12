package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** extends a {@link XSimpleText} by the capability of inserting XTextContents. */
trait XText
  extends StObject
     with XSimpleText {
  
  /**
    * inserts a content, such as a text table, text frame or text field.
    *
    * Which contents are accepted is implementation-specific. Some implementations may only accept contents which were created by the factory that supplied
    * the same text or the document which contains the text.
    * @param xRange specifies the position of insertion.
    * @param xContent the text content to be inserted.
    * @param bAbsorb specifies whether the text spanned by **xRange** will be replaced. If `TRUE` then the content of **xRange** will be replaced by **xConten
    */
  def insertTextContent(xRange: XTextRange, xContent: XTextContent, bAbsorb: Boolean): Unit
  
  /**
    * removes the specified content from the text object.
    * @param xContent the content that is to be removed.
    */
  def removeTextContent(xContent: XTextContent): Unit
}
object XText {
  
  inline def apply(
    End: XTextRange,
    Start: XTextRange,
    String: String,
    acquire: () => Unit,
    createTextCursor: () => XTextCursor,
    createTextCursorByRange: XTextRange => XTextCursor,
    getEnd: () => XTextRange,
    getStart: () => XTextRange,
    getString: () => String,
    getText: () => XText,
    insertControlCharacter: (XTextRange, Double, Boolean) => Unit,
    insertString: (XTextRange, String, Boolean) => Unit,
    insertTextContent: (XTextRange, XTextContent, Boolean) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeTextContent: XTextContent => Unit,
    setString: String => Unit
  ): XText = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), insertTextContent = js.Any.fromFunction3(insertTextContent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTextContent = js.Any.fromFunction1(removeTextContent), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[XText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XText] (val x: Self) extends AnyVal {
    
    inline def setInsertTextContent(value: (XTextRange, XTextContent, Boolean) => Unit): Self = StObject.set(x, "insertTextContent", js.Any.fromFunction3(value))
    
    inline def setRemoveTextContent(value: XTextContent => Unit): Self = StObject.set(x, "removeTextContent", js.Any.fromFunction1(value))
  }
}
