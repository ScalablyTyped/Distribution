package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVirtualNodesOutput extends js.Object {
  
  /**
    * The nextToken value to include in a future ListVirtualNodes request. When the results of a ListVirtualNodes request exceed limit, you can use this value to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The list of existing virtual nodes for the specified service mesh.
    */
  var virtualNodes: VirtualNodeList = js.native
}
object ListVirtualNodesOutput {
  
  @scala.inline
  def apply(virtualNodes: VirtualNodeList): ListVirtualNodesOutput = {
    val __obj = js.Dynamic.literal(virtualNodes = virtualNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVirtualNodesOutput]
  }
  
  @scala.inline
  implicit class ListVirtualNodesOutputOps[Self <: ListVirtualNodesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVirtualNodesVarargs(value: VirtualNodeRef*): Self = this.set("virtualNodes", js.Array(value :_*))
    
    @scala.inline
    def setVirtualNodes(value: VirtualNodeList): Self = this.set("virtualNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
