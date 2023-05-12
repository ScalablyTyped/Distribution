package typings.angularCli.libConfigWorkspaceSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Implement extends StObject
@JSImport("@angular/cli/lib/config/workspace-schema", "Implement")
@js.native
object Implement extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Implement & String] = js.native
  
  @js.native
  sealed trait CanActivate
    extends StObject
       with Implement
  /* "CanActivate" */ val CanActivate: typings.angularCli.libConfigWorkspaceSchemaMod.Implement.CanActivate & String = js.native
  
  @js.native
  sealed trait CanActivateChild
    extends StObject
       with Implement
  /* "CanActivateChild" */ val CanActivateChild: typings.angularCli.libConfigWorkspaceSchemaMod.Implement.CanActivateChild & String = js.native
  
  @js.native
  sealed trait CanDeactivate
    extends StObject
       with Implement
  /* "CanDeactivate" */ val CanDeactivate: typings.angularCli.libConfigWorkspaceSchemaMod.Implement.CanDeactivate & String = js.native
  
  @js.native
  sealed trait CanMatch
    extends StObject
       with Implement
  /* "CanMatch" */ val CanMatch: typings.angularCli.libConfigWorkspaceSchemaMod.Implement.CanMatch & String = js.native
}
