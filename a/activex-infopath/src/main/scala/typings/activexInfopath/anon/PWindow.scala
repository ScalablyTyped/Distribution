package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.Window
import typings.activexInfopath.InfoPath._XDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PWindow extends js.Object {
  val pDocument: _XDocument
  val pWindow: Window
}

object PWindow {
  @scala.inline
  def apply(pDocument: _XDocument, pWindow: Window): PWindow = {
    val __obj = js.Dynamic.literal(pDocument = pDocument.asInstanceOf[js.Any], pWindow = pWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PWindow]
  }
}

