package typings.angularCompilerCli

import typings.angularCompilerCli.writingPackageJsonUpdaterMod.PackageJsonUpdater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packageJsonUpdaterMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/execution/cluster/package_json_updater", "ClusterWorkerPackageJsonUpdater")
  @js.native
  open class ClusterWorkerPackageJsonUpdater ()
    extends StObject
       with PackageJsonUpdater
}
