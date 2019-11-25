package typings.adalDashAngular.adalDashAngularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.adalDashAngular.adalDashAngularStrings.LOGIN
  - typings.adalDashAngular.adalDashAngularStrings.RENEW_TOKEN
  - typings.adalDashAngular.adalDashAngularStrings.UNKNOWN
*/
trait RequestType extends js.Object

object RequestType {
  @scala.inline
  def LOGIN: typings.adalDashAngular.adalDashAngularStrings.LOGIN = this.cast("LOGIN")
  @scala.inline
  def RENEW_TOKEN: typings.adalDashAngular.adalDashAngularStrings.RENEW_TOKEN = this.cast("RENEW_TOKEN")
  @scala.inline
  def UNKNOWN: typings.adalDashAngular.adalDashAngularStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

