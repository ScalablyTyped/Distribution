package typings.antvDataSet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Edges extends js.Object {
  
  var edges: js.Array[_] = js.native
  
  var nodes: js.Array[_] = js.native
}
object Edges {
  
  @scala.inline
  def apply(edges: js.Array[_], nodes: js.Array[_]): Edges = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edges]
  }
  
  @scala.inline
  implicit class EdgesOps[Self <: Edges] (val x: Self) extends AnyVal {
    
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
    def setEdgesVarargs(value: js.Any*): Self = this.set("edges", js.Array(value :_*))
    
    @scala.inline
    def setEdges(value: js.Array[_]): Self = this.set("edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: js.Any*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[_]): Self = this.set("nodes", value.asInstanceOf[js.Any])
  }
}
