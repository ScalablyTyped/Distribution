package typings.angularCompiler.r3ModuleCompilerMod

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.r3FactoryMod.R3DependencyMetadata
import typings.angularCompiler.render3UtilMod.R3Reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait R3InjectorMetadata extends js.Object {
  
  var deps: js.Array[R3DependencyMetadata] | Null = js.native
  
  var imports: js.Array[Expression] = js.native
  
  var internalType: Expression = js.native
  
  var name: String = js.native
  
  var providers: Expression | Null = js.native
  
  var `type`: R3Reference = js.native
}
object R3InjectorMetadata {
  
  @scala.inline
  def apply(imports: js.Array[Expression], internalType: Expression, name: String, `type`: R3Reference): R3InjectorMetadata = {
    val __obj = js.Dynamic.literal(imports = imports.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3InjectorMetadata]
  }
  
  @scala.inline
  implicit class R3InjectorMetadataOps[Self <: R3InjectorMetadata] (val x: Self) extends AnyVal {
    
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
    def setImportsVarargs(value: Expression*): Self = this.set("imports", js.Array(value :_*))
    
    @scala.inline
    def setImports(value: js.Array[Expression]): Self = this.set("imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalType(value: Expression): Self = this.set("internalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: R3Reference): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepsVarargs(value: R3DependencyMetadata*): Self = this.set("deps", js.Array(value :_*))
    
    @scala.inline
    def setDeps(value: js.Array[R3DependencyMetadata]): Self = this.set("deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepsNull: Self = this.set("deps", null)
    
    @scala.inline
    def setProviders(value: Expression): Self = this.set("providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersNull: Self = this.set("providers", null)
  }
}
