package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxLoggingOptions Class */
@js.native
trait FaxLoggingOptions extends js.Object {
  /** Activity logging configuration object */
  val ActivityLogging: FaxActivityLogging = js.native
  /** Event logging configuration object */
  val EventLogging: FaxEventLogging = js.native
  @JSName("FAXCOMEXLib.FaxLoggingOptions_typekey")
  var FAXCOMEXLibDotFaxLoggingOptions_typekey: FaxLoggingOptions = js.native
}

object FaxLoggingOptions {
  @scala.inline
  def apply(
    ActivityLogging: FaxActivityLogging,
    EventLogging: FaxEventLogging,
    FAXCOMEXLibDotFaxLoggingOptions_typekey: FaxLoggingOptions
  ): FaxLoggingOptions = {
    val __obj = js.Dynamic.literal(ActivityLogging = ActivityLogging.asInstanceOf[js.Any], EventLogging = EventLogging.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxLoggingOptions_typekey")(FAXCOMEXLibDotFaxLoggingOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxLoggingOptions]
  }
  @scala.inline
  implicit class FaxLoggingOptionsOps[Self <: FaxLoggingOptions] (val x: Self) extends AnyVal {
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
    def setActivityLogging(value: FaxActivityLogging): Self = this.set("ActivityLogging", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventLogging(value: FaxEventLogging): Self = this.set("EventLogging", value.asInstanceOf[js.Any])
    @scala.inline
    def setFAXCOMEXLibDotFaxLoggingOptions_typekey(value: FaxLoggingOptions): Self = this.set("FAXCOMEXLib.FaxLoggingOptions_typekey", value.asInstanceOf[js.Any])
  }
  
}

