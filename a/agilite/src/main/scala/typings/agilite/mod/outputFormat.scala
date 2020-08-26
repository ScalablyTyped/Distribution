package typings.agilite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait outputFormat extends js.Object {
  var ARRAY: String = js.native
  var JSON: String = js.native
  var STRING: String = js.native
}

object outputFormat {
  @scala.inline
  def apply(ARRAY: String, JSON: String, STRING: String): outputFormat = {
    val __obj = js.Dynamic.literal(ARRAY = ARRAY.asInstanceOf[js.Any], JSON = JSON.asInstanceOf[js.Any], STRING = STRING.asInstanceOf[js.Any])
    __obj.asInstanceOf[outputFormat]
  }
  @scala.inline
  implicit class outputFormatOps[Self <: outputFormat] (val x: Self) extends AnyVal {
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
    def setARRAY(value: String): Self = this.set("ARRAY", value.asInstanceOf[js.Any])
    @scala.inline
    def setJSON(value: String): Self = this.set("JSON", value.asInstanceOf[js.Any])
    @scala.inline
    def setSTRING(value: String): Self = this.set("STRING", value.asInstanceOf[js.Any])
  }
  
}

