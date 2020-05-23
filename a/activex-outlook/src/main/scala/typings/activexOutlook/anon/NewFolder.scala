package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewFolder extends js.Object {
  var Cancel: Boolean
  val NewFolder: js.Any
}

object NewFolder {
  @scala.inline
  def apply(Cancel: Boolean, NewFolder: js.Any): NewFolder = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], NewFolder = NewFolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewFolder]
  }
}

