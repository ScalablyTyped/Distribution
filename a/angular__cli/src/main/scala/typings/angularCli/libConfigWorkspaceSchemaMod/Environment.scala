package typings.angularCli.libConfigWorkspaceSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Environment extends StObject
@JSImport("@angular/cli/lib/config/workspace-schema", "Environment")
@js.native
object Environment extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Environment & String] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with Environment
  /* "all" */ val All: typings.angularCli.libConfigWorkspaceSchemaMod.Environment.All & String = js.native
  
  @js.native
  sealed trait Ci
    extends StObject
       with Environment
  /* "ci" */ val Ci: typings.angularCli.libConfigWorkspaceSchemaMod.Environment.Ci & String = js.native
  
  @js.native
  sealed trait Local
    extends StObject
       with Environment
  /* "local" */ val Local: typings.angularCli.libConfigWorkspaceSchemaMod.Environment.Local & String = js.native
}
