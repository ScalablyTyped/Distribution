package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxSecurity2 Class */
trait FaxSecurity2 extends js.Object {
  /** Security descriptor */
  var Descriptor: js.Any
  @JSName("FAXCOMEXLib.FaxSecurity2_typekey")
  var FAXCOMEXLibDotFaxSecurity2_typekey: FaxSecurity2
  /** Granted rights, a bit-wise combination */
  val GrantedRights: FAX_ACCESS_RIGHTS_ENUM_2
  /** Security Information Type */
  var InformationType: Double
  /** Refresh the object */
  def Refresh(): Unit
  /** Save the object */
  def Save(): Unit
}

object FaxSecurity2 {
  @scala.inline
  def apply(
    Descriptor: js.Any,
    FAXCOMEXLibDotFaxSecurity2_typekey: FaxSecurity2,
    GrantedRights: FAX_ACCESS_RIGHTS_ENUM_2,
    InformationType: Double,
    Refresh: () => Unit,
    Save: () => Unit
  ): FaxSecurity2 = {
    val __obj = js.Dynamic.literal(Descriptor = Descriptor.asInstanceOf[js.Any], GrantedRights = GrantedRights.asInstanceOf[js.Any], InformationType = InformationType.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), Save = js.Any.fromFunction0(Save))
    __obj.updateDynamic("FAXCOMEXLib.FaxSecurity2_typekey")(FAXCOMEXLibDotFaxSecurity2_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxSecurity2]
  }
}

