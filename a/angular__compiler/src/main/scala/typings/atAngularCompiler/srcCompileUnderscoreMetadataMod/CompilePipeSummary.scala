package typings.atAngularCompiler.srcCompileUnderscoreMetadataMod

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
    val __obj = js.Dynamic.literal(name = name, pure = pure)
    __obj.updateDynamic("type")(`type`)
    if (summaryKind != null) __obj.updateDynamic("summaryKind")(summaryKind)
    __obj.asInstanceOf[CompilePipeSummary]
  }
}

