package typings.angularCore.r3SymbolsMod

import typings.angularCore.anon.Directives
import org.scalablytyped.runtime.StObject
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
trait NgModuleTransitiveScopes extends StObject {
  
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
  implicit class NgModuleTransitiveScopesMutableBuilder[Self <: NgModuleTransitiveScopes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompilation(value: Directives): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExported(value: Directives): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemas(value: js.Array[SchemaMetadata]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasNull: Self = StObject.set(x, "schemas", null)
    
    @scala.inline
    def setSchemasVarargs(value: SchemaMetadata*): Self = StObject.set(x, "schemas", js.Array(value :_*))
  }
}
