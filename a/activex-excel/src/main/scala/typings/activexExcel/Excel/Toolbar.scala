package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Toolbar extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val BuiltIn: Boolean
  
  val Creator: XlCreator
  
  def Delete(): Unit
  
  @JSName("Excel.Toolbar_typekey")
  var ExcelDotToolbar_typekey: Toolbar
  
  var Height: Double
  
  var Left: Double
  
  val Name: String
  
  val Parent: js.Any
  
  var Position: Double
  
  var Protection: XlToolbarProtection
  
  def Reset(): Unit
  
  def ToolbarButtons(Index: Double): ToolbarButton
  @JSName("ToolbarButtons")
  val ToolbarButtons_Original: ToolbarButtons
  
  var Top: Double
  
  var Visible: Boolean
  
  var Width: Double
}
object Toolbar {
  
  @scala.inline
  def apply(
    Application: Application,
    BuiltIn: Boolean,
    Creator: XlCreator,
    Delete: () => Unit,
    ExcelDotToolbar_typekey: Toolbar,
    Height: Double,
    Left: Double,
    Name: String,
    Parent: js.Any,
    Position: Double,
    Protection: XlToolbarProtection,
    Reset: () => Unit,
    ToolbarButtons: ToolbarButtons,
    Top: Double,
    Visible: Boolean,
    Width: Double
  ): Toolbar = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BuiltIn = BuiltIn.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Height = Height.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Protection = Protection.asInstanceOf[js.Any], Reset = js.Any.fromFunction0(Reset), ToolbarButtons = ToolbarButtons.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Toolbar_typekey")(ExcelDotToolbar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toolbar]
  }
  
  @scala.inline
  implicit class ToolbarMutableBuilder[Self <: Toolbar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltIn(value: Boolean): Self = StObject.set(x, "BuiltIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcelDotToolbar_typekey(value: Toolbar): Self = StObject.set(x, "Excel.Toolbar_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtection(value: XlToolbarProtection): Self = StObject.set(x, "Protection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "Reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToolbarButtons(value: ToolbarButtons): Self = StObject.set(x, "ToolbarButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
