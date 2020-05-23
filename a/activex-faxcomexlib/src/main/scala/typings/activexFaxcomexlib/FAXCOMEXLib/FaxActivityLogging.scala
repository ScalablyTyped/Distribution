package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxActivityLogging Class */
trait FaxActivityLogging extends js.Object {
  /** Activity log database files path */
  var DatabasePath: String
  @JSName("FAXCOMEXLib.FaxActivityLogging_typekey")
  var FAXCOMEXLibDotFaxActivityLogging_typekey: FaxActivityLogging
  /** Does the server log incoming fax activity */
  var LogIncoming: Boolean
  /** Does the server log outgoing fax activity */
  var LogOutgoing: Boolean
  /** Refresh the object */
  def Refresh(): Unit
  /** Save the object */
  def Save(): Unit
}

object FaxActivityLogging {
  @scala.inline
  def apply(
    DatabasePath: String,
    FAXCOMEXLibDotFaxActivityLogging_typekey: FaxActivityLogging,
    LogIncoming: Boolean,
    LogOutgoing: Boolean,
    Refresh: () => Unit,
    Save: () => Unit
  ): FaxActivityLogging = {
    val __obj = js.Dynamic.literal(DatabasePath = DatabasePath.asInstanceOf[js.Any], LogIncoming = LogIncoming.asInstanceOf[js.Any], LogOutgoing = LogOutgoing.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), Save = js.Any.fromFunction0(Save))
    __obj.updateDynamic("FAXCOMEXLib.FaxActivityLogging_typekey")(FAXCOMEXLibDotFaxActivityLogging_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxActivityLogging]
  }
}

