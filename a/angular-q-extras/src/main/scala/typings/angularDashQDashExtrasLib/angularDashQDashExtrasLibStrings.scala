package typings
package angularDashQDashExtrasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object angularDashQDashExtrasLibStrings {
  @js.native
  sealed trait IQService extends js.Object
  
  @js.native
  sealed trait fulfilled
    extends angularDashQDashExtrasLib.angularDashQDashExtrasMod.angularMod.PromiseState
  
  @js.native
  sealed trait rejected
    extends angularDashQDashExtrasLib.angularDashQDashExtrasMod.angularMod.PromiseState
  
  @scala.inline
  def IQService: IQService = "IQService".asInstanceOf[IQService]
  @scala.inline
  def fulfilled: fulfilled = "fulfilled".asInstanceOf[fulfilled]
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
}

