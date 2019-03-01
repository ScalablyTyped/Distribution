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
    acquire: js.Function0[scala.Unit],
    collapseToEnd: js.Function0[scala.Unit],
    collapseToStart: js.Function0[scala.Unit],
    getEnd: js.Function0[XTextRange],
    getPosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getStart: js.Function0[XTextRange],
    getString: js.Function0[java.lang.String],
    getText: js.Function0[XText],
    goLeft: js.Function2[scala.Double, scala.Boolean, scala.Boolean],
    goRight: js.Function2[scala.Double, scala.Boolean, scala.Boolean],
    gotoEnd: js.Function1[scala.Boolean, scala.Unit],
    gotoRange: js.Function2[XTextRange, scala.Boolean, scala.Unit],
    gotoStart: js.Function1[scala.Boolean, scala.Unit],
    isCollapsed: js.Function0[scala.Boolean],
    isVisible: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setString: js.Function1[java.lang.String, scala.Unit],
    setVisible: js.Function1[scala.Boolean, scala.Unit]
  ): XTextViewCursor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("End")(End)
    __obj.updateDynamic("Position")(Position)
    __obj.updateDynamic("Start")(Start)
    __obj.updateDynamic("String")(String)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("collapseToEnd")(collapseToEnd)
    __obj.updateDynamic("collapseToStart")(collapseToStart)
    __obj.updateDynamic("getEnd")(getEnd)
    __obj.updateDynamic("getPosition")(getPosition)
    __obj.updateDynamic("getStart")(getStart)
    __obj.updateDynamic("getString")(getString)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("goLeft")(goLeft)
    __obj.updateDynamic("goRight")(goRight)
    __obj.updateDynamic("gotoEnd")(gotoEnd)
    __obj.updateDynamic("gotoRange")(gotoRange)
    __obj.updateDynamic("gotoStart")(gotoStart)
    __obj.updateDynamic("isCollapsed")(isCollapsed)
    __obj.updateDynamic("isVisible")(isVisible)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setString")(setString)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.asInstanceOf[XTextViewCursor]
  }
}

