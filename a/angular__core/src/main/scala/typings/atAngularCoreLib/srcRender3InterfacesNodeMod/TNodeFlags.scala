package typings
package atAngularCoreLib.srcRender3InterfacesNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TNodeFlags extends js.Object

@JSImport("@angular/core/src/render3/interfaces/node", "TNodeFlags")
@js.native
object TNodeFlags extends js.Object {
  /** This bit is set if the node has any directives that contain [class properties */
  @js.native
  sealed trait hasClassInput
    extends atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeFlags
  
  /** This bit is set if the node has any content queries */
  @js.native
  sealed trait hasContentQuery
    extends atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeFlags
  
  /** This bit is set if the node is a component */
  @js.native
  sealed trait isComponent
    extends atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeFlags
  
  /** This bit is set if the node has been projected */
  @js.native
  sealed trait isProjected
    extends atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeFlags
  
  /* 8 */ val hasClassInput: hasClassInput with scala.Double = js.native
  /* 4 */ val hasContentQuery: hasContentQuery with scala.Double = js.native
  /* 1 */ val isComponent: isComponent with scala.Double = js.native
  /* 2 */ val isProjected: isProjected with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeFlags with scala.Double] = js.native
}

