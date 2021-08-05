package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_LOG_LEVEL_ENUM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxEventLogging Class */
@JSGlobal("FAXCOMEXLib.FaxEventLogging")
@js.native
/* private */ class FaxEventLogging ()
  extends StObject
     with typings.activexFaxcomexlib.FAXCOMEXLib.FaxEventLogging {
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxEventLogging_typekey")
  var FAXCOMEXLibDotFaxEventLogging_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxEventLogging = js.native
  
  /** Detail level of event logs for general (other) events */
  /* CompleteClass */
  var GeneralEventsLevel: FAX_LOG_LEVEL_ENUM = js.native
  
  /** Detail level of event logs for inbound fax events */
  /* CompleteClass */
  var InboundEventsLevel: FAX_LOG_LEVEL_ENUM = js.native
  
  /** Detail level of event logs for initialization events */
  /* CompleteClass */
  var InitEventsLevel: FAX_LOG_LEVEL_ENUM = js.native
  
  /** Detail level of event logs for outbound fax events */
  /* CompleteClass */
  var OutboundEventsLevel: FAX_LOG_LEVEL_ENUM = js.native
  
  /** Refresh the object */
  /* CompleteClass */
  override def Refresh(): Unit = js.native
  
  /** Save the object */
  /* CompleteClass */
  override def Save(): Unit = js.native
}
