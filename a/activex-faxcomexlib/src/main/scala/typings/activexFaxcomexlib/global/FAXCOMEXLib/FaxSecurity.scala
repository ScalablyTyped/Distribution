package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_ACCESS_RIGHTS_ENUM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxSecurity Class */
@JSGlobal("FAXCOMEXLib.FaxSecurity")
@js.native
class FaxSecurity protected ()
  extends typings.activexFaxcomexlib.FAXCOMEXLib.FaxSecurity {
  /** Security descriptor */
  /* CompleteClass */
  override var Descriptor: js.Any = js.native
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxSecurity_typekey")
  override var FAXCOMEXLibDotFaxSecurity_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxSecurity = js.native
  /** Granted rights, a bit-wise combination of FAX_ACCESS_RIGHTS values */
  /* CompleteClass */
  override val GrantedRights: FAX_ACCESS_RIGHTS_ENUM = js.native
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

