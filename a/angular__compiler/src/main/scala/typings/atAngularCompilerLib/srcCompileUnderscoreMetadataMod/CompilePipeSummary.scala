package typings
package atAngularCompilerLib.srcCompileUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilePipeSummary extends CompileTypeSummary {
  var name: java.lang.String
  var pure: scala.Boolean
}

object CompilePipeSummary {
  @scala.inline
  def apply(
    name: java.lang.String,
    pure: scala.Boolean,
    `type`: CompileTypeMetadata,
    summaryKind: CompileSummaryKind = null
  ): CompilePipeSummary = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("pure")(pure)
    if (summaryKind != null) __obj.updateDynamic("summaryKind")(summaryKind)
    __obj.asInstanceOf[CompilePipeSummary]
  }
}

