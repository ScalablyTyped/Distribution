package typings.arangodb.arangodbGeneralGraphMod

import typings.arangodb.ArangoDB.Edge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShortestPath[T /* <: js.Object */] extends js.Object {
  
  var distance: Double = js.native
  
  var edges: js.Array[Edge[T]] = js.native
  
  var vertices: js.Array[String] = js.native
}
object ShortestPath {
  
  @scala.inline
  def apply[T /* <: js.Object */](distance: Double, edges: js.Array[Edge[T]], vertices: js.Array[String]): ShortestPath[T] = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortestPath[T]]
  }
  
  @scala.inline
  implicit class ShortestPathOps[Self <: ShortestPath[_], T /* <: js.Object */] (val x: Self with ShortestPath[T]) extends AnyVal {
    
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
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesVarargs(value: Edge[T]*): Self = this.set("edges", js.Array(value :_*))
    
    @scala.inline
    def setEdges(value: js.Array[Edge[T]]): Self = this.set("edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesVarargs(value: String*): Self = this.set("vertices", js.Array(value :_*))
    
    @scala.inline
    def setVertices(value: js.Array[String]): Self = this.set("vertices", value.asInstanceOf[js.Any])
  }
}
