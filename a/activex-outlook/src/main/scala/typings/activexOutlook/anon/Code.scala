package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Code extends js.Object {
  val Code: Double = js.native
  val Description: String = js.native
}

object Code {
  @scala.inline
  def apply(Code: Double, Description: String): Code = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  @scala.inline
  implicit class CodeOps[Self <: Code] (val x: Self) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("Code", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
  }
  
}

