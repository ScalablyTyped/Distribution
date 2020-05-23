package typings.activexExcel.anon

import typings.activexExcel.Excel.Hyperlink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetHyperlink extends js.Object {
  val Target: Hyperlink
}

object TargetHyperlink {
  @scala.inline
  def apply(Target: Hyperlink): TargetHyperlink = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetHyperlink]
  }
}

