package typings.ajv.mod

import typings.ajv.ajvStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFormatDefinition extends FormatDefinition {
  var async: js.UndefOr[Boolean] = js.native
  var compare: js.UndefOr[js.Function2[/* data1 */ Double, /* data2 */ Double, Double]] = js.native
  var `type`: number = js.native
  @JSName("validate")
  var validate_Original: NumberFormatValidator = js.native
  def validate(data: Double): Boolean | js.Thenable[_] = js.native
}

