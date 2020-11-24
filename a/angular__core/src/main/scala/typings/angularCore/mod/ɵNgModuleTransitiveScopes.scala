package typings.angularCore.mod

import typings.angularCore.anon.Directives
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ɵNgModuleTransitiveScopes extends js.Object {
  
  var compilation: Directives = js.native
  
  var exported: Directives = js.native
  
  var schemas: js.Array[SchemaMetadata] | Null = js.native
}
object ɵNgModuleTransitiveScopes {
  
  @scala.inline
  def apply(compilation: Directives, exported: Directives): ɵNgModuleTransitiveScopes = {
    val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵNgModuleTransitiveScopes]
  }
  
  @scala.inline
  implicit class ɵNgModuleTransitiveScopesOps[Self <: ɵNgModuleTransitiveScopes] (val x: Self) extends AnyVal {
    
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
