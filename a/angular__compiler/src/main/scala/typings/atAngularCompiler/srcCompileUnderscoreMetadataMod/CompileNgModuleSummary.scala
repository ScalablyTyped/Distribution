package typings.atAngularCompiler.srcCompileUnderscoreMetadataMod

import typings.atAngularCompiler.Anon_Module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileNgModuleSummary extends CompileTypeSummary {
  var entryComponents: js.Array[CompileEntryComponentMetadata]
  var exportedDirectives: js.Array[CompileIdentifierMetadata]
  var exportedPipes: js.Array[CompileIdentifierMetadata]
  var modules: js.Array[CompileTypeMetadata]
  var providers: js.Array[Anon_Module]
}

object CompileNgModuleSummary {
  @scala.inline
  def apply(
    entryComponents: js.Array[CompileEntryComponentMetadata],
    exportedDirectives: js.Array[CompileIdentifierMetadata],
    exportedPipes: js.Array[CompileIdentifierMetadata],
    modules: js.Array[CompileTypeMetadata],
    providers: js.Array[Anon_Module],
    `type`: CompileTypeMetadata,
    summaryKind: CompileSummaryKind = null
  ): CompileNgModuleSummary = {
    val __obj = js.Dynamic.literal(entryComponents = entryComponents, exportedDirectives = exportedDirectives, exportedPipes = exportedPipes, modules = modules, providers = providers)
    __obj.updateDynamic("type")(`type`)
    if (summaryKind != null) __obj.updateDynamic("summaryKind")(summaryKind)
    __obj.asInstanceOf[CompileNgModuleSummary]
  }
}

