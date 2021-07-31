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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object summarySerializerMod {
  
  @JSImport("@angular/compiler/src/aot/summary_serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createForJitStub(outputCtx: OutputContext, reference: StaticSymbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createForJitStub")(outputCtx.asInstanceOf[js.Any], reference.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def deserializeSummaries(
    symbolCache: StaticSymbolCache,
    summaryResolver: SummaryResolver[StaticSymbol],
    libraryFileName: String,
    json: String
  ): ModuleName = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeSummaries")(symbolCache.asInstanceOf[js.Any], summaryResolver.asInstanceOf[js.Any], libraryFileName.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[ModuleName]
  
  @scala.inline
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: Null,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Metadata]
  ): Json = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeSummaries")(srcFileName.asInstanceOf[js.Any], forJitCtx.asInstanceOf[js.Any], summaryResolver.asInstanceOf[js.Any], symbolResolver.asInstanceOf[js.Any], symbols.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Json]
  @scala.inline
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: Null,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Metadata],
    createExternalSymbolReexports: Boolean
  ): Json = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeSummaries")(srcFileName.asInstanceOf[js.Any], forJitCtx.asInstanceOf[js.Any], summaryResolver.asInstanceOf[js.Any], symbolResolver.asInstanceOf[js.Any], symbols.asInstanceOf[js.Any], types.asInstanceOf[js.Any], createExternalSymbolReexports.asInstanceOf[js.Any])).asInstanceOf[Json]
  @scala.inline
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: OutputContext,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Metadata]
  ): Json = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeSummaries")(srcFileName.asInstanceOf[js.Any], forJitCtx.asInstanceOf[js.Any], summaryResolver.asInstanceOf[js.Any], symbolResolver.asInstanceOf[js.Any], symbols.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Json]
  @scala.inline
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: OutputContext,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Metadata],
    createExternalSymbolReexports: Boolean
  ): Json = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeSummaries")(srcFileName.asInstanceOf[js.Any], forJitCtx.asInstanceOf[js.Any], summaryResolver.asInstanceOf[js.Any], symbolResolver.asInstanceOf[js.Any], symbols.asInstanceOf[js.Any], types.asInstanceOf[js.Any], createExternalSymbolReexports.asInstanceOf[js.Any])).asInstanceOf[Json]
}
