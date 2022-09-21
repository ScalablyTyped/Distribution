package typings.angularCompilerCli

import typings.angularCompilerCli.esmRenderingFormatterMod.EsmRenderingFormatter
import typings.angularCompilerCli.ngccHostMod.NgccReflectionHost
import typings.angularCompilerCli.srcTypesMod.PathManipulation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esm5RenderingFormatterMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/rendering/esm5_rendering_formatter", "Esm5RenderingFormatter")
  @js.native
  open class Esm5RenderingFormatter protected () extends EsmRenderingFormatter {
    def this(fs: PathManipulation, host: NgccReflectionHost, isCore: Boolean) = this()
  }
}
