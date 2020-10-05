package typings.angularCompiler.mod

import typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolverHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "StaticSymbolResolver")
@js.native
class StaticSymbolResolver protected ()
  extends typings.angularCompiler.compilerMod.StaticSymbolResolver {
  def this(
    host: StaticSymbolResolverHost,
    staticSymbolCache: typings.angularCompiler.staticSymbolMod.StaticSymbolCache,
    summaryResolver: typings.angularCompiler.srcSummaryResolverMod.SummaryResolver[typings.angularCompiler.staticSymbolMod.StaticSymbol]
  ) = this()
  def this(
    host: StaticSymbolResolverHost,
    staticSymbolCache: typings.angularCompiler.staticSymbolMod.StaticSymbolCache,
    summaryResolver: typings.angularCompiler.srcSummaryResolverMod.SummaryResolver[typings.angularCompiler.staticSymbolMod.StaticSymbol],
    errorRecorder: js.Function2[/* error */ js.Any, /* fileName */ js.UndefOr[String], Unit]
  ) = this()
}

