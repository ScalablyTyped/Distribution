package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait COMAddIn extends StObject {
  
  val Application: js.Any
  
  var Connect: Boolean
  
  val Creator: Double
  
  var Description: String
  
  val Guid: String
  
  var Object: js.Any
  
  @JSName("Office.COMAddIn_typekey")
  var OfficeDotCOMAddIn_typekey: COMAddIn
  
  val Parent: js.Any
  
  val ProgId: String
}
object COMAddIn {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Connect: Boolean,
    Creator: Double,
    Description: String,
    Guid: String,
    Object: js.Any,
    OfficeDotCOMAddIn_typekey: COMAddIn,
    Parent: js.Any,
    ProgId: String
  ): COMAddIn = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Connect = Connect.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Guid = Guid.asInstanceOf[js.Any], Object = Object.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ProgId = ProgId.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.COMAddIn_typekey")(OfficeDotCOMAddIn_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[COMAddIn]
  }
  
  @scala.inline
  implicit class COMAddInMutableBuilder[Self <: COMAddIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnect(value: Boolean): Self = StObject.set(x, "Connect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuid(value: String): Self = StObject.set(x, "Guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: js.Any): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotCOMAddIn_typekey(value: COMAddIn): Self = StObject.set(x, "Office.COMAddIn_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgId(value: String): Self = StObject.set(x, "ProgId", value.asInstanceOf[js.Any])
  }
}
