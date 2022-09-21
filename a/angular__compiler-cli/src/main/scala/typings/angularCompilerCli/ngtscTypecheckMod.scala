package typings.angularCompilerCli

import typings.angularCompilerCli.anon.PickCompilerHostgetCanoni
import typings.angularCompilerCli.apiApiMod.TypeCheckingConfig
import typings.angularCompilerCli.apiContextMod.ProgramTypeCheckAdapter
import typings.angularCompilerCli.incrementalApiMod.IncrementalBuild
import typings.angularCompilerCli.metadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.ngtscImportsMod.ReferenceEmitter
import typings.angularCompilerCli.perfSrcApiMod.PerfRecorder
import typings.angularCompilerCli.programDriverSrcApiMod.ProgramDriver
import typings.angularCompilerCli.scopeMod.TypeCheckScopeRegistry
import typings.angularCompilerCli.scopeSrcApiMod.ComponentScopeReader
import typings.angularCompilerCli.srcCheckerMod.FileTypeCheckingData
import typings.angularCompilerCli.srcHostMod.ReflectionHost
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.typecheckSrcContextMod.InliningMode
import typings.angularCompilerCli.typecheckSrcContextMod.TypeCheckingHost
import typings.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngtscTypecheckMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck", "TemplateTypeCheckerImpl")
  @js.native
  open class TemplateTypeCheckerImpl protected ()
    extends typings.angularCompilerCli.srcCheckerMod.TemplateTypeCheckerImpl {
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
      componentScopeReader: ComponentScopeReader,
      typeCheckScopeRegistry: TypeCheckScopeRegistry,
      perf: PerfRecorder
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck", "TypeCheckContextImpl")
  @js.native
  open class TypeCheckContextImpl protected ()
    extends typings.angularCompilerCli.typecheckSrcContextMod.TypeCheckContextImpl {
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
    extends typings.angularCompilerCli.shimMod.TypeCheckShimGenerator
  /* static members */
  object TypeCheckShimGenerator {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/typecheck", "TypeCheckShimGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def shimFor(fileName: AbsoluteFsPath): AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("shimFor")(fileName.asInstanceOf[js.Any]).asInstanceOf[AbsoluteFsPath]
  }
  
  inline def typeCheckFilePath(rootDirs: js.Array[AbsoluteFsPath]): AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("typeCheckFilePath")(rootDirs.asInstanceOf[js.Any]).asInstanceOf[AbsoluteFsPath]
}
