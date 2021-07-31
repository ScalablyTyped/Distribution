package typings.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait delegationStrategy extends StObject
@JSImport("aurelia-binding", "delegationStrategy")
@js.native
object delegationStrategy extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[delegationStrategy & Double] = js.native
  
  /**
    * Bubbling phase event delegation strategy.
    */
  @js.native
  sealed trait bubbling
    extends StObject
       with delegationStrategy
  /* 2 */ val bubbling: typings.aureliaBinding.mod.delegationStrategy.bubbling & Double = js.native
  
  /**
    * Capturing phase event delegation strategy.
    */
  @js.native
  sealed trait capturing
    extends StObject
       with delegationStrategy
  /* 1 */ val capturing: typings.aureliaBinding.mod.delegationStrategy.capturing & Double = js.native
  
  /**
    * No event delegation.
    */
  @js.native
  sealed trait none
    extends StObject
       with delegationStrategy
  /* 0 */ val none: typings.aureliaBinding.mod.delegationStrategy.none & Double = js.native
}
