package typings.angularCompiler.anon

import typings.angularCompiler.srcSummaryResolverMod.Summary
import typings.angularCompiler.staticSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleName extends js.Object {
  var importAs: js.Array[ImportAs]
  var moduleName: String | Null
  var summaries: js.Array[Summary[StaticSymbol]]
}

object ModuleName {
  @scala.inline
  def apply(
    importAs: js.Array[ImportAs],
    summaries: js.Array[Summary[StaticSymbol]],
    moduleName: String = null
  ): ModuleName = {
    val __obj = js.Dynamic.literal(importAs = importAs.asInstanceOf[js.Any], summaries = summaries.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleName]
  }
}

