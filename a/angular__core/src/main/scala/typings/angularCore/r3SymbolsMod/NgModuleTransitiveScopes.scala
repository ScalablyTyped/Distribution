package typings.angularCore.r3SymbolsMod

import typings.angularCore.anon.Directives
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the expansion of an `NgModule` into its scopes.
  *
  * A scope is a set of directives and pipes that are visible in a particular context. Each
  * `NgModule` has two scopes. The `compilation` scope is the set of directives and pipes that will
  * be recognized in the templates of components declared by the module. The `exported` scope is the
  * set of directives and pipes exported by a module (that is, module B's exported scope gets added
  * to module A's compilation scope when module A imports B).
  */
@js.native
trait NgModuleTransitiveScopes extends js.Object {
  
  var compilation: Directives = js.native
  
  var exported: Directives = js.native
  
  var schemas: js.Array[SchemaMetadata] | Null = js.native
}
object NgModuleTransitiveScopes {
  
  @scala.inline
  def apply(compilation: Directives, exported: Directives): NgModuleTransitiveScopes = {
    val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgModuleTransitiveScopes]
  }
  
  @scala.inline
  implicit class NgModuleTransitiveScopesOps[Self <: NgModuleTransitiveScopes] (val x: Self) extends AnyVal {
    
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
    def setCompilation(value: Directives): Self = this.set("compilation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExported(value: Directives): Self = this.set("exported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasVarargs(value: SchemaMetadata*): Self = this.set("schemas", js.Array(value :_*))
    
    @scala.inline
    def setSchemas(value: js.Array[SchemaMetadata]): Self = this.set("schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasNull: Self = this.set("schemas", null)
  }
}
