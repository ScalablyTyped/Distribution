package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxSecurity2 Class */
@js.native
trait FaxSecurity2 extends StObject {
  
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
  implicit class FaxSecurity2MutableBuilder[Self <: FaxSecurity2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescriptor(value: js.Any): Self = StObject.set(x, "Descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFAXCOMEXLibDotFaxSecurity2_typekey(value: FaxSecurity2): Self = StObject.set(x, "FAXCOMEXLib.FaxSecurity2_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantedRights(value: FAX_ACCESS_RIGHTS_ENUM_2): Self = StObject.set(x, "GrantedRights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInformationType(value: Double): Self = StObject.set(x, "InformationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = StObject.set(x, "Refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
  }
}
