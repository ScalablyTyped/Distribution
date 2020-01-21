package typings.angularCompiler.srcCompilerMod

import typings.angularCompiler.AnonCtor
import typings.angularCompiler.AnonFilePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "StaticReflector")
@js.native
class StaticReflector protected ()
  extends typings.angularCompiler.staticReflectorMod.StaticReflector {
  def this(
    summaryResolver: typings.angularCompiler.srcSummaryResolverMod.SummaryResolver[typings.angularCompiler.staticSymbolMod.StaticSymbol],
    symbolResolver: typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
  ) = this()
  def this(
    summaryResolver: typings.angularCompiler.srcSummaryResolverMod.SummaryResolver[typings.angularCompiler.staticSymbolMod.StaticSymbol],
    symbolResolver: typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    knownMetadataClasses: js.Array[AnonCtor]
  ) = this()
  def this(
    summaryResolver: typings.angularCompiler.srcSummaryResolverMod.SummaryResolver[typings.angularCompiler.staticSymbolMod.StaticSymbol],
    symbolResolver: typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    knownMetadataClasses: js.Array[AnonCtor],
    knownMetadataFunctions: js.Array[AnonFilePath]
  ) = this()
  def this(
    summaryResolver: typings.angularCompiler.srcSummaryResolverMod.SummaryResolver[typings.angularCompiler.staticSymbolMod.StaticSymbol],
    symbolResolver: typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    knownMetadataClasses: js.Array[AnonCtor],
    knownMetadataFunctions: js.Array[AnonFilePath],
    errorRecorder: js.Function2[/* error */ js.Any, /* fileName */ js.UndefOr[String], Unit]
  ) = this()
}

