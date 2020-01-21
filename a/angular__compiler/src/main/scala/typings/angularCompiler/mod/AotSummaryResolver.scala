package typings.angularCompiler.mod

import typings.angularCompiler.summaryResolverMod.AotSummaryResolverHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "AotSummaryResolver")
@js.native
class AotSummaryResolver protected ()
  extends typings.angularCompiler.publicApiMod.AotSummaryResolver {
  def this(
    host: AotSummaryResolverHost,
    staticSymbolCache: typings.angularCompiler.staticSymbolMod.StaticSymbolCache
  ) = this()
}

