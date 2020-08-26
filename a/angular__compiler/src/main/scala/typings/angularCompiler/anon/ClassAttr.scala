package typings.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassAttr extends js.Object {
  var classAttr: js.UndefOr[String] = js.native
  var styleAttr: js.UndefOr[String] = js.native
}

object ClassAttr {
  @scala.inline
  def apply(): ClassAttr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassAttr]
  }
  @scala.inline
  implicit class ClassAttrOps[Self <: ClassAttr] (val x: Self) extends AnyVal {
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
    def setClassAttr(value: String): Self = this.set("classAttr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassAttr: Self = this.set("classAttr", js.undefined)
    @scala.inline
    def setStyleAttr(value: String): Self = this.set("styleAttr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleAttr: Self = this.set("styleAttr", js.undefined)
  }
  
}

