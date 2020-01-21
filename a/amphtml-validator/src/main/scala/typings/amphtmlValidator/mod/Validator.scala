package typings.amphtmlValidator.mod

import typings.node.vmMod.Context
import typings.node.vmMod.Script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amphtml-validator", "Validator")
@js.native
class Validator () extends Script {
  var sandbox: Context = js.native
  def validateString(stringToValidate: String): ValidationResult = js.native
  def validateString(stringToValidate: String, htmlFormat: String): ValidationResult = js.native
}

