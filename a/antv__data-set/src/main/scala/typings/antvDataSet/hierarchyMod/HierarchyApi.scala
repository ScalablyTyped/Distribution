package typings.antvDataSet.hierarchyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HierarchyApi extends js.Object {
  
  def getAllEdges(): js.Array[_] = js.native
  
  def getAllLinks(): js.Array[_] = js.native
  
  def getAllNodes(): js.Array[_] = js.native
  
  var root: js.UndefOr[js.Any] = js.native
}
object HierarchyApi {
  
  @scala.inline
  def apply(getAllEdges: () => js.Array[_], getAllLinks: () => js.Array[_], getAllNodes: () => js.Array[_]): HierarchyApi = {
    val __obj = js.Dynamic.literal(getAllEdges = js.Any.fromFunction0(getAllEdges), getAllLinks = js.Any.fromFunction0(getAllLinks), getAllNodes = js.Any.fromFunction0(getAllNodes))
    __obj.asInstanceOf[HierarchyApi]
  }
  
  @scala.inline
  implicit class HierarchyApiOps[Self <: HierarchyApi] (val x: Self) extends AnyVal {
    
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
    def setGetAllEdges(value: () => js.Array[_]): Self = this.set("getAllEdges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAllLinks(value: () => js.Array[_]): Self = this.set("getAllLinks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAllNodes(value: () => js.Array[_]): Self = this.set("getAllNodes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRoot(value: js.Any): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
