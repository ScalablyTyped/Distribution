package typings.amphtmlValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amphtml-validator", "getInstance")
@js.native
object getInstance extends js.Object {
  def apply(): js.Promise[Validator] = js.native
  def apply(validatorJs: js.UndefOr[scala.Nothing], userAgent: String): js.Promise[Validator] = js.native
  def apply(validatorJs: String): js.Promise[Validator] = js.native
  def apply(validatorJs: String, userAgent: String): js.Promise[Validator] = js.native
}

