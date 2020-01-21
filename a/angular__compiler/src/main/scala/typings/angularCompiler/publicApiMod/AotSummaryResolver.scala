package typings.angularCompiler.publicApiMod

import typings.angularCompiler.summaryResolverMod.AotSummaryResolverHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "AotSummaryResolver")
@js.native
class AotSummaryResolver protected ()
  extends typings.angularCompiler.srcCompilerMod.AotSummaryResolver {
  def this(
    host: AotSummaryResolverHost,
    staticSymbolCache: typings.angularCompiler.staticSymbolMod.StaticSymbolCache
  ) = this()
}

