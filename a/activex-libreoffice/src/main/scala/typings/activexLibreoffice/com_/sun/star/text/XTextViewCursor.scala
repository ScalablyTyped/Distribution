package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes a cursor in a text document's view. */
@js.native
trait XTextViewCursor extends XTextCursor {
  /** @returns the cursor's coordinates relative to the top left position of the first page of the document. */
  val Position: Point = js.native
  /** @returns the cursor's coordinates relative to the top left position of the first page of the document. */
  def getPosition(): Point = js.native
  /** @returns `TRUE` if this cursor is visible for the user. */
  def isVisible(): Boolean = js.native
  /** shows or hides this cursor for the user. */
  def setVisible(bVisible: Boolean): Unit = js.native
}

object XTextViewCursor {
  @scala.inline
  def apply(
    End: XTextRange,
    Position: Point,
    Start: XTextRange,
    String: String,
    acquire: () => Unit,
    collapseToEnd: () => Unit,
    collapseToStart: () => Unit,
    getEnd: () => XTextRange,
    getPosition: () => Point,
    getStart: () => XTextRange,
    getString: () => String,
    getText: () => XText,
    goLeft: (Double, Boolean) => Boolean,
    goRight: (Double, Boolean) => Boolean,
    gotoEnd: Boolean => Unit,
    gotoRange: (XTextRange, Boolean) => Unit,
    gotoStart: Boolean => Unit,
    isCollapsed: () => Boolean,
    isVisible: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setString: String => Unit,
    setVisible: Boolean => Unit
  ): XTextViewCursor = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), collapseToEnd = js.Any.fromFunction0(collapseToEnd), collapseToStart = js.Any.fromFunction0(collapseToStart), getEnd = js.Any.fromFunction0(getEnd), getPosition = js.Any.fromFunction0(getPosition), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), goLeft = js.Any.fromFunction2(goLeft), goRight = js.Any.fromFunction2(goRight), gotoEnd = js.Any.fromFunction1(gotoEnd), gotoRange = js.Any.fromFunction2(gotoRange), gotoStart = js.Any.fromFunction1(gotoStart), isCollapsed = js.Any.fromFunction0(isCollapsed), isVisible = js.Any.fromFunction0(isVisible), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setString = js.Any.fromFunction1(setString), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[XTextViewCursor]
  }
  @scala.inline
  implicit class XTextViewCursorOps[Self <: XTextViewCursor] (val x: Self) extends AnyVal {
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
    def setPosition(value: Point): Self = this.set("Position", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetPosition(value: () => Point): Self = this.set("getPosition", js.Any.fromFunction0(value))
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = this.set("isVisible", js.Any.fromFunction0(value))
    @scala.inline
    def setSetVisible(value: Boolean => Unit): Self = this.set("setVisible", js.Any.fromFunction1(value))
  }
  
}

