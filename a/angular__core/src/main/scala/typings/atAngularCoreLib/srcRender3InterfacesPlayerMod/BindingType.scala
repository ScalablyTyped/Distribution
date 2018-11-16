package typings
package atAngularCoreLib.srcRender3InterfacesPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BindingType extends js.Object

@JSImport("@angular/core/src/render3/interfaces/player", "BindingType")
@js.native
object BindingType extends js.Object {
  @js.native
  sealed trait Class
    extends atAngularCoreLib.srcRender3InterfacesPlayerMod.BindingType
  
  @js.native
  sealed trait Style
    extends atAngularCoreLib.srcRender3InterfacesPlayerMod.BindingType
  
  @js.native
  sealed trait Unset
    extends atAngularCoreLib.srcRender3InterfacesPlayerMod.BindingType
  
  /* 2 */ val Class: Class with scala.Double = js.native
  /* 3 */ val Style: Style with scala.Double = js.native
  /* 0 */ val Unset: Unset with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.srcRender3InterfacesPlayerMod.BindingType with scala.Double] = js.native
}

