package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.OLE_COLOR
import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlkCategory extends js.Object {
  var AutoSize: Boolean
  var BackColor: OLE_COLOR
  var BackStyle: OlBackStyle
  var Enabled: Boolean
  var ForeColor: OLE_COLOR
  var MouseIcon: StdPicture
  var MousePointer: OlMousePointer
  @JSName("Outlook.OlkCategory_typekey")
  var OutlookDotOlkCategory_typekey: OlkCategory
}

object OlkCategory {
  @scala.inline
  def apply(
    AutoSize: Boolean,
    BackColor: OLE_COLOR,
    BackStyle: OlBackStyle,
    Enabled: Boolean,
    ForeColor: OLE_COLOR,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkCategory_typekey: OlkCategory
  ): OlkCategory = {
    val __obj = js.Dynamic.literal(AutoSize = AutoSize.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkCategory_typekey")(OutlookDotOlkCategory_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkCategory]
  }
}

