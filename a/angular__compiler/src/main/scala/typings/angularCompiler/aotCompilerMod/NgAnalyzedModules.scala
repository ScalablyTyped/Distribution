package typings.angularCompiler.aotCompilerMod

import typings.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typings.angularCompiler.staticSymbolMod.StaticSymbol
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NgAnalyzedModules extends js.Object {
  
  var files: js.Array[NgAnalyzedFile] = js.native
  
  var ngModuleByPipeOrDirective: Map[StaticSymbol, CompileNgModuleMetadata] = js.native
  
  var ngModules: js.Array[CompileNgModuleMetadata] = js.native
  
  var symbolsMissingModule: js.UndefOr[js.Array[StaticSymbol]] = js.native
}
object NgAnalyzedModules {
  
  @scala.inline
  def apply(
    files: js.Array[NgAnalyzedFile],
    ngModuleByPipeOrDirective: Map[StaticSymbol, CompileNgModuleMetadata],
    ngModules: js.Array[CompileNgModuleMetadata]
  ): NgAnalyzedModules = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], ngModuleByPipeOrDirective = ngModuleByPipeOrDirective.asInstanceOf[js.Any], ngModules = ngModules.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgAnalyzedModules]
  }
  
  @scala.inline
  implicit class NgAnalyzedModulesOps[Self <: NgAnalyzedModules] (val x: Self) extends AnyVal {
    
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
    def setFilesVarargs(value: NgAnalyzedFile*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[NgAnalyzedFile]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNgModuleByPipeOrDirective(value: Map[StaticSymbol, CompileNgModuleMetadata]): Self = this.set("ngModuleByPipeOrDirective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNgModulesVarargs(value: CompileNgModuleMetadata*): Self = this.set("ngModules", js.Array(value :_*))
    
    @scala.inline
    def setNgModules(value: js.Array[CompileNgModuleMetadata]): Self = this.set("ngModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolsMissingModuleVarargs(value: StaticSymbol*): Self = this.set("symbolsMissingModule", js.Array(value :_*))
    
    @scala.inline
    def setSymbolsMissingModule(value: js.Array[StaticSymbol]): Self = this.set("symbolsMissingModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolsMissingModule: Self = this.set("symbolsMissingModule", js.undefined)
  }
}
