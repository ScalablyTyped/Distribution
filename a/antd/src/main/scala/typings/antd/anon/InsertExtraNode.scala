package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertExtraNode extends js.Object {
  
  var insertExtraNode: js.UndefOr[Boolean] = js.native
}
object InsertExtraNode {
  
  @scala.inline
  def apply(): InsertExtraNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertExtraNode]
  }
  
  @scala.inline
  implicit class InsertExtraNodeOps[Self <: InsertExtraNode] (val x: Self) extends AnyVal {
    
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
    def setInsertExtraNode(value: Boolean): Self = this.set("insertExtraNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertExtraNode: Self = this.set("insertExtraNode", js.undefined)
  }
}
