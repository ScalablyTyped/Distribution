package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMsoCorners extends js.Object {
  val Application: js.Any
  val Creator: Double
  val Name: String
  @JSName("Office.IMsoCorners_typekey")
  var OfficeDotIMsoCorners_typekey: IMsoCorners
  val Parent: js.Any
  def Select(): js.Any
}

object IMsoCorners {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Name: String,
    OfficeDotIMsoCorners_typekey: IMsoCorners,
    Parent: js.Any,
    Select: () => js.Any
  ): IMsoCorners = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Office.IMsoCorners_typekey")(OfficeDotIMsoCorners_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoCorners]
  }
}

