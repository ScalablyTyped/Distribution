package typings.angularCompiler.compileMetadataMod

import typings.angularCompiler.AnonModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileNgModuleSummary extends CompileTypeSummary {
  var entryComponents: js.Array[CompileEntryComponentMetadata]
  var exportedDirectives: js.Array[CompileIdentifierMetadata]
  var exportedPipes: js.Array[CompileIdentifierMetadata]
  var modules: js.Array[CompileTypeMetadata]
  var providers: js.Array[AnonModule]
}

object CompileNgModuleSummary {
  @scala.inline
  def apply(
    entryComponents: js.Array[CompileEntryComponentMetadata],
    exportedDirectives: js.Array[CompileIdentifierMetadata],
    exportedPipes: js.Array[CompileIdentifierMetadata],
    modules: js.Array[CompileTypeMetadata],
    providers: js.Array[AnonModule],
    `type`: CompileTypeMetadata,
    summaryKind: CompileSummaryKind = null
  ): CompileNgModuleSummary = {
    val __obj = js.Dynamic.literal(entryComponents = entryComponents.asInstanceOf[js.Any], exportedDirectives = exportedDirectives.asInstanceOf[js.Any], exportedPipes = exportedPipes.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (summaryKind != null) __obj.updateDynamic("summaryKind")(summaryKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileNgModuleSummary]
  }
}

