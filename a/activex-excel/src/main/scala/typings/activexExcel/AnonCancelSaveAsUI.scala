package typings.activexExcel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelSaveAsUI extends js.Object {
  var Cancel: Boolean
  val SaveAsUI: Boolean
}

object AnonCancelSaveAsUI {
  @scala.inline
  def apply(Cancel: Boolean, SaveAsUI: Boolean): AnonCancelSaveAsUI = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], SaveAsUI = SaveAsUI.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancelSaveAsUI]
  }
}

