package typings.aureliaDashBinding.aureliaDashBindingMod

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
  sealed trait bubbling extends delegationStrategy
  
  /**
    * Capturing phase event delegation strategy.
    */
  @js.native
  sealed trait capturing extends delegationStrategy
  
  /**
    * No event delegation.
    */
  @js.native
  sealed trait none extends delegationStrategy
  
  /* 2 */ val bubbling: typings.aureliaDashBinding.aureliaDashBindingMod.delegationStrategy.bubbling with Double = js.native
  /* 1 */ val capturing: typings.aureliaDashBinding.aureliaDashBindingMod.delegationStrategy.capturing with Double = js.native
  /* 0 */ val none: typings.aureliaDashBinding.aureliaDashBindingMod.delegationStrategy.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[delegationStrategy with Double] = js.native
}

