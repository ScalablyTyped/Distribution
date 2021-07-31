package typings.angularQExtras

import typings.angularQExtras.mod.angularAugmentingMod.PromiseState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angularQExtrasStrings {
  
  @js.native
  sealed trait IQService extends StObject
  @scala.inline
  def IQService: IQService = "IQService".asInstanceOf[IQService]
  
  @js.native
  sealed trait fulfilled
    extends StObject
       with PromiseState
  @scala.inline
  def fulfilled: fulfilled = "fulfilled".asInstanceOf[fulfilled]
  
  @js.native
  sealed trait rejected
    extends StObject
       with PromiseState
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
}
