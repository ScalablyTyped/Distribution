package typings.activexFaxcomexlib.global.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxActivityLogging Class */
@JSGlobal("FAXCOMEXLib.FaxActivityLogging")
@js.native
class FaxActivityLogging protected ()
  extends typings.activexFaxcomexlib.FAXCOMEXLib.FaxActivityLogging {
  /** Activity log database files path */
  /* CompleteClass */
  override var DatabasePath: String = js.native
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxActivityLogging_typekey")
  override var FAXCOMEXLibDotFaxActivityLogging_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxActivityLogging = js.native
  /** Does the server log incoming fax activity */
  /* CompleteClass */
  override var LogIncoming: Boolean = js.native
  /** Does the server log outgoing fax activity */
  /* CompleteClass */
  override var LogOutgoing: Boolean = js.native
  /** Refresh the object */
  /* CompleteClass */
  override def Refresh(): Unit = js.native
  /** Save the object */
  /* CompleteClass */
  override def Save(): Unit = js.native
}

