package typings
package atAngularCompilerLib.srcCompileUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileTypeSummary extends js.Object {
  var summaryKind: CompileSummaryKind | scala.Null
  var `type`: CompileTypeMetadata
}

object CompileTypeSummary {
  @scala.inline
  def apply(`type`: CompileTypeMetadata, summaryKind: CompileSummaryKind = null): CompileTypeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (summaryKind != null) __obj.updateDynamic("summaryKind")(summaryKind)
    __obj.asInstanceOf[CompileTypeSummary]
  }
}

