package typings
package atAngularCoreLib.srcRender3InterfacesNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TNodeProviderIndexes extends js.Object

@JSImport("@angular/core/src/render3/interfaces/node", "TNodeProviderIndexes")
@js.native
object TNodeProviderIndexes extends js.Object {
  /** The count of view providers from the component on this node is encoded on the 16 most
         significant bits */
  @js.native
  sealed trait CptViewProvidersCountShift
    extends atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeProviderIndexes
  
  @js.native
  sealed trait CptViewProvidersCountShifter
    extends atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeProviderIndexes
  
  /** The index of the first provider on this node is encoded on the least significant bits */
  @js.native
  sealed trait ProvidersStartIndexMask
    extends atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeProviderIndexes
  
  /* 16 */ val CptViewProvidersCountShift: CptViewProvidersCountShift with scala.Double = js.native
  /* 65536 */ val CptViewProvidersCountShifter: CptViewProvidersCountShifter with scala.Double = js.native
  /* 65535 */ val ProvidersStartIndexMask: ProvidersStartIndexMask with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeProviderIndexes with scala.Double
  ] = js.native
}

