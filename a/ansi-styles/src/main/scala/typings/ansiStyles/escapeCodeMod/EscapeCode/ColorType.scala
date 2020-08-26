package typings.ansiStyles.escapeCodeMod.EscapeCode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorType extends js.Object {
  /**
    * 16 color ansi code
    */
  var ansi: Conversions = js.native
  /**
    * truecolor(16 million color) ansi code
    */
  var ansi16m: Conversions = js.native
  /**
    * 256 color ansi code
    */
  var ansi256: Conversions = js.native
}

object ColorType {
  @scala.inline
  def apply(ansi: Conversions, ansi16m: Conversions, ansi256: Conversions): ColorType = {
    val __obj = js.Dynamic.literal(ansi = ansi.asInstanceOf[js.Any], ansi16m = ansi16m.asInstanceOf[js.Any], ansi256 = ansi256.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorType]
  }
  @scala.inline
  implicit class ColorTypeOps[Self <: ColorType] (val x: Self) extends AnyVal {
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
    def setAnsi(value: Conversions): Self = this.set("ansi", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnsi16m(value: Conversions): Self = this.set("ansi16m", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnsi256(value: Conversions): Self = this.set("ansi256", value.asInstanceOf[js.Any])
  }
  
}

