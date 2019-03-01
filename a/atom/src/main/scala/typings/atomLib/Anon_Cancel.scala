package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  var text: java.lang.String
  def cancel(): scala.Unit
}

object Anon_Cancel {
  @scala.inline
  def apply(cancel: js.Function0[scala.Unit], text: java.lang.String): Anon_Cancel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Cancel]
  }
}

