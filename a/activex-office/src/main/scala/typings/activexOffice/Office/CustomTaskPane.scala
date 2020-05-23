package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTaskPane extends js.Object {
  val Application: js.Any
  val ContentControl: js.Any
  var DockPosition: MsoCTPDockPosition
  var DockPositionRestrict: MsoCTPDockPositionRestrict
  var Height: Double
  @JSName("Office.CustomTaskPane_typekey")
  var OfficeDotCustomTaskPane_typekey: CustomTaskPane
  val Title: String
  var Visible: Boolean
  var Width: Double
  val Window: js.Any
  def Delete(): Unit
}

object CustomTaskPane {
  @scala.inline
  def apply(
    Application: js.Any,
    ContentControl: js.Any,
    Delete: () => Unit,
    DockPosition: MsoCTPDockPosition,
    DockPositionRestrict: MsoCTPDockPositionRestrict,
    Height: Double,
    OfficeDotCustomTaskPane_typekey: CustomTaskPane,
    Title: String,
    Visible: Boolean,
    Width: Double,
    Window: js.Any
  ): CustomTaskPane = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ContentControl = ContentControl.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DockPosition = DockPosition.asInstanceOf[js.Any], DockPositionRestrict = DockPositionRestrict.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], Window = Window.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.CustomTaskPane_typekey")(OfficeDotCustomTaskPane_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTaskPane]
  }
}

