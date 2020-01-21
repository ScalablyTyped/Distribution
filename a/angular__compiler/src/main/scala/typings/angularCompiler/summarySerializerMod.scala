package typings.angularCompiler

import typings.angularCompiler.srcSummaryResolverMod.SummaryResolver
import typings.angularCompiler.srcUtilMod.OutputContext
import typings.angularCompiler.staticSymbolMod.StaticSymbol
import typings.angularCompiler.staticSymbolMod.StaticSymbolCache
import typings.angularCompiler.staticSymbolResolverMod.ResolvedStaticSymbol
import typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/summary_serializer", JSImport.Namespace)
@js.native
object summarySerializerMod extends js.Object {
  def createForJitStub(outputCtx: OutputContext, reference: StaticSymbol): Unit = js.native
  def deserializeSummaries(
    symbolCache: StaticSymbolCache,
    summaryResolver: SummaryResolver[StaticSymbol],
    libraryFileName: String,
    json: String
  ): AnonImportAsModuleName = js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: Null,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[AnonMetadata]
  ): AnonExportAsJson = js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: Null,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[AnonMetadata],
    createExternalSymbolReexports: Boolean
  ): AnonExportAsJson = js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: OutputContext,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[AnonMetadata]
  ): AnonExportAsJson = js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: OutputContext,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[AnonMetadata],
    createExternalSymbolReexports: Boolean
  ): AnonExportAsJson = js.native
}

