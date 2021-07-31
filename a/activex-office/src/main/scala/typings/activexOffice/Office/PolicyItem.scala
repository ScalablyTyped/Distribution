package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyItem extends StObject {
  
  val Application: js.Any
  
  val Creator: Double
  
  val Data: String
  
  val Description: String
  
  val Id: String
  
  val Name: String
  
  @JSName("Office.PolicyItem_typekey")
  var OfficeDotPolicyItem_typekey: PolicyItem
  
  val Parent: js.Any
}
object PolicyItem {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Data: String,
    Description: String,
    Id: String,
    Name: String,
    OfficeDotPolicyItem_typekey: PolicyItem,
    Parent: js.Any
  ): PolicyItem = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.PolicyItem_typekey")(OfficeDotPolicyItem_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyItem]
  }
  
  @scala.inline
  implicit class PolicyItemMutableBuilder[Self <: PolicyItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotPolicyItem_typekey(value: PolicyItem): Self = StObject.set(x, "Office.PolicyItem_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
