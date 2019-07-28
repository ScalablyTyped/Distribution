package typings.amphtmlDashValidator.amphtmlDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amphtml-validator", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getInstance(): js.Promise[Validator] = js.native
  def getInstance(validatorJs: String): js.Promise[Validator] = js.native
  def getInstance(validatorJs: String, userAgent: String): js.Promise[Validator] = js.native
  def newInstance(validatorJsContents: String): Validator = js.native
}

