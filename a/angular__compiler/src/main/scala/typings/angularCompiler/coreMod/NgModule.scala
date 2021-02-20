package typings.angularCompiler.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NgModule extends StObject {
  
  var bootstrap: js.UndefOr[js.Array[typings.angularCompiler.coreMod.Type | js.Array[_]]] = js.native
  
  var declarations: js.UndefOr[js.Array[typings.angularCompiler.coreMod.Type | js.Array[_]]] = js.native
  
  var entryComponents: js.UndefOr[js.Array[typings.angularCompiler.coreMod.Type | js.Array[_]]] = js.native
  
  var exports: js.UndefOr[js.Array[typings.angularCompiler.coreMod.Type | js.Array[_]]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var imports: js.UndefOr[
    js.Array[typings.angularCompiler.coreMod.Type | ModuleWithProviders | js.Array[_]]
  ] = js.native
  
  var providers: js.UndefOr[js.Array[Provider]] = js.native
  
  var schemas: js.UndefOr[js.Array[SchemaMetadata | js.Array[_]]] = js.native
}
object NgModule {
  
  @scala.inline
  def apply(): NgModule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NgModule]
  }
  
  @scala.inline
  implicit class NgModuleMutableBuilder[Self <: NgModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBootstrap(value: js.Array[typings.angularCompiler.coreMod.Type | js.Array[_]]): Self = StObject.set(x, "bootstrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrapUndefined: Self = StObject.set(x, "bootstrap", js.undefined)
    
    @scala.inline
    def setBootstrapVarargs(value: (typings.angularCompiler.coreMod.Type | js.Array[js.Any])*): Self = StObject.set(x, "bootstrap", js.Array(value :_*))
    
    @scala.inline
    def setDeclarations(value: js.Array[typings.angularCompiler.coreMod.Type | js.Array[_]]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarationsUndefined: Self = StObject.set(x, "declarations", js.undefined)
    
    @scala.inline
    def setDeclarationsVarargs(value: (typings.angularCompiler.coreMod.Type | js.Array[js.Any])*): Self = StObject.set(x, "declarations", js.Array(value :_*))
    
    @scala.inline
    def setEntryComponents(value: js.Array[typings.angularCompiler.coreMod.Type | js.Array[_]]): Self = StObject.set(x, "entryComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryComponentsUndefined: Self = StObject.set(x, "entryComponents", js.undefined)
    
    @scala.inline
    def setEntryComponentsVarargs(value: (typings.angularCompiler.coreMod.Type | js.Array[js.Any])*): Self = StObject.set(x, "entryComponents", js.Array(value :_*))
    
    @scala.inline
    def setExports(value: js.Array[typings.angularCompiler.coreMod.Type | js.Array[_]]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
    @scala.inline
    def setExportsVarargs(value: (typings.angularCompiler.coreMod.Type | js.Array[js.Any])*): Self = StObject.set(x, "exports", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImports(value: js.Array[typings.angularCompiler.coreMod.Type | ModuleWithProviders | js.Array[_]]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    @scala.inline
    def setImportsVarargs(value: (typings.angularCompiler.coreMod.Type | ModuleWithProviders | js.Array[js.Any])*): Self = StObject.set(x, "imports", js.Array(value :_*))
    
    @scala.inline
    def setProviders(value: js.Array[Provider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    @scala.inline
    def setProvidersVarargs(value: Provider*): Self = StObject.set(x, "providers", js.Array(value :_*))
    
    @scala.inline
    def setSchemas(value: js.Array[SchemaMetadata | js.Array[_]]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    @scala.inline
    def setSchemasVarargs(value: (SchemaMetadata | js.Array[js.Any])*): Self = StObject.set(x, "schemas", js.Array(value :_*))
  }
}
