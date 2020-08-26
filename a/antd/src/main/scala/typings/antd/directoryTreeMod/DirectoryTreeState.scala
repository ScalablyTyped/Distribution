package typings.antd.directoryTreeMod

import typings.rcTree.interfaceMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryTreeState extends js.Object {
  var expandedKeys: js.UndefOr[js.Array[Key]] = js.native
  var selectedKeys: js.UndefOr[js.Array[Key]] = js.native
}

object DirectoryTreeState {
  @scala.inline
  def apply(): DirectoryTreeState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryTreeState]
  }
  @scala.inline
  implicit class DirectoryTreeStateOps[Self <: DirectoryTreeState] (val x: Self) extends AnyVal {
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
    def setExpandedKeysVarargs(value: Key*): Self = this.set("expandedKeys", js.Array(value :_*))
    @scala.inline
    def setExpandedKeys(value: js.Array[Key]): Self = this.set("expandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandedKeys: Self = this.set("expandedKeys", js.undefined)
    @scala.inline
    def setSelectedKeysVarargs(value: Key*): Self = this.set("selectedKeys", js.Array(value :_*))
    @scala.inline
    def setSelectedKeys(value: js.Array[Key]): Self = this.set("selectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedKeys: Self = this.set("selectedKeys", js.undefined)
  }
  
}

