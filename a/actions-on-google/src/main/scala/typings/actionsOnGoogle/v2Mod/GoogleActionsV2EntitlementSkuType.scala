package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.actionsOnGoogle.actionsOnGoogleStrings.TYPE_UNSPECIFIED
  - typings.actionsOnGoogle.actionsOnGoogleStrings.IN_APP
  - typings.actionsOnGoogle.actionsOnGoogleStrings.SUBSCRIPTION
  - typings.actionsOnGoogle.actionsOnGoogleStrings.APP
*/
trait GoogleActionsV2EntitlementSkuType extends js.Object

object GoogleActionsV2EntitlementSkuType {
  @scala.inline
  def APP: typings.actionsOnGoogle.actionsOnGoogleStrings.APP = this.cast("APP")
  @scala.inline
  def IN_APP: typings.actionsOnGoogle.actionsOnGoogleStrings.IN_APP = this.cast("IN_APP")
  @scala.inline
  def SUBSCRIPTION: typings.actionsOnGoogle.actionsOnGoogleStrings.SUBSCRIPTION = this.cast("SUBSCRIPTION")
  @scala.inline
  def TYPE_UNSPECIFIED: typings.actionsOnGoogle.actionsOnGoogleStrings.TYPE_UNSPECIFIED = this.cast("TYPE_UNSPECIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

