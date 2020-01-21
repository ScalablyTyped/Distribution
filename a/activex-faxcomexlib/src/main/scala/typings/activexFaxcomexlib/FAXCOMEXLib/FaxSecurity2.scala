package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxSecurity2 Class */
@JSGlobal("FAXCOMEXLib.FaxSecurity2")
@js.native
class FaxSecurity2 protected () extends js.Object {
  /** Security descriptor */
  var Descriptor: js.Any = js.native
  @JSName("FAXCOMEXLib.FaxSecurity2_typekey")
  var FAXCOMEXLibDotFaxSecurity2_typekey: FaxSecurity2 = js.native
  /** Granted rights, a bit-wise combination */
  val GrantedRights: FAX_ACCESS_RIGHTS_ENUM_2 = js.native
  /** Security Information Type */
  var InformationType: Double = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Save the object */
  def Save(): Unit = js.native
}

