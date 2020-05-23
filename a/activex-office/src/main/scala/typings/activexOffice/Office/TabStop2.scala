package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStop2 extends js.Object {
  val Application: js.Any
  val Creator: Double
  @JSName("Office.TabStop2_typekey")
  var OfficeDotTabStop2_typekey: TabStop2
  val Parent: js.Any
  var Position: Double
  var Type: MsoTabStopType
  def Clear(): Unit
}

object TabStop2 {
  @scala.inline
  def apply(
    Application: js.Any,
    Clear: () => Unit,
    Creator: Double,
    OfficeDotTabStop2_typekey: TabStop2,
    Parent: js.Any,
    Position: Double,
    Type: MsoTabStopType
  ): TabStop2 = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.TabStop2_typekey")(OfficeDotTabStop2_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStop2]
  }
}

