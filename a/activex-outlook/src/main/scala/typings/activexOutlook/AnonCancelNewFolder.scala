package typings.activexOutlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelNewFolder extends js.Object {
  var Cancel: Boolean
  val NewFolder: js.Any
}

object AnonCancelNewFolder {
  @scala.inline
  def apply(Cancel: Boolean, NewFolder: js.Any): AnonCancelNewFolder = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], NewFolder = NewFolder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancelNewFolder]
  }
}

