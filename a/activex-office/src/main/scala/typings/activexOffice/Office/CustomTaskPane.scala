package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomTaskPane extends js.Object {
  
  val Application: js.Any = js.native
  
  val ContentControl: js.Any = js.native
  
  def Delete(): Unit = js.native
  
  var DockPosition: MsoCTPDockPosition = js.native
  
  var DockPositionRestrict: MsoCTPDockPositionRestrict = js.native
  
  var Height: Double = js.native
  
  @JSName("Office.CustomTaskPane_typekey")
  var OfficeDotCustomTaskPane_typekey: CustomTaskPane = js.native
  
  val Title: String = js.native
  
  var Visible: Boolean = js.native
  
  var Width: Double = js.native
  
  val Window: js.Any = js.native
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
  
  @scala.inline
  implicit class CustomTaskPaneOps[Self <: CustomTaskPane] (val x: Self) extends AnyVal {
    
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
    def setContentControl(value: js.Any): Self = this.set("ContentControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDockPosition(value: MsoCTPDockPosition): Self = this.set("DockPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockPositionRestrict(value: MsoCTPDockPositionRestrict): Self = this.set("DockPositionRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotCustomTaskPane_typekey(value: CustomTaskPane): Self = this.set("Office.CustomTaskPane_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("Visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: js.Any): Self = this.set("Window", value.asInstanceOf[js.Any])
  }
}
