package typings.angularCompiler.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NgModule extends js.Object {
  
  var bootstrap: js.UndefOr[js.Array[Type | js.Array[_]]] = js.native
  
  var declarations: js.UndefOr[js.Array[Type | js.Array[_]]] = js.native
  
  var entryComponents: js.UndefOr[js.Array[Type | js.Array[_]]] = js.native
  
  var exports: js.UndefOr[js.Array[Type | js.Array[_]]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var imports: js.UndefOr[js.Array[Type | ModuleWithProviders | js.Array[_]]] = js.native
  
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
  implicit class NgModuleOps[Self <: NgModule] (val x: Self) extends AnyVal {
    
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
    def setBootstrapVarargs(value: (Type | js.Array[js.Any])*): Self = this.set("bootstrap", js.Array(value :_*))
    
    @scala.inline
    def setBootstrap(value: js.Array[Type | js.Array[_]]): Self = this.set("bootstrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootstrap: Self = this.set("bootstrap", js.undefined)
    
    @scala.inline
    def setDeclarationsVarargs(value: (Type | js.Array[js.Any])*): Self = this.set("declarations", js.Array(value :_*))
    
    @scala.inline
    def setDeclarations(value: js.Array[Type | js.Array[_]]): Self = this.set("declarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclarations: Self = this.set("declarations", js.undefined)
    
    @scala.inline
    def setEntryComponentsVarargs(value: (Type | js.Array[js.Any])*): Self = this.set("entryComponents", js.Array(value :_*))
    
    @scala.inline
    def setEntryComponents(value: js.Array[Type | js.Array[_]]): Self = this.set("entryComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntryComponents: Self = this.set("entryComponents", js.undefined)
    
    @scala.inline
    def setExportsVarargs(value: (Type | js.Array[js.Any])*): Self = this.set("exports", js.Array(value :_*))
    
    @scala.inline
    def setExports(value: js.Array[Type | js.Array[_]]): Self = this.set("exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExports: Self = this.set("exports", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setImportsVarargs(value: (Type | ModuleWithProviders | js.Array[js.Any])*): Self = this.set("imports", js.Array(value :_*))
    
    @scala.inline
    def setImports(value: js.Array[Type | ModuleWithProviders | js.Array[_]]): Self = this.set("imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImports: Self = this.set("imports", js.undefined)
    
    @scala.inline
    def setProvidersVarargs(value: Provider*): Self = this.set("providers", js.Array(value :_*))
    
    @scala.inline
    def setProviders(value: js.Array[Provider]): Self = this.set("providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviders: Self = this.set("providers", js.undefined)
    
    @scala.inline
    def setSchemasVarargs(value: (SchemaMetadata | js.Array[js.Any])*): Self = this.set("schemas", js.Array(value :_*))
    
    @scala.inline
    def setSchemas(value: js.Array[SchemaMetadata | js.Array[_]]): Self = this.set("schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemas: Self = this.set("schemas", js.undefined)
  }
}
