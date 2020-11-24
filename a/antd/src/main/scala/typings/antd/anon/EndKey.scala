package typings.antd.anon

import typings.rcTree.interfaceMod.DataNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndKey extends js.Object {
  
  var endKey: js.UndefOr[typings.rcTree.interfaceMod.Key] = js.native
  
  var expandedKeys: js.Array[typings.rcTree.interfaceMod.Key] = js.native
  
  var startKey: js.UndefOr[typings.rcTree.interfaceMod.Key] = js.native
  
  var treeData: js.Array[DataNode] = js.native
}
object EndKey {
  
  @scala.inline
  def apply(expandedKeys: js.Array[typings.rcTree.interfaceMod.Key], treeData: js.Array[DataNode]): EndKey = {
    val __obj = js.Dynamic.literal(expandedKeys = expandedKeys.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndKey]
  }
  
  @scala.inline
  implicit class EndKeyOps[Self <: EndKey] (val x: Self) extends AnyVal {
    
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
    def setExpandedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = this.set("expandedKeys", js.Array(value :_*))
    
    @scala.inline
    def setExpandedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = this.set("expandedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeDataVarargs(value: DataNode*): Self = this.set("treeData", js.Array(value :_*))
    
    @scala.inline
    def setTreeData(value: js.Array[DataNode]): Self = this.set("treeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndKey(value: typings.rcTree.interfaceMod.Key): Self = this.set("endKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndKey: Self = this.set("endKey", js.undefined)
    
    @scala.inline
    def setStartKey(value: typings.rcTree.interfaceMod.Key): Self = this.set("startKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartKey: Self = this.set("startKey", js.undefined)
  }
}
