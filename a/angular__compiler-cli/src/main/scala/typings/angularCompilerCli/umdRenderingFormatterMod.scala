package typings.angularCompilerCli

import typings.angularCompilerCli.esm5RenderingFormatterMod.Esm5RenderingFormatter
import typings.angularCompilerCli.srcTypesMod.PathManipulation
import typings.angularCompilerCli.umdHostMod.UmdReflectionHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object umdRenderingFormatterMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/rendering/umd_rendering_formatter", "UmdRenderingFormatter")
  @js.native
  open class UmdRenderingFormatter protected () extends Esm5RenderingFormatter {
    def this(fs: PathManipulation, umdHost: UmdReflectionHost, isCore: Boolean) = this()
    
    /* protected */ var umdHost: UmdReflectionHost = js.native
  }
}
