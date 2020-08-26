package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILocaleDateTimeFormatDescriptor extends js.Object {
  var AMPMS: js.Array[String] = js.native
  var DAY: js.Array[String] = js.native
  var MONTH: js.Array[String] = js.native
  var SHORTDAY: js.Array[String] = js.native
  var SHORTMONTH: js.Array[String] = js.native
  var fullDate: String = js.native
  var longDate: String = js.native
  var medium: String = js.native
  var mediumDate: String = js.native
  var mediumTime: String = js.native
  var short: String = js.native
  var shortDate: String = js.native
  var shortTime: String = js.native
}

object ILocaleDateTimeFormatDescriptor {
  @scala.inline
  def apply(
    AMPMS: js.Array[String],
    DAY: js.Array[String],
    MONTH: js.Array[String],
    SHORTDAY: js.Array[String],
    SHORTMONTH: js.Array[String],
    fullDate: String,
    longDate: String,
    medium: String,
    mediumDate: String,
    mediumTime: String,
    short: String,
    shortDate: String,
    shortTime: String
  ): ILocaleDateTimeFormatDescriptor = {
    val __obj = js.Dynamic.literal(AMPMS = AMPMS.asInstanceOf[js.Any], DAY = DAY.asInstanceOf[js.Any], MONTH = MONTH.asInstanceOf[js.Any], SHORTDAY = SHORTDAY.asInstanceOf[js.Any], SHORTMONTH = SHORTMONTH.asInstanceOf[js.Any], fullDate = fullDate.asInstanceOf[js.Any], longDate = longDate.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], mediumDate = mediumDate.asInstanceOf[js.Any], mediumTime = mediumTime.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any], shortDate = shortDate.asInstanceOf[js.Any], shortTime = shortTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocaleDateTimeFormatDescriptor]
  }
  @scala.inline
  implicit class ILocaleDateTimeFormatDescriptorOps[Self <: ILocaleDateTimeFormatDescriptor] (val x: Self) extends AnyVal {
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
    def setAMPMSVarargs(value: String*): Self = this.set("AMPMS", js.Array(value :_*))
    @scala.inline
    def setAMPMS(value: js.Array[String]): Self = this.set("AMPMS", value.asInstanceOf[js.Any])
    @scala.inline
    def setDAYVarargs(value: String*): Self = this.set("DAY", js.Array(value :_*))
    @scala.inline
    def setDAY(value: js.Array[String]): Self = this.set("DAY", value.asInstanceOf[js.Any])
    @scala.inline
    def setMONTHVarargs(value: String*): Self = this.set("MONTH", js.Array(value :_*))
    @scala.inline
    def setMONTH(value: js.Array[String]): Self = this.set("MONTH", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHORTDAYVarargs(value: String*): Self = this.set("SHORTDAY", js.Array(value :_*))
    @scala.inline
    def setSHORTDAY(value: js.Array[String]): Self = this.set("SHORTDAY", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHORTMONTHVarargs(value: String*): Self = this.set("SHORTMONTH", js.Array(value :_*))
    @scala.inline
    def setSHORTMONTH(value: js.Array[String]): Self = this.set("SHORTMONTH", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullDate(value: String): Self = this.set("fullDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongDate(value: String): Self = this.set("longDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setMedium(value: String): Self = this.set("medium", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediumDate(value: String): Self = this.set("mediumDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediumTime(value: String): Self = this.set("mediumTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setShort(value: String): Self = this.set("short", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortDate(value: String): Self = this.set("shortDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortTime(value: String): Self = this.set("shortTime", value.asInstanceOf[js.Any])
  }
  
}

