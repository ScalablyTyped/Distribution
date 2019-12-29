package typings.activexDashFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxEventLogging Class */
@JSGlobal("FAXCOMEXLib.FaxEventLogging")
@js.native
class FaxEventLogging protected () extends js.Object {
  @JSName("FAXCOMEXLib.FaxEventLogging_typekey")
  var FAXCOMEXLibDotFaxEventLogging_typekey: FaxEventLogging = js.native
  /** Detail level of event logs for general (other) events */
  var GeneralEventsLevel: FAX_LOG_LEVEL_ENUM = js.native
  /** Detail level of event logs for inbound fax events */
  var InboundEventsLevel: FAX_LOG_LEVEL_ENUM = js.native
  /** Detail level of event logs for initialization events */
  var InitEventsLevel: FAX_LOG_LEVEL_ENUM = js.native
  /** Detail level of event logs for outbound fax events */
  var OutboundEventsLevel: FAX_LOG_LEVEL_ENUM = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Save the object */
  def Save(): Unit = js.native
}

