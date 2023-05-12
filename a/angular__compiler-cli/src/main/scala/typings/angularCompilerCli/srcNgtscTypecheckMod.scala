package typings.angularCompilerCli

import typings.angularCompilerCli.anon.PickCompilerHostgetCanoni
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscImportsMod.ReferenceEmitter
import typings.angularCompilerCli.srcNgtscIncrementalApiMod.IncrementalBuild
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReaderWithIndex
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.NgModuleIndex
import typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typings.angularCompilerCli.srcNgtscProgramDriverSrcApiMod.ProgramDriver
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.angularCompilerCli.srcNgtscScopeMod.TypeCheckScopeRegistry
import typings.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeReader
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TypeCheckingConfig
import typings.angularCompilerCli.srcNgtscTypecheckApiContextMod.ProgramTypeCheckAdapter
import typings.angularCompilerCli.srcNgtscTypecheckSrcCheckerMod.FileTypeCheckingData
import typings.angularCompilerCli.srcNgtscTypecheckSrcContextMod.InliningMode
import typings.angularCompilerCli.srcNgtscTypecheckSrcContextMod.TypeCheckingHost
import typings.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck", "TemplateTypeCheckerImpl")
  @js.native
  open class TemplateTypeCheckerImpl protected ()
    extends typings.angularCompilerCli.srcNgtscTypecheckSrcCheckerMod.TemplateTypeCheckerImpl {
    def this(
      originalProgram: Program,
      programDriver: ProgramDriver,
      typeCheckAdapter: ProgramTypeCheckAdapter,
      config: TypeCheckingConfig,
      refEmitter: ReferenceEmitter,
      reflector: ReflectionHost,
      compilerHost: PickCompilerHostgetCanoni,
      priorBuild: IncrementalBuild[Any, FileTypeCheckingData],
      metaReader: MetadataReader,
      localMetaReader: MetadataReaderWithIndex,
      ngModuleIndex: NgModuleIndex,
      componentScopeReader: ComponentScopeReader,
      typeCheckScopeRegistry: TypeCheckScopeRegistry,
      perf: PerfRecorder
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck", "TypeCheckContextImpl")
  @js.native
  open class TypeCheckContextImpl protected ()
    extends typings.angularCompilerCli.srcNgtscTypecheckSrcContextMod.TypeCheckContextImpl {
    def this(
      config: TypeCheckingConfig,
      compilerHost: PickCompilerHostgetCanoni,
      refEmitter: ReferenceEmitter,
      reflector: ReflectionHost,
      host: TypeCheckingHost,
      inlining: InliningMode,
      perf: PerfRecorder
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck", "TypeCheckShimGenerator")
  @js.native
  open class TypeCheckShimGenerator ()
    extends typings.angularCompilerCli.srcNgtscTypecheckSrcShimMod.TypeCheckShimGenerator
  /* static members */
  object TypeCheckShimGenerator {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/typecheck", "TypeCheckShimGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def shimFor(fileName: AbsoluteFsPath): AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("shimFor")(fileName.asInstanceOf[js.Any]).asInstanceOf[AbsoluteFsPath]
  }
  
  inline def typeCheckFilePath(rootDirs: js.Array[AbsoluteFsPath]): AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("typeCheckFilePath")(rootDirs.asInstanceOf[js.Any]).asInstanceOf[AbsoluteFsPath]
}
