package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxLoggingOptions Class */
trait FaxLoggingOptions extends js.Object {
  /** Activity logging configuration object */
  val ActivityLogging: FaxActivityLogging
  /** Event logging configuration object */
  val EventLogging: FaxEventLogging
  @JSName("FAXCOMEXLib.FaxLoggingOptions_typekey")
  var FAXCOMEXLibDotFaxLoggingOptions_typekey: FaxLoggingOptions
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
}

