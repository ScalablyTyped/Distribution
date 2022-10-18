package typings.angularCli.libConfigWorkspaceSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ViewEncapsulation extends StObject
@JSImport("@angular/cli/lib/config/workspace-schema", "ViewEncapsulation")
@js.native
object ViewEncapsulation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ViewEncapsulation & String] = js.native
  
  @js.native
  sealed trait Emulated
    extends StObject
       with ViewEncapsulation
  /* "Emulated" */ val Emulated: typings.angularCli.libConfigWorkspaceSchemaMod.ViewEncapsulation.Emulated & String = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ViewEncapsulation
  /* "None" */ val None: typings.angularCli.libConfigWorkspaceSchemaMod.ViewEncapsulation.None & String = js.native
  
  @js.native
  sealed trait ShadowDom
    extends StObject
       with ViewEncapsulation
  /* "ShadowDom" */ val ShadowDom: typings.angularCli.libConfigWorkspaceSchemaMod.ViewEncapsulation.ShadowDom & String = js.native
}
