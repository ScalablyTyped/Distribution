package typings.apidoc.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var data: Record[String, _] = js.native
  var project: Record[String, _] = js.native
}

object Data {
  @scala.inline
  def apply(data: Record[String, _], project: Record[String, _]): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
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
    def setData(value: Record[String, _]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject(value: Record[String, _]): Self = this.set("project", value.asInstanceOf[js.Any])
  }
  
}

