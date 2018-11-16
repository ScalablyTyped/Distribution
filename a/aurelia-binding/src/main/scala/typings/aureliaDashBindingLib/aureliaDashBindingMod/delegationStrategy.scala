package typings
package aureliaDashBindingLib.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait delegationStrategy extends js.Object

@JSImport("aurelia-binding", "delegationStrategy")
@js.native
object delegationStrategy extends js.Object {
  /**
     * Bubbling phase event delegation strategy.
     */
  @js.native
  sealed trait bubbling
    extends aureliaDashBindingLib.aureliaDashBindingMod.delegationStrategy
  
  /**
     * Capturing phase event delegation strategy.
     */
  @js.native
  sealed trait capturing
    extends aureliaDashBindingLib.aureliaDashBindingMod.delegationStrategy
  
  /**
     * No event delegation.
     */
  @js.native
  sealed trait none
    extends aureliaDashBindingLib.aureliaDashBindingMod.delegationStrategy
  
  /* 2 */ val bubbling: bubbling with scala.Double = js.native
  /* 1 */ val capturing: capturing with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[aureliaDashBindingLib.aureliaDashBindingMod.delegationStrategy with scala.Double] = js.native
}

