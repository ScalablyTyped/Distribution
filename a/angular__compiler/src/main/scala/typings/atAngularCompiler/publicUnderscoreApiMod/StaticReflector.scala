package typings.atAngularCompiler.publicUnderscoreApiMod

import typings.atAngularCompiler.Anon_Ctor
import typings.atAngularCompiler.Anon_FilePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "StaticReflector")
@js.native
class StaticReflector protected ()
  extends typings.atAngularCompiler.srcCompilerMod.StaticReflector {
  def this(
    summaryResolver: typings.atAngularCompiler.srcSummaryUnderscoreResolverMod.SummaryResolver[typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol],
    symbolResolver: typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver
  ) = this()
  def this(
    summaryResolver: typings.atAngularCompiler.srcSummaryUnderscoreResolverMod.SummaryResolver[typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol],
    symbolResolver: typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    knownMetadataClasses: js.Array[Anon_Ctor]
  ) = this()
  def this(
    summaryResolver: typings.atAngularCompiler.srcSummaryUnderscoreResolverMod.SummaryResolver[typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol],
    symbolResolver: typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    knownMetadataClasses: js.Array[Anon_Ctor],
    knownMetadataFunctions: js.Array[Anon_FilePath]
  ) = this()
  def this(
    summaryResolver: typings.atAngularCompiler.srcSummaryUnderscoreResolverMod.SummaryResolver[typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol],
    symbolResolver: typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    knownMetadataClasses: js.Array[Anon_Ctor],
    knownMetadataFunctions: js.Array[Anon_FilePath],
    errorRecorder: js.Function2[/* error */ js.Any, /* fileName */ js.UndefOr[String], Unit]
  ) = this()
}

