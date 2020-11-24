package typings.arangodb.arangodbGeneralGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonNeighbors extends js.Object {
  
  var left: String = js.native
  
  var neighbors: js.Array[String] = js.native
  
  var right: String = js.native
}
object CommonNeighbors {
  
  @scala.inline
  def apply(left: String, neighbors: js.Array[String], right: String): CommonNeighbors = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], neighbors = neighbors.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonNeighbors]
  }
  
  @scala.inline
  implicit class CommonNeighborsOps[Self <: CommonNeighbors] (val x: Self) extends AnyVal {
    
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
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeighborsVarargs(value: String*): Self = this.set("neighbors", js.Array(value :_*))
    
    @scala.inline
    def setNeighbors(value: js.Array[String]): Self = this.set("neighbors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: String): Self = this.set("right", value.asInstanceOf[js.Any])
  }
}
