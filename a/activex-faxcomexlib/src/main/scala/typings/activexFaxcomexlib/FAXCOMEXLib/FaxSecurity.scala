package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxSecurity Class */
trait FaxSecurity extends StObject {
  
  /** Security descriptor */
  var Descriptor: Any
  
  /* private */ @JSName("FAXCOMEXLib.FaxSecurity_typekey")
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
  
  inline def apply(
    Descriptor: Any,
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FaxSecurity] (val x: Self) extends AnyVal {
    
    inline def setDescriptor(value: Any): Self = StObject.set(x, "Descriptor", value.asInstanceOf[js.Any])
    
    inline def setFAXCOMEXLibDotFaxSecurity_typekey(value: FaxSecurity): Self = StObject.set(x, "FAXCOMEXLib.FaxSecurity_typekey", value.asInstanceOf[js.Any])
    
    inline def setGrantedRights(value: FAX_ACCESS_RIGHTS_ENUM): Self = StObject.set(x, "GrantedRights", value.asInstanceOf[js.Any])
    
    inline def setInformationType(value: Double): Self = StObject.set(x, "InformationType", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: () => Unit): Self = StObject.set(x, "Refresh", js.Any.fromFunction0(value))
    
    inline def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
  }
}
