package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tech extends js.Object {
  var tech: String = js.native
}

object Tech {
  @scala.inline
  def apply(tech: String): Tech = {
    val __obj = js.Dynamic.literal(tech = tech.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tech]
  }
  @scala.inline
  implicit class TechOps[Self <: Tech] (val x: Self) extends AnyVal {
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
    def setTech(value: String): Self = this.set("tech", value.asInstanceOf[js.Any])
  }
  
}

