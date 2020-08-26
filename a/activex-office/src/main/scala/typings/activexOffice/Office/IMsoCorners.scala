package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMsoCorners extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val Name: String = js.native
  @JSName("Office.IMsoCorners_typekey")
  var OfficeDotIMsoCorners_typekey: IMsoCorners = js.native
  val Parent: js.Any = js.native
  def Select(): js.Any = js.native
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
  @scala.inline
  implicit class IMsoCornersOps[Self <: IMsoCorners] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeDotIMsoCorners_typekey(value: IMsoCorners): Self = this.set("Office.IMsoCorners_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: () => js.Any): Self = this.set("Select", js.Any.fromFunction0(value))
  }
  
}

