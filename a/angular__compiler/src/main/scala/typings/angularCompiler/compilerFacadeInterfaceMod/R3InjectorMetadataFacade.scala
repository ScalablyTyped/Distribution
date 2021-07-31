package typings.angularCompiler.compilerFacadeInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3InjectorMetadataFacade extends StObject {
  
  var deps: js.Array[R3DependencyMetadataFacade] | Null
  
  var imports: js.Array[js.Any]
  
  var name: String
  
  var providers: js.Array[js.Any]
  
  var `type`: js.Any
}
object R3InjectorMetadataFacade {
  
  @scala.inline
  def apply(imports: js.Array[js.Any], name: String, providers: js.Array[js.Any], `type`: js.Any): R3InjectorMetadataFacade = {
    val __obj = js.Dynamic.literal(imports = imports.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], deps = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3InjectorMetadataFacade]
  }
  
  @scala.inline
  implicit class R3InjectorMetadataFacadeMutableBuilder[Self <: R3InjectorMetadataFacade] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeps(value: js.Array[R3DependencyMetadataFacade]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepsNull: Self = StObject.set(x, "deps", null)
    
    @scala.inline
    def setDepsVarargs(value: R3DependencyMetadataFacade*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    @scala.inline
    def setImports(value: js.Array[js.Any]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportsVarargs(value: js.Any*): Self = StObject.set(x, "imports", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviders(value: js.Array[js.Any]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersVarargs(value: js.Any*): Self = StObject.set(x, "providers", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
