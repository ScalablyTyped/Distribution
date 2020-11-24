package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxSecurity2 Class */
@js.native
trait FaxSecurity2 extends js.Object {
  
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
  
  @scala.inline
  implicit class FaxSecurity2Ops[Self <: FaxSecurity2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescriptor(value: js.Any): Self = this.set("Descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFAXCOMEXLibDotFaxSecurity2_typekey(value: FaxSecurity2): Self = this.set("FAXCOMEXLib.FaxSecurity2_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantedRights(value: FAX_ACCESS_RIGHTS_ENUM_2): Self = this.set("GrantedRights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInformationType(value: Double): Self = this.set("InformationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("Refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSave(value: () => Unit): Self = this.set("Save", js.Any.fromFunction0(value))
  }
}
