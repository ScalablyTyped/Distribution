package typings.aureliaBinding.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait delegationStrategy extends js.Object
@JSImport("aurelia-binding", "delegationStrategy")
@js.native
object delegationStrategy extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[delegationStrategy with Double] = js.native
  
  /**
    * Bubbling phase event delegation strategy.
    */
  @js.native
  sealed trait bubbling extends delegationStrategy
  /* 2 */ @js.native
  object bubbling extends TopLevel[bubbling with Double]
  
  /**
    * Capturing phase event delegation strategy.
    */
  @js.native
  sealed trait capturing extends delegationStrategy
  /* 1 */ @js.native
  object capturing extends TopLevel[capturing with Double]
  
  /**
    * No event delegation.
    */
  @js.native
  sealed trait none extends delegationStrategy
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
}
