package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomTaskPane extends StObject {
  
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
  implicit class CustomTaskPaneMutableBuilder[Self <: CustomTaskPane] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentControl(value: js.Any): Self = StObject.set(x, "ContentControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDockPosition(value: MsoCTPDockPosition): Self = StObject.set(x, "DockPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockPositionRestrict(value: MsoCTPDockPositionRestrict): Self = StObject.set(x, "DockPositionRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotCustomTaskPane_typekey(value: CustomTaskPane): Self = StObject.set(x, "Office.CustomTaskPane_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: js.Any): Self = StObject.set(x, "Window", value.asInstanceOf[js.Any])
  }
}
