package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait COMAddIn extends StObject {
  
  val Application: Any
  
  var Connect: Boolean
  
  val Creator: Double
  
  var Description: String
  
  val Guid: String
  
  var Object: Any
  
  /* private */ @JSName("Office.COMAddIn_typekey")
  var OfficeDotCOMAddIn_typekey: COMAddIn
  
  val Parent: Any
  
  val ProgId: String
}
object COMAddIn {
  
  inline def apply(
    Application: Any,
    Connect: Boolean,
    Creator: Double,
    Description: String,
    Guid: String,
    Object: Any,
    OfficeDotCOMAddIn_typekey: COMAddIn,
    Parent: Any,
    ProgId: String
  ): COMAddIn = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Connect = Connect.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Guid = Guid.asInstanceOf[js.Any], Object = Object.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ProgId = ProgId.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.COMAddIn_typekey")(OfficeDotCOMAddIn_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[COMAddIn]
  }
  
  extension [Self <: COMAddIn](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setConnect(value: Boolean): Self = StObject.set(x, "Connect", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setGuid(value: String): Self = StObject.set(x, "Guid", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Any): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotCOMAddIn_typekey(value: COMAddIn): Self = StObject.set(x, "Office.COMAddIn_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setProgId(value: String): Self = StObject.set(x, "ProgId", value.asInstanceOf[js.Any])
  }
}
