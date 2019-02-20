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

