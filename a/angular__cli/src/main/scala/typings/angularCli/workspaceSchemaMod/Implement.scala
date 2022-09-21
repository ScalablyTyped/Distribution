package typings.angularCli.workspaceSchemaMod

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
  /* "CanActivate" */ val CanActivate: typings.angularCli.workspaceSchemaMod.Implement.CanActivate & String = js.native
  
  @js.native
  sealed trait CanActivateChild
    extends StObject
       with Implement
  /* "CanActivateChild" */ val CanActivateChild: typings.angularCli.workspaceSchemaMod.Implement.CanActivateChild & String = js.native
  
  @js.native
  sealed trait CanDeactivate
    extends StObject
       with Implement
  /* "CanDeactivate" */ val CanDeactivate: typings.angularCli.workspaceSchemaMod.Implement.CanDeactivate & String = js.native
  
  @js.native
  sealed trait CanLoad
    extends StObject
       with Implement
  /* "CanLoad" */ val CanLoad: typings.angularCli.workspaceSchemaMod.Implement.CanLoad & String = js.native
}
