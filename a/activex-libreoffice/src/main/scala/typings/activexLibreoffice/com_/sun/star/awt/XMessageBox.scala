package typings.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to a message box. */
trait XMessageBox extends js.Object {
  /** the caption text. */
  var CaptionText: String
  /** the message text. */
  var MessageText: String
  /**
    * shows the message box.
    * @returns one of {@link MessageBoxResults} .
    */
  def execute(): Double
}

object XMessageBox {
  @scala.inline
  def apply(CaptionText: String, MessageText: String, execute: () => Double): XMessageBox = {
    val __obj = js.Dynamic.literal(CaptionText = CaptionText.asInstanceOf[js.Any], MessageText = MessageText.asInstanceOf[js.Any], execute = js.Any.fromFunction0(execute))
    __obj.asInstanceOf[XMessageBox]
  }
}

