package typings.angularRouter

import typings.angularRouter.mod.InitialNavigation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object angularRouterBooleans {
  @js.native
  sealed trait `false` extends InitialNavigation
  
  @js.native
  sealed trait `true` extends InitialNavigation
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

