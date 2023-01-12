package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyItem extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  val Data: String
  
  val Description: String
  
  val Id: String
  
  val Name: String
  
  /* private */ @JSName("Office.PolicyItem_typekey")
  var OfficeDotPolicyItem_typekey: PolicyItem
  
  val Parent: Any
}
object PolicyItem {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    Data: String,
    Description: String,
    Id: String,
    Name: String,
    OfficeDotPolicyItem_typekey: PolicyItem,
    Parent: Any
  ): PolicyItem = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.PolicyItem_typekey")(OfficeDotPolicyItem_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyItem] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setData(value: String): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotPolicyItem_typekey(value: PolicyItem): Self = StObject.set(x, "Office.PolicyItem_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
