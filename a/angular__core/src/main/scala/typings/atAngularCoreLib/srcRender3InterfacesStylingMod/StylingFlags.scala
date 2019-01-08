package typings
package atAngularCoreLib.srcRender3InterfacesStylingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StylingFlags extends js.Object

@JSImport("@angular/core/src/render3/interfaces/styling", "StylingFlags")
@js.native
object StylingFlags extends js.Object {
  @js.native
  sealed trait BindingAllocationLocked
    extends atAngularCoreLib.srcRender3InterfacesStylingMod.StylingFlags
  
  @js.native
  sealed trait BitCountSize
    extends atAngularCoreLib.srcRender3InterfacesStylingMod.StylingFlags
  
  @js.native
  sealed trait BitMask
    extends atAngularCoreLib.srcRender3InterfacesStylingMod.StylingFlags
  
  @js.native
  sealed trait Class
    extends atAngularCoreLib.srcRender3InterfacesStylingMod.StylingFlags
  
  @js.native
  sealed trait Dirty
    extends atAngularCoreLib.srcRender3InterfacesStylingMod.StylingFlags
  
  @js.native
  sealed trait None
    extends atAngularCoreLib.srcRender3InterfacesStylingMod.StylingFlags
  
  @js.native
  sealed trait OnlyProcessSingleClasses
    extends atAngularCoreLib.srcRender3InterfacesStylingMod.StylingFlags
  
  @js.native
  sealed trait PlayerBuildersDirty
    extends atAngularCoreLib.srcRender3InterfacesStylingMod.StylingFlags
  
  @js.native
  sealed trait Sanitize
    extends atAngularCoreLib.srcRender3InterfacesStylingMod.StylingFlags
  
  /* 32 */ val BindingAllocationLocked: BindingAllocationLocked with scala.Double = js.native
  /* 6 */ val BitCountSize: BitCountSize with scala.Double = js.native
  /* 63 */ val BitMask: BitMask with scala.Double = js.native
  /* 2 */ val Class: Class with scala.Double = js.native
  /* 1 */ val Dirty: Dirty with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 16 */ val OnlyProcessSingleClasses: OnlyProcessSingleClasses with scala.Double = js.native
  /* 8 */ val PlayerBuildersDirty: PlayerBuildersDirty with scala.Double = js.native
  /* 4 */ val Sanitize: Sanitize with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.srcRender3InterfacesStylingMod.StylingFlags with scala.Double] = js.native
}

