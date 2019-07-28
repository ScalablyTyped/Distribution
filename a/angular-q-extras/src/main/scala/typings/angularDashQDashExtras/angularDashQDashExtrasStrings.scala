package typings.angularDashQDashExtras

import typings.angularDashQDashExtras.angularDashQDashExtrasMod.angularMod.PromiseState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object angularDashQDashExtrasStrings {
  @js.native
  sealed trait IQService extends js.Object
  
  @js.native
  sealed trait fulfilled extends PromiseState
  
  @js.native
  sealed trait rejected extends PromiseState
  
  @scala.inline
  def IQService: IQService = "IQService".asInstanceOf[IQService]
  @scala.inline
  def fulfilled: fulfilled = "fulfilled".asInstanceOf[fulfilled]
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
}

