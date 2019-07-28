package typings.atAngularCompiler.publicUnderscoreApiMod

import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolverHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "StaticSymbolResolver")
@js.native
class StaticSymbolResolver protected ()
  extends typings.atAngularCompiler.srcCompilerMod.StaticSymbolResolver {
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

