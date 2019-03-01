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

object XTextViewCursorSupplier {
  @scala.inline
  def apply(
    ViewCursor: XTextViewCursor,
    acquire: js.Function0[scala.Unit],
    getViewCursor: js.Function0[XTextViewCursor],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTextViewCursorSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ViewCursor")(ViewCursor)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getViewCursor")(getViewCursor)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XTextViewCursorSupplier]
  }
}

