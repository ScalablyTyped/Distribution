package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscCoreApiSrcAdapterMod.NgCompilerAdapter
import typings.typescript.mod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscResourceMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/resource", "AdapterResourceLoader")
  @js.native
  open class AdapterResourceLoader protected ()
    extends typings.angularCompilerCli.srcNgtscResourceSrcLoaderMod.AdapterResourceLoader {
    def this(adapter: NgCompilerAdapter, options: CompilerOptions) = this()
  }
}
