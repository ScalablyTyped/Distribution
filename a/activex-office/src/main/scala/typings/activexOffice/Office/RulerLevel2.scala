package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulerLevel2 extends js.Object {
  val Application: js.Any
  val Creator: Double
  var FirstMargin: Double
  var LeftMargin: Double
  @JSName("Office.RulerLevel2_typekey")
  var OfficeDotRulerLevel2_typekey: RulerLevel2
  val Parent: js.Any
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
}

