package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_ACCESS_RIGHTS_ENUM_2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxSecurity2 Class */
@JSGlobal("FAXCOMEXLib.FaxSecurity2")
@js.native
class FaxSecurity2 protected ()
  extends typings.activexFaxcomexlib.FAXCOMEXLib.FaxSecurity2 {
  /** Security descriptor */
  /* CompleteClass */
  override var Descriptor: js.Any = js.native
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxSecurity2_typekey")
  override var FAXCOMEXLibDotFaxSecurity2_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxSecurity2 = js.native
  /** Granted rights, a bit-wise combination */
  /* CompleteClass */
  override val GrantedRights: FAX_ACCESS_RIGHTS_ENUM_2 = js.native
  /** Security Information Type */
  /* CompleteClass */
  override var InformationType: Double = js.native
  /** Refresh the object */
  /* CompleteClass */
  override def Refresh(): Unit = js.native
  /** Save the object */
  /* CompleteClass */
  override def Save(): Unit = js.native
}

