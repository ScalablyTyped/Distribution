package typings.angularCompilerCli

import typings.angularCompilerCli.anon.ModuleResolutionHostPickC
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ModuleResolutionCache
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolverMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports/src/resolver", "ModuleResolver")
  @js.native
  open class ModuleResolver protected () extends StObject {
    def this(program: Program, compilerOptions: CompilerOptions, host: ModuleResolutionHostPickC) = this()
    def this(
      program: Program,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHostPickC,
      moduleResolutionCache: ModuleResolutionCache
    ) = this()
    
    /* private */ var compilerOptions: Any = js.native
    
    /* private */ var host: Any = js.native
    
    /* private */ var moduleResolutionCache: Any = js.native
    
    /* private */ var program: Any = js.native
    
    def resolveModule(moduleName: String, containingFile: String): SourceFile | Null = js.native
  }
}
