package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyItem extends js.Object {
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
}

