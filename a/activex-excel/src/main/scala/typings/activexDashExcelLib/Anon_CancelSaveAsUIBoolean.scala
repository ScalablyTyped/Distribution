package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelSaveAsUIBoolean extends js.Object {
  var Cancel: scala.Boolean
  val SaveAsUI: scala.Boolean
}

object Anon_CancelSaveAsUIBoolean {
  @scala.inline
  def apply(Cancel: scala.Boolean, SaveAsUI: scala.Boolean): Anon_CancelSaveAsUIBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Cancel")(Cancel)
    __obj.updateDynamic("SaveAsUI")(SaveAsUI)
    __obj.asInstanceOf[Anon_CancelSaveAsUIBoolean]
  }
}

