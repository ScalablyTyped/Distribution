package typings.antvDataSet.graphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var edges: js.UndefOr[js.Function1[/* data */ js.Any, js.Array[_]]] = js.native
  
  var nodes: js.UndefOr[js.Function1[/* data */ js.Any, js.Array[_]]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setEdges(value: /* data */ js.Any => js.Array[_]): Self = this.set("edges", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEdges: Self = this.set("edges", js.undefined)
    
    @scala.inline
    def setNodes(value: /* data */ js.Any => js.Array[_]): Self = this.set("nodes", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
  }
}
