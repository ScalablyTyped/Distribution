package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to move paragraph by paragraph. */
trait XParagraphCursor extends XTextCursor {
  /**
    * moves the cursor to the end of the current paragraph.
    * @returns `TRUE` if the cursor is now at the end of a paragraph, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoEndOfParagraph(bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the next paragraph.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoNextParagraph(bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the previous paragraph.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoPreviousParagraph(bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the start of the current paragraph.
    * @returns `TRUE` if the cursor is now at the start of a paragraph, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoStartOfParagraph(bExpand: scala.Boolean): scala.Boolean
  /** determines if the cursor is positioned at the end of a paragraph. */
  def isEndOfParagraph(): scala.Boolean
  /** determines if the cursor is positioned at the start of a paragraph. */
  def isStartOfParagraph(): scala.Boolean
}

object XParagraphCursor {
  @scala.inline
  def apply(
    End: XTextRange,
    Start: XTextRange,
    String: java.lang.String,
    acquire: js.Function0[scala.Unit],
    collapseToEnd: js.Function0[scala.Unit],
    collapseToStart: js.Function0[scala.Unit],
    getEnd: js.Function0[XTextRange],
    getStart: js.Function0[XTextRange],
    getString: js.Function0[java.lang.String],
    getText: js.Function0[XText],
    goLeft: js.Function2[scala.Double, scala.Boolean, scala.Boolean],
    goRight: js.Function2[scala.Double, scala.Boolean, scala.Boolean],
    gotoEnd: js.Function1[scala.Boolean, scala.Unit],
    gotoEndOfParagraph: js.Function1[scala.Boolean, scala.Boolean],
    gotoNextParagraph: js.Function1[scala.Boolean, scala.Boolean],
    gotoPreviousParagraph: js.Function1[scala.Boolean, scala.Boolean],
    gotoRange: js.Function2[XTextRange, scala.Boolean, scala.Unit],
    gotoStart: js.Function1[scala.Boolean, scala.Unit],
    gotoStartOfParagraph: js.Function1[scala.Boolean, scala.Boolean],
    isCollapsed: js.Function0[scala.Boolean],
    isEndOfParagraph: js.Function0[scala.Boolean],
    isStartOfParagraph: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setString: js.Function1[java.lang.String, scala.Unit]
  ): XParagraphCursor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("End")(End)
    __obj.updateDynamic("Start")(Start)
    __obj.updateDynamic("String")(String)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("collapseToEnd")(collapseToEnd)
    __obj.updateDynamic("collapseToStart")(collapseToStart)
    __obj.updateDynamic("getEnd")(getEnd)
    __obj.updateDynamic("getStart")(getStart)
    __obj.updateDynamic("getString")(getString)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("goLeft")(goLeft)
    __obj.updateDynamic("goRight")(goRight)
    __obj.updateDynamic("gotoEnd")(gotoEnd)
    __obj.updateDynamic("gotoEndOfParagraph")(gotoEndOfParagraph)
    __obj.updateDynamic("gotoNextParagraph")(gotoNextParagraph)
    __obj.updateDynamic("gotoPreviousParagraph")(gotoPreviousParagraph)
    __obj.updateDynamic("gotoRange")(gotoRange)
    __obj.updateDynamic("gotoStart")(gotoStart)
    __obj.updateDynamic("gotoStartOfParagraph")(gotoStartOfParagraph)
    __obj.updateDynamic("isCollapsed")(isCollapsed)
    __obj.updateDynamic("isEndOfParagraph")(isEndOfParagraph)
    __obj.updateDynamic("isStartOfParagraph")(isStartOfParagraph)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setString")(setString)
    __obj.asInstanceOf[XParagraphCursor]
  }
}

