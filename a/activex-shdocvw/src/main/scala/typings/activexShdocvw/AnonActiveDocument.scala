package typings.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActiveDocument extends js.Object {
  val ActiveDocument: Boolean
  var Cancel: Boolean
}

object AnonActiveDocument {
  @scala.inline
  def apply(ActiveDocument: Boolean, Cancel: Boolean): AnonActiveDocument = {
    val __obj = js.Dynamic.literal(ActiveDocument = ActiveDocument.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActiveDocument]
  }
}

