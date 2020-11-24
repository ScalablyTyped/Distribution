package typings.angularQExtras

import typings.angularQExtras.mod.angularAugmentingMod.PromiseState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angularQExtrasStrings {
  
  @scala.inline
  def IQService: IQService = "IQService".asInstanceOf[IQService]
  
  @scala.inline
  def fulfilled: fulfilled = "fulfilled".asInstanceOf[fulfilled]
  
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
  
  @js.native
  sealed trait IQService extends js.Object
  
  @js.native
  sealed trait fulfilled extends PromiseState
  
  @js.native
  sealed trait rejected extends PromiseState
}
