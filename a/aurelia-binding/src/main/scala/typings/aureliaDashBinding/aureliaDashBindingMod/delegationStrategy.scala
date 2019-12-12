package typings.aureliaDashBinding.aureliaDashBindingMod

import org.scalablytyped.runtime.TopLevel
import typings.aureliaDashBinding.aureliaDashBindingMod.delegationStrategy.bubbling
import typings.aureliaDashBinding.aureliaDashBindingMod.delegationStrategy.capturing
import typings.aureliaDashBinding.aureliaDashBindingMod.delegationStrategy.none
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[delegationStrategy with Double] = js.native
  /* 2 */ @js.native
  object bubbling extends TopLevel[bubbling with Double]
  
  /* 1 */ @js.native
  object capturing extends TopLevel[capturing with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

