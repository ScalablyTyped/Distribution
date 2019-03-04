package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to a message box. */
trait XMessageBox extends js.Object {
  /** the caption text. */
  var CaptionText: java.lang.String
  /** the message text. */
  var MessageText: java.lang.String
  /**
    * shows the message box.
    * @returns one of {@link MessageBoxResults} .
    */
  def execute(): scala.Double
}

object XMessageBox {
  @scala.inline
  def apply(CaptionText: java.lang.String, MessageText: java.lang.String, execute: js.Function0[scala.Double]): XMessageBox = {
    val __obj = js.Dynamic.literal(CaptionText = CaptionText, MessageText = MessageText, execute = execute)
  
    __obj.asInstanceOf[XMessageBox]
  }
}

