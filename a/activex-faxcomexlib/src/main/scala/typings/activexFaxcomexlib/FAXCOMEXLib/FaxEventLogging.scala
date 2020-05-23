package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxEventLogging Class */
trait FaxEventLogging extends js.Object {
  @JSName("FAXCOMEXLib.FaxEventLogging_typekey")
  var FAXCOMEXLibDotFaxEventLogging_typekey: FaxEventLogging
  /** Detail level of event logs for general (other) events */
  var GeneralEventsLevel: FAX_LOG_LEVEL_ENUM
  /** Detail level of event logs for inbound fax events */
  var InboundEventsLevel: FAX_LOG_LEVEL_ENUM
  /** Detail level of event logs for initialization events */
  var InitEventsLevel: FAX_LOG_LEVEL_ENUM
  /** Detail level of event logs for outbound fax events */
  var OutboundEventsLevel: FAX_LOG_LEVEL_ENUM
  /** Refresh the object */
  def Refresh(): Unit
  /** Save the object */
  def Save(): Unit
}

object FaxEventLogging {
  @scala.inline
  def apply(
    FAXCOMEXLibDotFaxEventLogging_typekey: FaxEventLogging,
    GeneralEventsLevel: FAX_LOG_LEVEL_ENUM,
    InboundEventsLevel: FAX_LOG_LEVEL_ENUM,
    InitEventsLevel: FAX_LOG_LEVEL_ENUM,
    OutboundEventsLevel: FAX_LOG_LEVEL_ENUM,
    Refresh: () => Unit,
    Save: () => Unit
  ): FaxEventLogging = {
    val __obj = js.Dynamic.literal(GeneralEventsLevel = GeneralEventsLevel.asInstanceOf[js.Any], InboundEventsLevel = InboundEventsLevel.asInstanceOf[js.Any], InitEventsLevel = InitEventsLevel.asInstanceOf[js.Any], OutboundEventsLevel = OutboundEventsLevel.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), Save = js.Any.fromFunction0(Save))
    __obj.updateDynamic("FAXCOMEXLib.FaxEventLogging_typekey")(FAXCOMEXLibDotFaxEventLogging_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxEventLogging]
  }
}

