package typings.angularCompilerCli

import typings.angularCompilerCli.anon.Diagnostics
import typings.angularCompilerCli.anon.Success
import typings.angularCompilerCli.ngccSrcAnalysisModuleWithProvidersAnalyzerMod.ModuleWithProvidersAnalyses
import typings.angularCompilerCli.ngccSrcAnalysisPrivateDeclarationsAnalyzerMod.ExportInfo
import typings.angularCompilerCli.ngccSrcAnalysisTypesMod.CompiledFile
import typings.angularCompilerCli.ngccSrcHostNgccHostMod.NgccReflectionHost
import typings.angularCompilerCli.ngccSrcPackagesEntryPointBundleMod.EntryPointBundle
import typings.angularCompilerCli.ngccSrcRenderingRenderingFormatterMod.RenderingFormatter
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import typings.angularCompilerCli.srcPerformCompileMod.ParsedConfiguration
import typings.std.Map
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcPackagesTransformerMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/transformer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/transformer", "Transformer")
  @js.native
  open class Transformer protected () extends StObject {
    def this(fs: ReadonlyFileSystem, logger: Logger) = this()
    def this(fs: ReadonlyFileSystem, logger: Logger, tsConfig: ParsedConfiguration) = this()
    
    def analyzeProgram(reflectionHost: NgccReflectionHost, bundle: EntryPointBundle): ProgramAnalyses = js.native
    
    /* private */ var fs: Any = js.native
    
    def getHost(bundle: EntryPointBundle): NgccReflectionHost = js.native
    
    def getRenderingFormatter(host: NgccReflectionHost, bundle: EntryPointBundle): RenderingFormatter = js.native
    
    /* private */ var logger: Any = js.native
    
    /**
      * Transform the source (and typings) files of a bundle.
      * @param bundle the bundle to transform.
      * @returns information about the files that were transformed.
      */
    def transform(bundle: EntryPointBundle): TransformResult = js.native
    
    /* private */ var tsConfig: Any = js.native
  }
  
  inline def hasErrors(diagnostics: js.Array[Diagnostic]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasErrors")(diagnostics.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait ProgramAnalyses extends StObject {
    
    var decorationAnalyses: Map[SourceFile, CompiledFile]
    
    var diagnostics: js.Array[Diagnostic]
    
    var moduleWithProvidersAnalyses: ModuleWithProvidersAnalyses | Null
    
    var privateDeclarationsAnalyses: js.Array[ExportInfo]
  }
  object ProgramAnalyses {
    
    inline def apply(
      decorationAnalyses: Map[SourceFile, CompiledFile],
      diagnostics: js.Array[Diagnostic],
      privateDeclarationsAnalyses: js.Array[ExportInfo]
    ): ProgramAnalyses = {
      val __obj = js.Dynamic.literal(decorationAnalyses = decorationAnalyses.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], privateDeclarationsAnalyses = privateDeclarationsAnalyses.asInstanceOf[js.Any], moduleWithProvidersAnalyses = null)
      __obj.asInstanceOf[ProgramAnalyses]
    }
    
    extension [Self <: ProgramAnalyses](x: Self) {
      
      inline def setDecorationAnalyses(value: Map[SourceFile, CompiledFile]): Self = StObject.set(x, "decorationAnalyses", value.asInstanceOf[js.Any])
      
      inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
      
      inline def setModuleWithProvidersAnalyses(value: ModuleWithProvidersAnalyses): Self = StObject.set(x, "moduleWithProvidersAnalyses", value.asInstanceOf[js.Any])
      
      inline def setModuleWithProvidersAnalysesNull: Self = StObject.set(x, "moduleWithProvidersAnalyses", null)
      
      inline def setPrivateDeclarationsAnalyses(value: js.Array[ExportInfo]): Self = StObject.set(x, "privateDeclarationsAnalyses", value.asInstanceOf[js.Any])
      
      inline def setPrivateDeclarationsAnalysesVarargs(value: ExportInfo*): Self = StObject.set(x, "privateDeclarationsAnalyses", js.Array(value*))
    }
  }
  
  type TransformResult = Diagnostics | Success
}
