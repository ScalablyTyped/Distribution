package typings.atAngularCompiler.srcSummaryUnderscoreResolverMod

import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileTypeSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Summary[T] extends js.Object {
  var metadata: js.Any
  var symbol: T
  var `type`: js.UndefOr[CompileTypeSummary] = js.undefined
}

object Summary {
  @scala.inline
  def apply[T](metadata: js.Any, symbol: T, `type`: CompileTypeSummary = null): Summary[T] = {
    val __obj = js.Dynamic.literal(metadata = metadata, symbol = symbol.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Summary[T]]
  }
}

