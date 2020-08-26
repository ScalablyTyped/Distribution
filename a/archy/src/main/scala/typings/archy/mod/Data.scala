package typings.archy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var label: String = js.native
  var nodes: js.UndefOr[js.Array[Data | String]] = js.native
}

object Data {
  @scala.inline
  def apply(label: String): Data = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodesVarargs(value: (Data | String)*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[Data | String]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
  }
  
}

