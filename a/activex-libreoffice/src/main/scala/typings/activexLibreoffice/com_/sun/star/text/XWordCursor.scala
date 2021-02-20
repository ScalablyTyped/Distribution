package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to move a cursor word by word. */
@js.native
trait XWordCursor extends XTextCursor {
  
  /**
    * moves the cursor to the end of the current word.
    * @returns `TRUE` if the cursor is now at the end of a word, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoEndOfWord(bExpand: Boolean): Boolean = js.native
  
  /**
    * moves the cursor to the next word.
    *
    * Note: the function returning `TRUE` does not necessarily mean that the cursor is located at the next word, or any word at all! This may happen for
    * example if it travels over empty paragraphs.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoNextWord(bExpand: Boolean): Boolean = js.native
  
  /**
    * moves the cursor to the previous word.
    *
    * Note: the function returning `TRUE` does not necessarily mean that the cursor is located at the previous word, or any word at all! This may happen for
    * example if it travels over empty paragraphs.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoPreviousWord(bExpand: Boolean): Boolean = js.native
  
  /**
    * moves the cursor to the start of the current word.
    * @returns `TRUE` if the cursor is now at the start of a word, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoStartOfWord(bExpand: Boolean): Boolean = js.native
  
  /** determines if the cursor is positioned at the end of a word. */
  def isEndOfWord(): Boolean = js.native
  
  /** determines if the cursor is positioned at the start of a word. */
  def isStartOfWord(): Boolean = js.native
}
object XWordCursor {
  
  @scala.inline
  def apply(
    End: XTextRange,
    Start: XTextRange,
    String: String,
    acquire: () => Unit,
    collapseToEnd: () => Unit,
    collapseToStart: () => Unit,
    getEnd: () => XTextRange,
    getStart: () => XTextRange,
    getString: () => String,
    getText: () => XText,
    goLeft: (Double, Boolean) => Boolean,
    goRight: (Double, Boolean) => Boolean,
    gotoEnd: Boolean => Unit,
    gotoEndOfWord: Boolean => Boolean,
    gotoNextWord: Boolean => Boolean,
    gotoPreviousWord: Boolean => Boolean,
    gotoRange: (XTextRange, Boolean) => Unit,
    gotoStart: Boolean => Unit,
    gotoStartOfWord: Boolean => Boolean,
    isCollapsed: () => Boolean,
    isEndOfWord: () => Boolean,
    isStartOfWord: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setString: String => Unit
  ): XWordCursor = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), collapseToEnd = js.Any.fromFunction0(collapseToEnd), collapseToStart = js.Any.fromFunction0(collapseToStart), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), goLeft = js.Any.fromFunction2(goLeft), goRight = js.Any.fromFunction2(goRight), gotoEnd = js.Any.fromFunction1(gotoEnd), gotoEndOfWord = js.Any.fromFunction1(gotoEndOfWord), gotoNextWord = js.Any.fromFunction1(gotoNextWord), gotoPreviousWord = js.Any.fromFunction1(gotoPreviousWord), gotoRange = js.Any.fromFunction2(gotoRange), gotoStart = js.Any.fromFunction1(gotoStart), gotoStartOfWord = js.Any.fromFunction1(gotoStartOfWord), isCollapsed = js.Any.fromFunction0(isCollapsed), isEndOfWord = js.Any.fromFunction0(isEndOfWord), isStartOfWord = js.Any.fromFunction0(isStartOfWord), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[XWordCursor]
  }
  
  @scala.inline
  implicit class XWordCursorMutableBuilder[Self <: XWordCursor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGotoEndOfWord(value: Boolean => Boolean): Self = StObject.set(x, "gotoEndOfWord", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGotoNextWord(value: Boolean => Boolean): Self = StObject.set(x, "gotoNextWord", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGotoPreviousWord(value: Boolean => Boolean): Self = StObject.set(x, "gotoPreviousWord", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGotoStartOfWord(value: Boolean => Boolean): Self = StObject.set(x, "gotoStartOfWord", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEndOfWord(value: () => Boolean): Self = StObject.set(x, "isEndOfWord", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsStartOfWord(value: () => Boolean): Self = StObject.set(x, "isStartOfWord", js.Any.fromFunction0(value))
  }
}
