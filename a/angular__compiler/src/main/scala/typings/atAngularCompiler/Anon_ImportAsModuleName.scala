package typings.atAngularCompiler

import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol
import typings.atAngularCompiler.srcSummaryUnderscoreResolverMod.Summary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ImportAsModuleName extends js.Object {
  var importAs: js.Array[Anon_ImportAs]
  var moduleName: String | Null
  var summaries: js.Array[Summary[StaticSymbol]]
}

object Anon_ImportAsModuleName {
  @scala.inline
  def apply(
    importAs: js.Array[Anon_ImportAs],
    summaries: js.Array[Summary[StaticSymbol]],
    moduleName: String = null
  ): Anon_ImportAsModuleName = {
    val __obj = js.Dynamic.literal(importAs = importAs.asInstanceOf[js.Any], summaries = summaries.asInstanceOf[js.Any])
    if (moduleName != null) __obj.updateDynamic("moduleName")(moduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ImportAsModuleName]
  }
}

