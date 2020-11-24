package typings.antd.directoryTreeMod

import typings.antd.treeTreeMod.TreeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectoryTreeProps extends TreeProps {
  
  var expandAction: js.UndefOr[ExpandAction] = js.native
}
object DirectoryTreeProps {
  
  @scala.inline
  def apply(): DirectoryTreeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryTreeProps]
  }
  
  @scala.inline
  implicit class DirectoryTreePropsOps[Self <: DirectoryTreeProps] (val x: Self) extends AnyVal {
    
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
    def setExpandAction(value: ExpandAction): Self = this.set("expandAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandAction: Self = this.set("expandAction", js.undefined)
  }
}
