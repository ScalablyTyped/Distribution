package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TNodeFlags extends js.Object

/**
  * Corresponds to the TNode.flags property.
  */
@JSImport("@angular/core", "TNodeFlags")
@js.native
object TNodeFlags extends js.Object {
  /** This bit is set if the node has any "class" inputs */
  @js.native
  sealed trait hasClassInput
    extends atAngularCoreLib.atAngularCoreMod.TNodeFlags
  
  /** This bit is set if any directive on this node has content queries */
  @js.native
  sealed trait hasContentQuery
    extends atAngularCoreLib.atAngularCoreMod.TNodeFlags
  
  /** This bit is set if the node has any "style" inputs */
  @js.native
  sealed trait hasStyleInput
    extends atAngularCoreLib.atAngularCoreMod.TNodeFlags
  
  /** This bit is set if the node is a component */
  @js.native
  sealed trait isComponent
    extends atAngularCoreLib.atAngularCoreMod.TNodeFlags
  
  /** This bit is set if the node has been projected */
  @js.native
  sealed trait isProjected
    extends atAngularCoreLib.atAngularCoreMod.TNodeFlags
  
}

