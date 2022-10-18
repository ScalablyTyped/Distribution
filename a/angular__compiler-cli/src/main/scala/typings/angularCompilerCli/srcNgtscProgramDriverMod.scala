package typings.angularCompilerCli

import typings.typescript.mod.CompilerHost
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscProgramDriverMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/program_driver", "NgOriginalFile")
  @js.native
  val NgOriginalFile: js.Symbol = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/program_driver", "TsCreateProgramDriver")
  @js.native
  open class TsCreateProgramDriver protected ()
    extends typings.angularCompilerCli.srcNgtscProgramDriverSrcTsCreateProgramDriverMod.TsCreateProgramDriver {
    def this(
      originalProgram: Program,
      originalHost: CompilerHost,
      options: CompilerOptions,
      shimExtensionPrefixes: js.Array[String]
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/program_driver", "UpdateMode")
  @js.native
  object UpdateMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.srcNgtscProgramDriverSrcApiMod.UpdateMode & Double] = js.native
    
    /* 0 */ val Complete: typings.angularCompilerCli.srcNgtscProgramDriverSrcApiMod.UpdateMode.Complete & Double = js.native
    
    /* 1 */ val Incremental: typings.angularCompilerCli.srcNgtscProgramDriverSrcApiMod.UpdateMode.Incremental & Double = js.native
  }
}
