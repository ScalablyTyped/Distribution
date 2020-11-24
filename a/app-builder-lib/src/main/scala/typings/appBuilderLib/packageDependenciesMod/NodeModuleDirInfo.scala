package typings.appBuilderLib.packageDependenciesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeModuleDirInfo extends js.Object {
  
  val deps: js.Array[NodeModuleInfo] = js.native
  
  val dir: String = js.native
}
object NodeModuleDirInfo {
  
  @scala.inline
  def apply(deps: js.Array[NodeModuleInfo], dir: String): NodeModuleDirInfo = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeModuleDirInfo]
  }
  
  @scala.inline
  implicit class NodeModuleDirInfoOps[Self <: NodeModuleDirInfo] (val x: Self) extends AnyVal {
    
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
    def setDepsVarargs(value: NodeModuleInfo*): Self = this.set("deps", js.Array(value :_*))
    
    @scala.inline
    def setDeps(value: js.Array[NodeModuleInfo]): Self = this.set("deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
  }
}
