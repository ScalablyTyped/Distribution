package typings.angularCompilerCli

import typings.angularCompilerCli.fileSystemMod.NgtscCompilerHost
import typings.angularCompilerCli.sourceFileCacheMod.EntryPointFileCache
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcTypesMod.FileSystem
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ModuleResolutionCache
import typings.typescript.mod.ResolvedModule
import typings.typescript.mod.ResolvedProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccCompilerHostMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/ngcc_compiler_host", "NgccDtsCompilerHost")
  @js.native
  open class NgccDtsCompilerHost protected () extends NgtscCompilerHost {
    def this(
      fs: FileSystem,
      options: CompilerOptions,
      cache: EntryPointFileCache,
      moduleResolutionCache: ModuleResolutionCache
    ) = this()
    
    /* private */ var cache: Any = js.native
    
    /* private */ var moduleResolutionCache: Any = js.native
    
    @JSName("resolveModuleNames")
    def resolveModuleNames_MNgccDtsCompilerHost(moduleNames: js.Array[String], containingFile: String): js.Array[js.UndefOr[ResolvedModule]] = js.native
    @JSName("resolveModuleNames")
    def resolveModuleNames_MNgccDtsCompilerHost(moduleNames: js.Array[String], containingFile: String, reusedNames: js.Array[String]): js.Array[js.UndefOr[ResolvedModule]] = js.native
    @JSName("resolveModuleNames")
    def resolveModuleNames_MNgccDtsCompilerHost(
      moduleNames: js.Array[String],
      containingFile: String,
      reusedNames: js.Array[String],
      redirectedReference: ResolvedProjectReference
    ): js.Array[js.UndefOr[ResolvedModule]] = js.native
    @JSName("resolveModuleNames")
    def resolveModuleNames_MNgccDtsCompilerHost(
      moduleNames: js.Array[String],
      containingFile: String,
      reusedNames: Unit,
      redirectedReference: ResolvedProjectReference
    ): js.Array[js.UndefOr[ResolvedModule]] = js.native
  }
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/ngcc_compiler_host", "NgccSourcesCompilerHost")
  @js.native
  open class NgccSourcesCompilerHost protected () extends NgtscCompilerHost {
    def this(
      fs: FileSystem,
      options: CompilerOptions,
      cache: EntryPointFileCache,
      moduleResolutionCache: ModuleResolutionCache,
      packagePath: AbsoluteFsPath
    ) = this()
    
    /* private */ var cache: Any = js.native
    
    /* private */ var moduleResolutionCache: Any = js.native
    
    /* protected */ var packagePath: AbsoluteFsPath = js.native
    
    @JSName("resolveModuleNames")
    def resolveModuleNames_MNgccSourcesCompilerHost(moduleNames: js.Array[String], containingFile: String): js.Array[js.UndefOr[ResolvedModule]] = js.native
    @JSName("resolveModuleNames")
    def resolveModuleNames_MNgccSourcesCompilerHost(moduleNames: js.Array[String], containingFile: String, reusedNames: js.Array[String]): js.Array[js.UndefOr[ResolvedModule]] = js.native
    @JSName("resolveModuleNames")
    def resolveModuleNames_MNgccSourcesCompilerHost(
      moduleNames: js.Array[String],
      containingFile: String,
      reusedNames: js.Array[String],
      redirectedReference: ResolvedProjectReference
    ): js.Array[js.UndefOr[ResolvedModule]] = js.native
    @JSName("resolveModuleNames")
    def resolveModuleNames_MNgccSourcesCompilerHost(
      moduleNames: js.Array[String],
      containingFile: String,
      reusedNames: Unit,
      redirectedReference: ResolvedProjectReference
    ): js.Array[js.UndefOr[ResolvedModule]] = js.native
  }
}
