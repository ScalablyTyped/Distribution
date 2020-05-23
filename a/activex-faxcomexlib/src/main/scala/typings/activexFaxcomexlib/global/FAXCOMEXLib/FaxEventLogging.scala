package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_LOG_LEVEL_ENUM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxEventLogging Class */
@JSGlobal("FAXCOMEXLib.FaxEventLogging")
@js.native
class FaxEventLogging protected ()
  extends typings.activexFaxcomexlib.FAXCOMEXLib.FaxEventLogging {
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxEventLogging_typekey")
  override var FAXCOMEXLibDotFaxEventLogging_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxEventLogging = js.native
  /** Detail level of event logs for general (other) events */
  /* CompleteClass */
  override var GeneralEventsLevel: FAX_LOG_LEVEL_ENUM = js.native
  /** Detail level of event logs for inbound fax events */
  /* CompleteClass */
  override var InboundEventsLevel: FAX_LOG_LEVEL_ENUM = js.native
  /** Detail level of event logs for initialization events */
  /* CompleteClass */
  override var InitEventsLevel: FAX_LOG_LEVEL_ENUM = js.native
  /** Detail level of event logs for outbound fax events */
  /* CompleteClass */
  override var OutboundEventsLevel: FAX_LOG_LEVEL_ENUM = js.native
  /** Refresh the object */
  /* CompleteClass */
  override def Refresh(): Unit = js.native
  /** Save the object */
  /* CompleteClass */
  override def Save(): Unit = js.native
}

