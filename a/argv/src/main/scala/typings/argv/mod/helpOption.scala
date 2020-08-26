package typings.argv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait helpOption extends js.Object {
  var description: js.UndefOr[String] = js.native
  var example: js.UndefOr[String] = js.native
  var name: String = js.native
  var short: js.UndefOr[String] = js.native
  var `type`: String = js.native
}

object helpOption {
  @scala.inline
  def apply(name: String, `type`: String): helpOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[helpOption]
  }
  @scala.inline
  implicit class helpOptionOps[Self <: helpOption] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExample(value: String): Self = this.set("example", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExample: Self = this.set("example", js.undefined)
    @scala.inline
    def setShort(value: String): Self = this.set("short", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShort: Self = this.set("short", js.undefined)
  }
  
}

