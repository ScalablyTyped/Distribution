package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RulerLevel2 extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  var FirstMargin: Double = js.native
  var LeftMargin: Double = js.native
  @JSName("Office.RulerLevel2_typekey")
  var OfficeDotRulerLevel2_typekey: RulerLevel2 = js.native
  val Parent: js.Any = js.native
}

object RulerLevel2 {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    FirstMargin: Double,
    LeftMargin: Double,
    OfficeDotRulerLevel2_typekey: RulerLevel2,
    Parent: js.Any
  ): RulerLevel2 = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FirstMargin = FirstMargin.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.RulerLevel2_typekey")(OfficeDotRulerLevel2_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulerLevel2]
  }
  @scala.inline
  implicit class RulerLevel2Ops[Self <: RulerLevel2] (val x: Self) extends AnyVal {
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
    def setFirstMargin(value: Double): Self = this.set("FirstMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftMargin(value: Double): Self = this.set("LeftMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeDotRulerLevel2_typekey(value: RulerLevel2): Self = this.set("Office.RulerLevel2_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
  }
  
}

