package typings.atAngularCompiler

import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol
import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbolCache
import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.ResolvedStaticSymbol
import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver
import typings.atAngularCompiler.srcSummaryUnderscoreResolverMod.SummaryResolver
import typings.atAngularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/summary_serializer", JSImport.Namespace)
@js.native
object srcAotSummaryUnderscoreSerializerMod extends js.Object {
  def createForJitStub(outputCtx: OutputContext, reference: StaticSymbol): Unit = js.native
  def deserializeSummaries(
    symbolCache: StaticSymbolCache,
    summaryResolver: SummaryResolver[StaticSymbol],
    libraryFileName: String,
    json: String
  ): Anon_ImportAsModuleName = js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: Null,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Anon_Metadata]
  ): Anon_ExportAsJson = js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: Null,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Anon_Metadata],
    createExternalSymbolReexports: Boolean
  ): Anon_ExportAsJson = js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: OutputContext,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Anon_Metadata]
  ): Anon_ExportAsJson = js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: OutputContext,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Anon_Metadata],
    createExternalSymbolReexports: Boolean
  ): Anon_ExportAsJson = js.native
}

