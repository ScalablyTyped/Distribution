package typings.activexMsforms.anon

import typings.activexMsforms.MSForms.ReturnBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelIndex extends js.Object {
  val Cancel: ReturnBoolean
  val Index: Double
}

object CancelIndex {
  @scala.inline
  def apply(Cancel: ReturnBoolean, Index: Double): CancelIndex = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelIndex]
  }
}

