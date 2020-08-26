package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to move paragraph by paragraph. */
@js.native
trait XParagraphCursor extends XTextCursor {
  /**
    * moves the cursor to the end of the current paragraph.
    * @returns `TRUE` if the cursor is now at the end of a paragraph, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoEndOfParagraph(bExpand: Boolean): Boolean = js.native
  /**
    * moves the cursor to the next paragraph.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoNextParagraph(bExpand: Boolean): Boolean = js.native
  /**
    * moves the cursor to the previous paragraph.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoPreviousParagraph(bExpand: Boolean): Boolean = js.native
  /**
    * moves the cursor to the start of the current paragraph.
    * @returns `TRUE` if the cursor is now at the start of a paragraph, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoStartOfParagraph(bExpand: Boolean): Boolean = js.native
  /** determines if the cursor is positioned at the end of a paragraph. */
  def isEndOfParagraph(): Boolean = js.native
  /** determines if the cursor is positioned at the start of a paragraph. */
  def isStartOfParagraph(): Boolean = js.native
}

object XParagraphCursor {
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
    gotoEndOfParagraph: Boolean => Boolean,
    gotoNextParagraph: Boolean => Boolean,
    gotoPreviousParagraph: Boolean => Boolean,
    gotoRange: (XTextRange, Boolean) => Unit,
    gotoStart: Boolean => Unit,
    gotoStartOfParagraph: Boolean => Boolean,
    isCollapsed: () => Boolean,
    isEndOfParagraph: () => Boolean,
    isStartOfParagraph: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setString: String => Unit
  ): XParagraphCursor = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), collapseToEnd = js.Any.fromFunction0(collapseToEnd), collapseToStart = js.Any.fromFunction0(collapseToStart), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), goLeft = js.Any.fromFunction2(goLeft), goRight = js.Any.fromFunction2(goRight), gotoEnd = js.Any.fromFunction1(gotoEnd), gotoEndOfParagraph = js.Any.fromFunction1(gotoEndOfParagraph), gotoNextParagraph = js.Any.fromFunction1(gotoNextParagraph), gotoPreviousParagraph = js.Any.fromFunction1(gotoPreviousParagraph), gotoRange = js.Any.fromFunction2(gotoRange), gotoStart = js.Any.fromFunction1(gotoStart), gotoStartOfParagraph = js.Any.fromFunction1(gotoStartOfParagraph), isCollapsed = js.Any.fromFunction0(isCollapsed), isEndOfParagraph = js.Any.fromFunction0(isEndOfParagraph), isStartOfParagraph = js.Any.fromFunction0(isStartOfParagraph), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[XParagraphCursor]
  }
  @scala.inline
  implicit class XParagraphCursorOps[Self <: XParagraphCursor] (val x: Self) extends AnyVal {
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
    def setGotoEndOfParagraph(value: Boolean => Boolean): Self = this.set("gotoEndOfParagraph", js.Any.fromFunction1(value))
    @scala.inline
    def setGotoNextParagraph(value: Boolean => Boolean): Self = this.set("gotoNextParagraph", js.Any.fromFunction1(value))
    @scala.inline
    def setGotoPreviousParagraph(value: Boolean => Boolean): Self = this.set("gotoPreviousParagraph", js.Any.fromFunction1(value))
    @scala.inline
    def setGotoStartOfParagraph(value: Boolean => Boolean): Self = this.set("gotoStartOfParagraph", js.Any.fromFunction1(value))
    @scala.inline
    def setIsEndOfParagraph(value: () => Boolean): Self = this.set("isEndOfParagraph", js.Any.fromFunction0(value))
    @scala.inline
    def setIsStartOfParagraph(value: () => Boolean): Self = this.set("isStartOfParagraph", js.Any.fromFunction0(value))
  }
  
}

