package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcAnalysisModuleWithProvidersAnalyzerMod.ModuleWithProvidersAnalyses
import typings.angularCompilerCli.ngccSrcAnalysisModuleWithProvidersAnalyzerMod.ModuleWithProvidersInfo
import typings.angularCompilerCli.ngccSrcAnalysisPrivateDeclarationsAnalyzerMod.ExportInfo
import typings.angularCompilerCli.ngccSrcAnalysisPrivateDeclarationsAnalyzerMod.PrivateDeclarationsAnalyses
import typings.angularCompilerCli.ngccSrcAnalysisTypesMod.DecorationAnalyses
import typings.angularCompilerCli.ngccSrcHostNgccHostMod.NgccReflectionHost
import typings.angularCompilerCli.ngccSrcPackagesEntryPointBundleMod.EntryPointBundle
import typings.angularCompilerCli.ngccSrcRenderingRenderingFormatterMod.RenderingFormatter
import typings.angularCompilerCli.ngccSrcRenderingUtilsMod.FileToWrite
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typings.angularCompilerCli.srcNgtscImportsSrcReexportMod.Reexport
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import typings.angularCompilerCli.srcNgtscTransformSrcApiMod.CompileResult
import typings.typescript.mod.Declaration
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcRenderingDtsRendererMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/rendering/dts_renderer", "DtsRenderer")
  @js.native
  open class DtsRenderer protected () extends StObject {
    def this(
      dtsFormatter: RenderingFormatter,
      fs: ReadonlyFileSystem,
      logger: Logger,
      host: NgccReflectionHost,
      bundle: EntryPointBundle
    ) = this()
    
    /* private */ var bundle: Any = js.native
    
    /* private */ var dtsFormatter: Any = js.native
    
    /* private */ var fs: Any = js.native
    
    /* private */ var getTypingsFilesToRender: Any = js.native
    
    /* private */ var host: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    def renderDtsFile(dtsFile: SourceFile, renderInfo: DtsRenderInfo): js.Array[FileToWrite] = js.native
    
    def renderProgram(decorationAnalyses: DecorationAnalyses, privateDeclarationsAnalyses: PrivateDeclarationsAnalyses): js.Array[FileToWrite] = js.native
    def renderProgram(
      decorationAnalyses: DecorationAnalyses,
      privateDeclarationsAnalyses: PrivateDeclarationsAnalyses,
      moduleWithProvidersAnalyses: ModuleWithProvidersAnalyses
    ): js.Array[FileToWrite] = js.native
  }
  
  trait DtsClassInfo extends StObject {
    
    var compilation: js.Array[CompileResult]
    
    var dtsDeclaration: Declaration
  }
  object DtsClassInfo {
    
    inline def apply(compilation: js.Array[CompileResult], dtsDeclaration: Declaration): DtsClassInfo = {
      val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], dtsDeclaration = dtsDeclaration.asInstanceOf[js.Any])
      __obj.asInstanceOf[DtsClassInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DtsClassInfo] (val x: Self) extends AnyVal {
      
      inline def setCompilation(value: js.Array[CompileResult]): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
      
      inline def setCompilationVarargs(value: CompileResult*): Self = StObject.set(x, "compilation", js.Array(value*))
      
      inline def setDtsDeclaration(value: Declaration): Self = StObject.set(x, "dtsDeclaration", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A structure that captures information about what needs to be rendered
    * in a typings file.
    *
    * It is created as a result of processing the analysis passed to the renderer.
    *
    * The `renderDtsFile()` method consumes it when rendering a typings file.
    */
  trait DtsRenderInfo extends StObject {
    
    var classInfo: js.Array[DtsClassInfo]
    
    var moduleWithProviders: js.Array[ModuleWithProvidersInfo]
    
    var privateExports: js.Array[ExportInfo]
    
    var reexports: js.Array[Reexport]
  }
  object DtsRenderInfo {
    
    inline def apply(
      classInfo: js.Array[DtsClassInfo],
      moduleWithProviders: js.Array[ModuleWithProvidersInfo],
      privateExports: js.Array[ExportInfo],
      reexports: js.Array[Reexport]
    ): DtsRenderInfo = {
      val __obj = js.Dynamic.literal(classInfo = classInfo.asInstanceOf[js.Any], moduleWithProviders = moduleWithProviders.asInstanceOf[js.Any], privateExports = privateExports.asInstanceOf[js.Any], reexports = reexports.asInstanceOf[js.Any])
      __obj.asInstanceOf[DtsRenderInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DtsRenderInfo] (val x: Self) extends AnyVal {
      
      inline def setClassInfo(value: js.Array[DtsClassInfo]): Self = StObject.set(x, "classInfo", value.asInstanceOf[js.Any])
      
      inline def setClassInfoVarargs(value: DtsClassInfo*): Self = StObject.set(x, "classInfo", js.Array(value*))
      
      inline def setModuleWithProviders(value: js.Array[ModuleWithProvidersInfo]): Self = StObject.set(x, "moduleWithProviders", value.asInstanceOf[js.Any])
      
      inline def setModuleWithProvidersVarargs(value: ModuleWithProvidersInfo*): Self = StObject.set(x, "moduleWithProviders", js.Array(value*))
      
      inline def setPrivateExports(value: js.Array[ExportInfo]): Self = StObject.set(x, "privateExports", value.asInstanceOf[js.Any])
      
      inline def setPrivateExportsVarargs(value: ExportInfo*): Self = StObject.set(x, "privateExports", js.Array(value*))
      
      inline def setReexports(value: js.Array[Reexport]): Self = StObject.set(x, "reexports", value.asInstanceOf[js.Any])
      
      inline def setReexportsVarargs(value: Reexport*): Self = StObject.set(x, "reexports", js.Array(value*))
    }
  }
}
