package typings.angularCompilerCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscCoreApiMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/core/api", "DiagnosticCategoryLabel")
  @js.native
  object DiagnosticCategoryLabel extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.angularCompilerCli.srcNgtscCoreApiSrcPublicOptionsMod.DiagnosticCategoryLabel & String
      ] = js.native
    
    /* "error" */ val Error: typings.angularCompilerCli.srcNgtscCoreApiSrcPublicOptionsMod.DiagnosticCategoryLabel.Error & String = js.native
    
    /* "suppress" */ val Suppress: typings.angularCompilerCli.srcNgtscCoreApiSrcPublicOptionsMod.DiagnosticCategoryLabel.Suppress & String = js.native
    
    /* "warning" */ val Warning: typings.angularCompilerCli.srcNgtscCoreApiSrcPublicOptionsMod.DiagnosticCategoryLabel.Warning & String = js.native
  }
}
