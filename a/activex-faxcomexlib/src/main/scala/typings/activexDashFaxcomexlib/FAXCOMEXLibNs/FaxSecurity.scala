package typings.activexDashFaxcomexlib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxSecurity Class */
@JSGlobal("FAXCOMEXLib.FaxSecurity")
@js.native
class FaxSecurity protected () extends js.Object {
  /** Security descriptor */
  var Descriptor: js.Any = js.native
  var `FAXCOMEXLib.FaxSecurity_typekey`: FaxSecurity = js.native
  /** Granted rights, a bit-wise combination of FAX_ACCESS_RIGHTS values */
  val GrantedRights: FAX_ACCESS_RIGHTS_ENUM = js.native
  /** Security Information Type */
  var InformationType: Double = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Save the object */
  def Save(): Unit = js.native
}

