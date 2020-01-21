package typings.angularCompiler.mapUtilMod

import typings.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapEntry_ extends js.Object {
  var key: String
  var quoted: Boolean
  var value: Expression
}

object MapEntry_ {
  @scala.inline
  def apply(key: String, quoted: Boolean, value: Expression): MapEntry_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MapEntry_]
  }
}

