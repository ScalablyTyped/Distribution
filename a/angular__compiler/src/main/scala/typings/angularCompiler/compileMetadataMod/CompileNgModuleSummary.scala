package typings.angularCompiler.compileMetadataMod

import typings.angularCompiler.anon.Module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileNgModuleSummary extends CompileTypeSummary {
  var entryComponents: js.Array[CompileEntryComponentMetadata]
  var exportedDirectives: js.Array[CompileIdentifierMetadata]
  var exportedPipes: js.Array[CompileIdentifierMetadata]
  var modules: js.Array[CompileTypeMetadata]
  var providers: js.Array[Module]
}

object CompileNgModuleSummary {
  @scala.inline
  def apply(
    entryComponents: js.Array[CompileEntryComponentMetadata],
    exportedDirectives: js.Array[CompileIdentifierMetadata],
    exportedPipes: js.Array[CompileIdentifierMetadata],
    modules: js.Array[CompileTypeMetadata],
    providers: js.Array[Module],
    `type`: CompileTypeMetadata,
    summaryKind: CompileSummaryKind = null
  ): CompileNgModuleSummary = {
    val __obj = js.Dynamic.literal(entryComponents = entryComponents.asInstanceOf[js.Any], exportedDirectives = exportedDirectives.asInstanceOf[js.Any], exportedPipes = exportedPipes.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], summaryKind = summaryKind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileNgModuleSummary]
  }
}

