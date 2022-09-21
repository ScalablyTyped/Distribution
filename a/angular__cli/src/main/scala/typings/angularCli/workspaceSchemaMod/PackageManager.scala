package typings.angularCli.workspaceSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PackageManager extends StObject
@JSImport("@angular/cli/lib/config/workspace-schema", "PackageManager")
@js.native
object PackageManager extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PackageManager & String] = js.native
  
  @js.native
  sealed trait Cnpm
    extends StObject
       with PackageManager
  /* "cnpm" */ val Cnpm: typings.angularCli.workspaceSchemaMod.PackageManager.Cnpm & String = js.native
  
  @js.native
  sealed trait Npm
    extends StObject
       with PackageManager
  /* "npm" */ val Npm: typings.angularCli.workspaceSchemaMod.PackageManager.Npm & String = js.native
  
  @js.native
  sealed trait Pnpm
    extends StObject
       with PackageManager
  /* "pnpm" */ val Pnpm: typings.angularCli.workspaceSchemaMod.PackageManager.Pnpm & String = js.native
  
  @js.native
  sealed trait Yarn
    extends StObject
       with PackageManager
  /* "yarn" */ val Yarn: typings.angularCli.workspaceSchemaMod.PackageManager.Yarn & String = js.native
}
