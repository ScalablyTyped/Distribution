package typings.angularCompilerCli

import typings.angularCompilerCli.esmDependencyHostMod.EsmDependencyHost
import typings.angularCompilerCli.pathMappingsMod.PathMappings
import typings.angularCompilerCli.srcTypesMod.ReadonlyFileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtsDependencyHostMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/dependencies/dts_dependency_host", "DtsDependencyHost")
  @js.native
  open class DtsDependencyHost protected () extends EsmDependencyHost {
    def this(fs: ReadonlyFileSystem) = this()
    def this(fs: ReadonlyFileSystem, pathMappings: PathMappings) = this()
  }
}
