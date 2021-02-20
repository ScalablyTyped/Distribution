package typings.angularCore

import typings.angularCore.anon.Compiler
import typings.typescript.mod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createNgcProgramMod {
  
  @JSImport("@angular/core/schematics/migrations/undecorated-classes-with-di/create_ngc_program", "createNgcProgram")
  @js.native
  def createNgcProgram(
    createHost: js.Function1[
      /* options */ CompilerOptions, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompilerHost */ _
    ],
    tsconfigPath: String
  ): Compiler = js.native
}
