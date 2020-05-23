package typings.angularCompiler.publicApiMod

import typings.angularCompiler.anon.Ctor
import typings.angularCompiler.anon.FilePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "StaticReflector")
@js.native
class StaticReflector protected ()
  extends typings.angularCompiler.srcCompilerMod.StaticReflector {
  def this(
    summaryResolver: typings.angularCompiler.srcSummaryResolverMod.SummaryResolver[typings.angularCompiler.staticSymbolMod.StaticSymbol],
    symbolResolver: typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
  ) = this()
  def this(
    summaryResolver: typings.angularCompiler.srcSummaryResolverMod.SummaryResolver[typings.angularCompiler.staticSymbolMod.StaticSymbol],
    symbolResolver: typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    knownMetadataClasses: js.Array[Ctor]
  ) = this()
  def this(
    summaryResolver: typings.angularCompiler.srcSummaryResolverMod.SummaryResolver[typings.angularCompiler.staticSymbolMod.StaticSymbol],
    symbolResolver: typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    knownMetadataClasses: js.Array[Ctor],
    knownMetadataFunctions: js.Array[FilePath]
  ) = this()
  def this(
    summaryResolver: typings.angularCompiler.srcSummaryResolverMod.SummaryResolver[typings.angularCompiler.staticSymbolMod.StaticSymbol],
    symbolResolver: typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    knownMetadataClasses: js.Array[Ctor],
    knownMetadataFunctions: js.Array[FilePath],
    errorRecorder: js.Function2[/* error */ js.Any, /* fileName */ js.UndefOr[String], Unit]
  ) = this()
}

