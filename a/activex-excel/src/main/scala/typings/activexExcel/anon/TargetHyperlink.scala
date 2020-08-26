package typings.activexExcel.anon

import typings.activexExcel.Excel.Hyperlink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetHyperlink extends js.Object {
  val Target: Hyperlink = js.native
}

object TargetHyperlink {
  @scala.inline
  def apply(Target: Hyperlink): TargetHyperlink = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetHyperlink]
  }
  @scala.inline
  implicit class TargetHyperlinkOps[Self <: TargetHyperlink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTarget(value: Hyperlink): Self = this.set("Target", value.asInstanceOf[js.Any])
  }
  
}

