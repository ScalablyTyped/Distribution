package typings.args.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Example extends js.Object {
  var description: String = js.native
  var usage: String = js.native
}

object Example {
  @scala.inline
  def apply(description: String, usage: String): Example = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Example]
  }
  @scala.inline
  implicit class ExampleOps[Self <: Example] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsage(value: String): Self = this.set("usage", value.asInstanceOf[js.Any])
  }
  
}

