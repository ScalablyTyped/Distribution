package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait COMAddIn extends js.Object {
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
}

