package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcDependenciesDependencyHostMod.DependencyHostBase
import typings.angularCompilerCli.ngccSrcDependenciesModuleResolverMod.ModuleResolver
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcDependenciesUmdDependencyHostMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/dependencies/umd_dependency_host", "UmdDependencyHost")
  @js.native
  open class UmdDependencyHost protected () extends DependencyHostBase {
    def this(fs: ReadonlyFileSystem, moduleResolver: ModuleResolver) = this()
  }
}
