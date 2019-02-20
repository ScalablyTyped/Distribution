package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * supplies access to the cursor in the view.
  *
  * This cursor is the same instance that is available in the user interface.
  * @see TextDocumentView
  */
trait XTextViewCursorSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the cursor of the document view. */
  val ViewCursor: XTextViewCursor
  /** @returns the cursor of the document view. */
  def getViewCursor(): XTextViewCursor
}

