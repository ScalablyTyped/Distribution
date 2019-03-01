package typings
package atAngularCompilerLib.srcCompileUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileNgModuleSummary extends CompileTypeSummary {
  var entryComponents: js.Array[CompileEntryComponentMetadata]
  var exportedDirectives: js.Array[CompileIdentifierMetadata]
  var exportedPipes: js.Array[CompileIdentifierMetadata]
  var modules: js.Array[CompileTypeMetadata]
  var providers: js.Array[atAngularCompilerLib.Anon_Module]
}

object CompileNgModuleSummary {
  @scala.inline
  def apply(
    entryComponents: js.Array[CompileEntryComponentMetadata],
    exportedDirectives: js.Array[CompileIdentifierMetadata],
    exportedPipes: js.Array[CompileIdentifierMetadata],
    modules: js.Array[CompileTypeMetadata],
    providers: js.Array[atAngularCompilerLib.Anon_Module],
    `type`: CompileTypeMetadata,
    summaryKind: CompileSummaryKind = null
  ): CompileNgModuleSummary = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("entryComponents")(entryComponents)
    __obj.updateDynamic("exportedDirectives")(exportedDirectives)
    __obj.updateDynamic("exportedPipes")(exportedPipes)
    __obj.updateDynamic("modules")(modules)
    __obj.updateDynamic("providers")(providers)
    if (summaryKind != null) __obj.updateDynamic("summaryKind")(summaryKind)
    __obj.asInstanceOf[CompileNgModuleSummary]
  }
}

