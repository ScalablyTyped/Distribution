package typings
package ajvLib.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFormatDefinition extends FormatDefinition {
  var async: js.UndefOr[scala.Boolean] = js.native
  var compare: js.UndefOr[js.Function2[/* data1 */ scala.Double, /* data2 */ scala.Double, scala.Double]] = js.native
  var `type`: ajvLib.ajvLibStrings.number = js.native
  @JSName("validate")
  var validate_Original: NumberFormatValidator = js.native
  def validate(data: scala.Double): scala.Boolean | js.Thenable[_] = js.native
}

