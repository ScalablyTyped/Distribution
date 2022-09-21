package typings.angularCompilerCli

import typings.angularCompilerCli.esm5RenderingFormatterMod.Esm5RenderingFormatter
import typings.angularCompilerCli.ngccHostMod.NgccReflectionHost
import typings.angularCompilerCli.srcTypesMod.PathManipulation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonjsRenderingFormatterMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/rendering/commonjs_rendering_formatter", "CommonJsRenderingFormatter")
  @js.native
  open class CommonJsRenderingFormatter protected () extends Esm5RenderingFormatter {
    def this(fs: PathManipulation, commonJsHost: NgccReflectionHost, isCore: Boolean) = this()
    
    /* protected */ var commonJsHost: NgccReflectionHost = js.native
  }
}
