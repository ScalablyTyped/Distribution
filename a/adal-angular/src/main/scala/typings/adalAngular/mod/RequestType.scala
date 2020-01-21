package typings.adalAngular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.adalAngular.adalAngularStrings.LOGIN
  - typings.adalAngular.adalAngularStrings.RENEW_TOKEN
  - typings.adalAngular.adalAngularStrings.UNKNOWN
*/
trait RequestType extends js.Object

object RequestType {
  @scala.inline
  def LOGIN: typings.adalAngular.adalAngularStrings.LOGIN = this.cast("LOGIN")
  @scala.inline
  def RENEW_TOKEN: typings.adalAngular.adalAngularStrings.RENEW_TOKEN = this.cast("RENEW_TOKEN")
  @scala.inline
  def UNKNOWN: typings.adalAngular.adalAngularStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

