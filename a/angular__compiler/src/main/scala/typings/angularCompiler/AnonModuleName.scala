package typings.angularCompiler

import typings.angularCompiler.srcSummaryResolverMod.Summary
import typings.angularCompiler.staticSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonModuleName extends js.Object {
  var importAs: js.Array[AnonImportAs]
  var moduleName: String | Null
  var summaries: js.Array[Summary[StaticSymbol]]
}

object AnonModuleName {
  @scala.inline
  def apply(
    importAs: js.Array[AnonImportAs],
    summaries: js.Array[Summary[StaticSymbol]],
    moduleName: String = null
  ): AnonModuleName = {
    val __obj = js.Dynamic.literal(importAs = importAs.asInstanceOf[js.Any], summaries = summaries.asInstanceOf[js.Any])
    if (moduleName != null) __obj.updateDynamic("moduleName")(moduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonModuleName]
  }
}

