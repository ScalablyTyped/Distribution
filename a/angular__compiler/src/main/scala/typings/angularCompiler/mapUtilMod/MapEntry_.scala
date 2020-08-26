package typings.angularCompiler.mapUtilMod

import typings.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapEntry_ extends js.Object {
  var key: String = js.native
  var quoted: Boolean = js.native
  var value: Expression = js.native
}

object MapEntry_ {
  @scala.inline
  def apply(key: String, quoted: Boolean, value: Expression): MapEntry_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapEntry_]
  }
  @scala.inline
  implicit class MapEntry_Ops[Self <: MapEntry_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuoted(value: Boolean): Self = this.set("quoted", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Expression): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

