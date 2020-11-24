package typings.androiduix.android.widget.RelativeLayout.DependencyGraph

import typings.androiduix.android.util.ArrayMap
import typings.androiduix.android.util.SparseMap
import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node extends js.Object {
  
  var dependencies: SparseMap[String, Node] = js.native
  
  var dependents: ArrayMap[Node, typings.androiduix.android.widget.RelativeLayout.DependencyGraph] = js.native
  
  def release(): Unit = js.native
  
  var view: View = js.native
}
object Node {
  
  @scala.inline
  def apply(
    dependencies: SparseMap[String, Node],
    dependents: ArrayMap[Node, typings.androiduix.android.widget.RelativeLayout.DependencyGraph],
    release: () => Unit,
    view: View
  ): Node = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], dependents = dependents.asInstanceOf[js.Any], release = js.Any.fromFunction0(release), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    
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
    def setDependencies(value: SparseMap[String, Node]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependents(value: ArrayMap[Node, typings.androiduix.android.widget.RelativeLayout.DependencyGraph]): Self = this.set("dependents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease(value: () => Unit): Self = this.set("release", js.Any.fromFunction0(value))
    
    @scala.inline
    def setView(value: View): Self = this.set("view", value.asInstanceOf[js.Any])
  }
}
