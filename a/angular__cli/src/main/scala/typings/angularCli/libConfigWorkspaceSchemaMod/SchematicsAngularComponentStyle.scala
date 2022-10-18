package typings.angularCli.libConfigWorkspaceSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SchematicsAngularComponentStyle extends StObject
@JSImport("@angular/cli/lib/config/workspace-schema", "SchematicsAngularComponentStyle")
@js.native
object SchematicsAngularComponentStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SchematicsAngularComponentStyle & String] = js.native
  
  @js.native
  sealed trait Css
    extends StObject
       with SchematicsAngularComponentStyle
  /* "css" */ val Css: typings.angularCli.libConfigWorkspaceSchemaMod.SchematicsAngularComponentStyle.Css & String = js.native
  
  @js.native
  sealed trait Less
    extends StObject
       with SchematicsAngularComponentStyle
  /* "less" */ val Less: typings.angularCli.libConfigWorkspaceSchemaMod.SchematicsAngularComponentStyle.Less & String = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with SchematicsAngularComponentStyle
  /* "none" */ val None: typings.angularCli.libConfigWorkspaceSchemaMod.SchematicsAngularComponentStyle.None & String = js.native
  
  @js.native
  sealed trait Sass
    extends StObject
       with SchematicsAngularComponentStyle
  /* "sass" */ val Sass: typings.angularCli.libConfigWorkspaceSchemaMod.SchematicsAngularComponentStyle.Sass & String = js.native
  
  @js.native
  sealed trait Scss
    extends StObject
       with SchematicsAngularComponentStyle
  /* "scss" */ val Scss: typings.angularCli.libConfigWorkspaceSchemaMod.SchematicsAngularComponentStyle.Scss & String = js.native
}
