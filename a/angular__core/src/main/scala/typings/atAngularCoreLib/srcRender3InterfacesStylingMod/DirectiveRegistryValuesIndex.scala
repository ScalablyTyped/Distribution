package typings
package atAngularCoreLib.srcRender3InterfacesStylingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DirectiveRegistryValuesIndex extends js.Object

@JSImport("@angular/core/src/render3/interfaces/styling", "DirectiveRegistryValuesIndex")
@js.native
object DirectiveRegistryValuesIndex extends js.Object {
  @js.native
  sealed trait DirectiveValueOffset
    extends atAngularCoreLib.srcRender3InterfacesStylingMod.DirectiveRegistryValuesIndex
  
  @js.native
  sealed trait DirtyFlagOffset
    extends atAngularCoreLib.srcRender3InterfacesStylingMod.DirectiveRegistryValuesIndex
  
  @js.native
  sealed trait SinglePropValuesIndexOffset
    extends atAngularCoreLib.srcRender3InterfacesStylingMod.DirectiveRegistryValuesIndex
  
  @js.native
  sealed trait Size
    extends atAngularCoreLib.srcRender3InterfacesStylingMod.DirectiveRegistryValuesIndex
  
  @js.native
  sealed trait StyleSanitizerOffset
    extends atAngularCoreLib.srcRender3InterfacesStylingMod.DirectiveRegistryValuesIndex
  
  /* 0 */ val DirectiveValueOffset: DirectiveValueOffset with scala.Double = js.native
  /* 2 */ val DirtyFlagOffset: DirtyFlagOffset with scala.Double = js.native
  /* 1 */ val SinglePropValuesIndexOffset: SinglePropValuesIndexOffset with scala.Double = js.native
  /* 4 */ val Size: Size with scala.Double = js.native
  /* 3 */ val StyleSanitizerOffset: StyleSanitizerOffset with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCoreLib.srcRender3InterfacesStylingMod.DirectiveRegistryValuesIndex with scala.Double
  ] = js.native
}

