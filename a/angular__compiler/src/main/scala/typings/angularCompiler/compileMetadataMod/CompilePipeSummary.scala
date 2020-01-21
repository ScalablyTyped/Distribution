package typings.angularCompiler.compileMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilePipeSummary extends CompileTypeSummary {
  var name: String
  var pure: Boolean
}

object CompilePipeSummary {
  @scala.inline
  def apply(name: String, pure: Boolean, `type`: CompileTypeMetadata, summaryKind: CompileSummaryKind = null): CompilePipeSummary = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pure = pure.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (summaryKind != null) __obj.updateDynamic("summaryKind")(summaryKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilePipeSummary]
  }
}

