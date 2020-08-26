package typings.asn1js.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UTCTimeParams extends LocalHexBlockParams {
  var value: js.UndefOr[String] = js.native
  var valueDate: js.UndefOr[Date] = js.native
}

object UTCTimeParams {
  @scala.inline
  def apply(): UTCTimeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UTCTimeParams]
  }
  @scala.inline
  implicit class UTCTimeParamsOps[Self <: UTCTimeParams] (val x: Self) extends AnyVal {
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueDate(value: Date): Self = this.set("valueDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueDate: Self = this.set("valueDate", js.undefined)
  }
  
}

