package typings.activexMsforms

import typings.activexMsforms.MSForms.ReturnBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelIndex extends js.Object {
  val Cancel: ReturnBoolean
  val Index: Double
}

object AnonCancelIndex {
  @scala.inline
  def apply(Cancel: ReturnBoolean, Index: Double): AnonCancelIndex = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancelIndex]
  }
}

