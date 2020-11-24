package typings.angularCompiler.compilerFacadeInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait R3PipeMetadataFacade extends js.Object {
  
  var deps: js.Array[R3DependencyMetadataFacade] | Null = js.native
  
  var name: String = js.native
  
  var pipeName: String = js.native
  
  var pure: Boolean = js.native
  
  var `type`: js.Any = js.native
  
  var typeArgumentCount: Double = js.native
}
object R3PipeMetadataFacade {
  
  @scala.inline
  def apply(name: String, pipeName: String, pure: Boolean, `type`: js.Any, typeArgumentCount: Double): R3PipeMetadataFacade = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pipeName = pipeName.asInstanceOf[js.Any], pure = pure.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3PipeMetadataFacade]
  }
  
  @scala.inline
  implicit class R3PipeMetadataFacadeOps[Self <: R3PipeMetadataFacade] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipeName(value: String): Self = this.set("pipeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPure(value: Boolean): Self = this.set("pure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeArgumentCount(value: Double): Self = this.set("typeArgumentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepsVarargs(value: R3DependencyMetadataFacade*): Self = this.set("deps", js.Array(value :_*))
    
    @scala.inline
    def setDeps(value: js.Array[R3DependencyMetadataFacade]): Self = this.set("deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepsNull: Self = this.set("deps", null)
  }
}
