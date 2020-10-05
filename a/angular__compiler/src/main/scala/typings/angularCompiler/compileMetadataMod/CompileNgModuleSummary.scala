package typings.angularCompiler.compileMetadataMod

import typings.angularCompiler.anon.Module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompileNgModuleSummary extends CompileTypeSummary {
  var entryComponents: js.Array[CompileEntryComponentMetadata] = js.native
  var exportedDirectives: js.Array[CompileIdentifierMetadata] = js.native
  var exportedPipes: js.Array[CompileIdentifierMetadata] = js.native
  var modules: js.Array[CompileTypeMetadata] = js.native
  var providers: js.Array[Module] = js.native
}

object CompileNgModuleSummary {
  @scala.inline
  def apply(
    entryComponents: js.Array[CompileEntryComponentMetadata],
    exportedDirectives: js.Array[CompileIdentifierMetadata],
    exportedPipes: js.Array[CompileIdentifierMetadata],
    modules: js.Array[CompileTypeMetadata],
    providers: js.Array[Module],
    `type`: CompileTypeMetadata
  ): CompileNgModuleSummary = {
    val __obj = js.Dynamic.literal(entryComponents = entryComponents.asInstanceOf[js.Any], exportedDirectives = exportedDirectives.asInstanceOf[js.Any], exportedPipes = exportedPipes.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileNgModuleSummary]
  }
  @scala.inline
  implicit class CompileNgModuleSummaryOps[Self <: CompileNgModuleSummary] (val x: Self) extends AnyVal {
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
    def setEntryComponentsVarargs(value: CompileEntryComponentMetadata*): Self = this.set("entryComponents", js.Array(value :_*))
    @scala.inline
    def setEntryComponents(value: js.Array[CompileEntryComponentMetadata]): Self = this.set("entryComponents", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportedDirectivesVarargs(value: CompileIdentifierMetadata*): Self = this.set("exportedDirectives", js.Array(value :_*))
    @scala.inline
    def setExportedDirectives(value: js.Array[CompileIdentifierMetadata]): Self = this.set("exportedDirectives", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportedPipesVarargs(value: CompileIdentifierMetadata*): Self = this.set("exportedPipes", js.Array(value :_*))
    @scala.inline
    def setExportedPipes(value: js.Array[CompileIdentifierMetadata]): Self = this.set("exportedPipes", value.asInstanceOf[js.Any])
    @scala.inline
    def setModulesVarargs(value: CompileTypeMetadata*): Self = this.set("modules", js.Array(value :_*))
    @scala.inline
    def setModules(value: js.Array[CompileTypeMetadata]): Self = this.set("modules", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvidersVarargs(value: Module*): Self = this.set("providers", js.Array(value :_*))
    @scala.inline
    def setProviders(value: js.Array[Module]): Self = this.set("providers", value.asInstanceOf[js.Any])
  }
  
}

