package typings.angularCompilerCli

import typings.angularCompilerCli.adapterMod.NgCompilerAdapter
import typings.typescript.mod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/resource", "AdapterResourceLoader")
  @js.native
  open class AdapterResourceLoader protected ()
    extends typings.angularCompilerCli.loaderMod.AdapterResourceLoader {
    def this(adapter: NgCompilerAdapter, options: CompilerOptions) = this()
  }
}
