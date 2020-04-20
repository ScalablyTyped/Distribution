package typings.activexInfopath

import typings.activexInfopath.InfoPath.Window
import typings.activexInfopath.InfoPath._XDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPWindow extends js.Object {
  val pDocument: _XDocument
  val pWindow: Window
}

object AnonPWindow {
  @scala.inline
  def apply(pDocument: _XDocument, pWindow: Window): AnonPWindow = {
    val __obj = js.Dynamic.literal(pDocument = pDocument.asInstanceOf[js.Any], pWindow = pWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPWindow]
  }
}

