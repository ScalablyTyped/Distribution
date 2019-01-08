package typings
package atAngularCoreLib.srcRender3InterfacesInjectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RelativeInjectorLocationFlags extends js.Object

@JSImport("@angular/core/src/render3/interfaces/injector", "RelativeInjectorLocationFlags")
@js.native
object RelativeInjectorLocationFlags extends js.Object {
  @js.native
  sealed trait InjectorIndexMask
    extends atAngularCoreLib.srcRender3InterfacesInjectorMod.RelativeInjectorLocationFlags
  
  @js.native
  sealed trait NO_PARENT
    extends atAngularCoreLib.srcRender3InterfacesInjectorMod.RelativeInjectorLocationFlags
  
  @js.native
  sealed trait ViewOffsetShift
    extends atAngularCoreLib.srcRender3InterfacesInjectorMod.RelativeInjectorLocationFlags
  
  /* 32767 */ val InjectorIndexMask: InjectorIndexMask with scala.Double = js.native
  /* -1 */ val NO_PARENT: NO_PARENT with scala.Double = js.native
  /* 16 */ val ViewOffsetShift: ViewOffsetShift with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCoreLib.srcRender3InterfacesInjectorMod.RelativeInjectorLocationFlags with scala.Double
  ] = js.native
}

