package typings.angularCore.mod

import typings.angularCore.anon.Directives
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ɵNgModuleTransitiveScopes extends StObject {
  
  var compilation: Directives
  
  var exported: Directives
  
  var schemas: js.Array[SchemaMetadata] | Null
}
object ɵNgModuleTransitiveScopes {
  
  @scala.inline
  def apply(compilation: Directives, exported: Directives): ɵNgModuleTransitiveScopes = {
    val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], schemas = null)
    __obj.asInstanceOf[ɵNgModuleTransitiveScopes]
  }
  
  @scala.inline
  implicit class ɵNgModuleTransitiveScopesMutableBuilder[Self <: ɵNgModuleTransitiveScopes] (val x: Self) extends AnyVal {
    
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
