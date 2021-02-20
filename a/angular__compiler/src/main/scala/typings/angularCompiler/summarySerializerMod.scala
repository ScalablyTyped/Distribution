package typings.angularCompiler

import typings.angularCompiler.anon.Json
import typings.angularCompiler.anon.Metadata
import typings.angularCompiler.anon.ModuleName
import typings.angularCompiler.srcSummaryResolverMod.SummaryResolver
import typings.angularCompiler.srcUtilMod.OutputContext
import typings.angularCompiler.staticSymbolMod.StaticSymbol
import typings.angularCompiler.staticSymbolMod.StaticSymbolCache
import typings.angularCompiler.staticSymbolResolverMod.ResolvedStaticSymbol
import typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object summarySerializerMod {
  
  @JSImport("@angular/compiler/src/aot/summary_serializer", "createForJitStub")
  @js.native
  def createForJitStub(outputCtx: OutputContext, reference: StaticSymbol): Unit = js.native
  
  @JSImport("@angular/compiler/src/aot/summary_serializer", "deserializeSummaries")
  @js.native
  def deserializeSummaries(
    symbolCache: StaticSymbolCache,
    summaryResolver: SummaryResolver[StaticSymbol],
    libraryFileName: String,
    json: String
  ): ModuleName = js.native
  
  @JSImport("@angular/compiler/src/aot/summary_serializer", "serializeSummaries")
  @js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: Null,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Metadata]
  ): Json = js.native
  @JSImport("@angular/compiler/src/aot/summary_serializer", "serializeSummaries")
  @js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: Null,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Metadata],
    createExternalSymbolReexports: Boolean
  ): Json = js.native
  @JSImport("@angular/compiler/src/aot/summary_serializer", "serializeSummaries")
  @js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: OutputContext,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Metadata]
  ): Json = js.native
  @JSImport("@angular/compiler/src/aot/summary_serializer", "serializeSummaries")
  @js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: OutputContext,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Metadata],
    createExternalSymbolReexports: Boolean
  ): Json = js.native
}
