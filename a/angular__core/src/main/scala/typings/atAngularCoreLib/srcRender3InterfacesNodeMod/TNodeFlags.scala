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
  /** The number of directives on this node is encoded on the least significant bits */
  @js.native
  sealed trait DirectiveCountMask
    extends atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeFlags
  
  /** The index of the first directive on this node is encoded on the most significant bits  */
  @js.native
  sealed trait DirectiveStartingIndexShift
    extends atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeFlags
  
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
  
  /* 4095 */ val DirectiveCountMask: DirectiveCountMask with scala.Double = js.native
  /* 16 */ val DirectiveStartingIndexShift: DirectiveStartingIndexShift with scala.Double = js.native
  /* 32768 */ val hasClassInput: hasClassInput with scala.Double = js.native
  /* 16384 */ val hasContentQuery: hasContentQuery with scala.Double = js.native
  /* 4096 */ val isComponent: isComponent with scala.Double = js.native
  /* 8192 */ val isProjected: isProjected with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeFlags with scala.Double] = js.native
}

