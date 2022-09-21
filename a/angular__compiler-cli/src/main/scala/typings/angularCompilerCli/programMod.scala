package typings.angularCompilerCli

import typings.angularCompilerCli.coreMod.NgCompiler
import typings.angularCompilerCli.indexerSrcApiMod.IndexedComponent
import typings.angularCompilerCli.optionsMod.NgCompilerOptions
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.angularCompilerCli.transformersApiMod.CompilerHost
import typings.angularCompilerCli.transformersApiMod.Program
import typings.std.Map
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object programMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/program", "NgtscProgram")
  @js.native
  open class NgtscProgram protected ()
    extends StObject
       with Program {
    def this(rootNames: js.Array[String], options: NgCompilerOptions, delegateHost: CompilerHost) = this()
    def this(
      rootNames: js.Array[String],
      options: NgCompilerOptions,
      delegateHost: CompilerHost,
      oldProgram: NgtscProgram
    ) = this()
    
    val compiler: NgCompiler = js.native
    
    /* private */ var emitXi18n: Any = js.native
    
    def getEmittedSourceFiles(): Map[String, SourceFile] = js.native
    
    def getIndexedComponents(): Map[DeclarationNode, IndexedComponent] = js.native
    
    def getReuseTsProgram(): typings.typescript.mod.Program = js.native
    
    /* private */ var host: Any = js.native
    
    /* private */ var incrementalStrategy: Any = js.native
    
    /* private */ var options: Any = js.native
    
    /**
      * The primary TypeScript program, which is used for analysis and emit.
      */
    /* private */ var tsProgram: Any = js.native
  }
}
