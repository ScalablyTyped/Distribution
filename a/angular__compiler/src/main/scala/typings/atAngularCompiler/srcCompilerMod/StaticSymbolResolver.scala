package typings.atAngularCompiler.srcCompilerMod

import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolverHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "StaticSymbolResolver")
@js.native
class StaticSymbolResolver protected ()
  extends typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver {
  def this(
    host: StaticSymbolResolverHost,
    staticSymbolCache: typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbolCache,
    summaryResolver: typings.atAngularCompiler.srcSummaryUnderscoreResolverMod.SummaryResolver[typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol]
  ) = this()
  def this(
    host: StaticSymbolResolverHost,
    staticSymbolCache: typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbolCache,
    summaryResolver: typings.atAngularCompiler.srcSummaryUnderscoreResolverMod.SummaryResolver[typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol],
    errorRecorder: js.Function2[/* error */ js.Any, /* fileName */ js.UndefOr[String], Unit]
  ) = this()
}

