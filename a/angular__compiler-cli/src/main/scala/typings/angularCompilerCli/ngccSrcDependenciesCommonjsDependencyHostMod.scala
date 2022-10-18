package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcDependenciesDependencyHostMod.DependencyHostBase
import typings.angularCompilerCli.ngccSrcDependenciesModuleResolverMod.ModuleResolver
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcDependenciesCommonjsDependencyHostMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/dependencies/commonjs_dependency_host", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/dependencies/commonjs_dependency_host", "CommonJsDependencyHost")
  @js.native
  open class CommonJsDependencyHost protected () extends DependencyHostBase {
    def this(fs: ReadonlyFileSystem, moduleResolver: ModuleResolver) = this()
  }
  
  inline def hasRequireCalls(source: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasRequireCalls")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
