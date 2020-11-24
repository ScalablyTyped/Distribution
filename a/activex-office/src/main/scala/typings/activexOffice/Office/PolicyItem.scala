package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyItem extends js.Object {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  val Data: String = js.native
  
  val Description: String = js.native
  
  val Id: String = js.native
  
  val Name: String = js.native
  
  @JSName("Office.PolicyItem_typekey")
  var OfficeDotPolicyItem_typekey: PolicyItem = js.native
  
  val Parent: js.Any = js.native
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
  implicit class PolicyItemOps[Self <: PolicyItem] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: String): Self = this.set("Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotPolicyItem_typekey(value: PolicyItem): Self = this.set("Office.PolicyItem_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
  }
}
