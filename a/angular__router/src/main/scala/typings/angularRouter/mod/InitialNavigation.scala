package typings.angularRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.angularRouter.angularRouterBooleans.`true`
  - typings.angularRouter.angularRouterBooleans.`false`
  - typings.angularRouter.angularRouterStrings.enabled
  - typings.angularRouter.angularRouterStrings.disabled
  - typings.angularRouter.angularRouterStrings.legacy_enabled
  - typings.angularRouter.angularRouterStrings.legacy_disabled
*/
trait InitialNavigation extends js.Object

object InitialNavigation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disabled: typings.angularRouter.angularRouterStrings.disabled = this.cast("disabled")
  @scala.inline
  def enabled: typings.angularRouter.angularRouterStrings.enabled = this.cast("enabled")
  @scala.inline
  def `false`: typings.angularRouter.angularRouterBooleans.`false` = this.cast(false)
  @scala.inline
  def legacy_disabled: typings.angularRouter.angularRouterStrings.legacy_disabled = this.cast("legacy_disabled")
  @scala.inline
  def legacy_enabled: typings.angularRouter.angularRouterStrings.legacy_enabled = this.cast("legacy_enabled")
  @scala.inline
  def `true`: typings.angularRouter.angularRouterBooleans.`true` = this.cast(true)
}

