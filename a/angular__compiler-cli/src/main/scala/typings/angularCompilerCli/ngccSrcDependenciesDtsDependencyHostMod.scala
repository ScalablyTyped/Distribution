package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcDependenciesEsmDependencyHostMod.EsmDependencyHost
import typings.angularCompilerCli.ngccSrcPathMappingsMod.PathMappings
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcDependenciesDtsDependencyHostMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/dependencies/dts_dependency_host", "DtsDependencyHost")
  @js.native
  open class DtsDependencyHost protected () extends EsmDependencyHost {
    def this(fs: ReadonlyFileSystem) = this()
    def this(fs: ReadonlyFileSystem, pathMappings: PathMappings) = this()
  }
}
