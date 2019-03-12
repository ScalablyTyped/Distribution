package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes a cursor in a text document's view. */
trait XTextViewCursor extends XTextCursor {
  /** @returns the cursor's coordinates relative to the top left position of the first page of the document. */
  val Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /** @returns the cursor's coordinates relative to the top left position of the first page of the document. */
  def getPosition(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /** @returns `TRUE` if this cursor is visible for the user. */
  def isVisible(): scala.Boolean
  /** shows or hides this cursor for the user. */
  def setVisible(bVisible: scala.Boolean): scala.Unit
}

object XTextViewCursor {
  @scala.inline
  def apply(
    End: XTextRange,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    Start: XTextRange,
    String: java.lang.String,
    acquire: () => scala.Unit,
    collapseToEnd: () => scala.Unit,
    collapseToStart: () => scala.Unit,
    getEnd: () => XTextRange,
    getPosition: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    getStart: () => XTextRange,
    getString: () => java.lang.String,
    getText: () => XText,
    goLeft: (scala.Double, scala.Boolean) => scala.Boolean,
    goRight: (scala.Double, scala.Boolean) => scala.Boolean,
    gotoEnd: scala.Boolean => scala.Unit,
    gotoRange: (XTextRange, scala.Boolean) => scala.Unit,
    gotoStart: scala.Boolean => scala.Unit,
    isCollapsed: () => scala.Boolean,
    isVisible: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setString: java.lang.String => scala.Unit,
    setVisible: scala.Boolean => scala.Unit
  ): XTextViewCursor = {
    val __obj = js.Dynamic.literal(End = End, Position = Position, Start = Start, String = String, acquire = js.Any.fromFunction0(acquire), collapseToEnd = js.Any.fromFunction0(collapseToEnd), collapseToStart = js.Any.fromFunction0(collapseToStart), getEnd = js.Any.fromFunction0(getEnd), getPosition = js.Any.fromFunction0(getPosition), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), goLeft = js.Any.fromFunction2(goLeft), goRight = js.Any.fromFunction2(goRight), gotoEnd = js.Any.fromFunction1(gotoEnd), gotoRange = js.Any.fromFunction2(gotoRange), gotoStart = js.Any.fromFunction1(gotoStart), isCollapsed = js.Any.fromFunction0(isCollapsed), isVisible = js.Any.fromFunction0(isVisible), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setString = js.Any.fromFunction1(setString), setVisible = js.Any.fromFunction1(setVisible))
  
    __obj.asInstanceOf[XTextViewCursor]
  }
}

