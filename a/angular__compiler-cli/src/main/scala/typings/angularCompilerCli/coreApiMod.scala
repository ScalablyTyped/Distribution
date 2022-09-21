package typings.angularCompilerCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreApiMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/core/api", "DiagnosticCategoryLabel")
  @js.native
  object DiagnosticCategoryLabel extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.angularCompilerCli.publicOptionsMod.DiagnosticCategoryLabel & String] = js.native
    
    /* "error" */ val Error: typings.angularCompilerCli.publicOptionsMod.DiagnosticCategoryLabel.Error & String = js.native
    
    /* "suppress" */ val Suppress: typings.angularCompilerCli.publicOptionsMod.DiagnosticCategoryLabel.Suppress & String = js.native
    
    /* "warning" */ val Warning: typings.angularCompilerCli.publicOptionsMod.DiagnosticCategoryLabel.Warning & String = js.native
  }
}
