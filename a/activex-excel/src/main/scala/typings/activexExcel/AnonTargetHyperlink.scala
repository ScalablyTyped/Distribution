package typings.activexExcel

import typings.activexExcel.Excel.Hyperlink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTargetHyperlink extends js.Object {
  val Target: Hyperlink
}

object AnonTargetHyperlink {
  @scala.inline
  def apply(Target: Hyperlink): AnonTargetHyperlink = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTargetHyperlink]
  }
}

