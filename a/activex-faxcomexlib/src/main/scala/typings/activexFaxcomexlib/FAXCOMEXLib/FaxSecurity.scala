package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxSecurity Class */
trait FaxSecurity extends js.Object {
  /** Security descriptor */
  var Descriptor: js.Any
  @JSName("FAXCOMEXLib.FaxSecurity_typekey")
  var FAXCOMEXLibDotFaxSecurity_typekey: FaxSecurity
  /** Granted rights, a bit-wise combination of FAX_ACCESS_RIGHTS values */
  val GrantedRights: FAX_ACCESS_RIGHTS_ENUM
  /** Security Information Type */
  var InformationType: Double
  /** Refresh the object */
  def Refresh(): Unit
  /** Save the object */
  def Save(): Unit
}

object FaxSecurity {
  @scala.inline
  def apply(
    Descriptor: js.Any,
    FAXCOMEXLibDotFaxSecurity_typekey: FaxSecurity,
    GrantedRights: FAX_ACCESS_RIGHTS_ENUM,
    InformationType: Double,
    Refresh: () => Unit,
    Save: () => Unit
  ): FaxSecurity = {
    val __obj = js.Dynamic.literal(Descriptor = Descriptor.asInstanceOf[js.Any], GrantedRights = GrantedRights.asInstanceOf[js.Any], InformationType = InformationType.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), Save = js.Any.fromFunction0(Save))
    __obj.updateDynamic("FAXCOMEXLib.FaxSecurity_typekey")(FAXCOMEXLibDotFaxSecurity_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxSecurity]
  }
}

