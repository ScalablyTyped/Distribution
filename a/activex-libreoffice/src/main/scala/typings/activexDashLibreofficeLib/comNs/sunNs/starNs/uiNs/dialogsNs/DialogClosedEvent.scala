package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information of a closed dialog.
  *
  * The broadcaster who sends such event, must send the dialog as the source.
  * @see com.sun.star.lang.EventObject
  */
trait DialogClosedEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * @param DialogResult Identifies the result of a dialog.
    * @see ExecutableDialogResults
    */
  var DialogResult: scala.Double
}

