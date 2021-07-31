package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolbarButton extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val BuiltIn: Boolean
  
  var BuiltInFace: Boolean
  
  def Copy(Toolbar: Toolbar, Before: Double): Unit
  
  def CopyFace(): Unit
  
  val Creator: XlCreator
  
  def Delete(): Unit
  
  def Edit(): Unit
  
  var Enabled: Boolean
  
  @JSName("Excel.ToolbarButton_typekey")
  var ExcelDotToolbarButton_typekey: ToolbarButton
  
  var HelpContextID: Double
  
  var HelpFile: String
  
  val ID: Double
  
  val IsGap: Boolean
  
  def Move(Toolbar: Toolbar, Before: Double): Unit
  
  var Name: String
  
  var OnAction: String
  
  val Parent: js.Any
  
  def PasteFace(): Unit
  
  var Pushed: Boolean
  
  def Reset(): Unit
  
  var StatusBar: String
  
  var Width: Double
}
object ToolbarButton {
  
  @scala.inline
  def apply(
    Application: Application,
    BuiltIn: Boolean,
    BuiltInFace: Boolean,
    Copy: (Toolbar, Double) => Unit,
    CopyFace: () => Unit,
    Creator: XlCreator,
    Delete: () => Unit,
    Edit: () => Unit,
    Enabled: Boolean,
    ExcelDotToolbarButton_typekey: ToolbarButton,
    HelpContextID: Double,
    HelpFile: String,
    ID: Double,
    IsGap: Boolean,
    Move: (Toolbar, Double) => Unit,
    Name: String,
    OnAction: String,
    Parent: js.Any,
    PasteFace: () => Unit,
    Pushed: Boolean,
    Reset: () => Unit,
    StatusBar: String,
    Width: Double
  ): ToolbarButton = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BuiltIn = BuiltIn.asInstanceOf[js.Any], BuiltInFace = BuiltInFace.asInstanceOf[js.Any], Copy = js.Any.fromFunction2(Copy), CopyFace = js.Any.fromFunction0(CopyFace), Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Edit = js.Any.fromFunction0(Edit), Enabled = Enabled.asInstanceOf[js.Any], HelpContextID = HelpContextID.asInstanceOf[js.Any], HelpFile = HelpFile.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], IsGap = IsGap.asInstanceOf[js.Any], Move = js.Any.fromFunction2(Move), Name = Name.asInstanceOf[js.Any], OnAction = OnAction.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PasteFace = js.Any.fromFunction0(PasteFace), Pushed = Pushed.asInstanceOf[js.Any], Reset = js.Any.fromFunction0(Reset), StatusBar = StatusBar.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ToolbarButton_typekey")(ExcelDotToolbarButton_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarButton]
  }
  
  @scala.inline
  implicit class ToolbarButtonMutableBuilder[Self <: ToolbarButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltIn(value: Boolean): Self = StObject.set(x, "BuiltIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltInFace(value: Boolean): Self = StObject.set(x, "BuiltInFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy(value: (Toolbar, Double) => Unit): Self = StObject.set(x, "Copy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCopyFace(value: () => Unit): Self = StObject.set(x, "CopyFace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEdit(value: () => Unit): Self = StObject.set(x, "Edit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotToolbarButton_typekey(value: ToolbarButton): Self = StObject.set(x, "Excel.ToolbarButton_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpContextID(value: Double): Self = StObject.set(x, "HelpContextID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpFile(value: String): Self = StObject.set(x, "HelpFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGap(value: Boolean): Self = StObject.set(x, "IsGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMove(value: (Toolbar, Double) => Unit): Self = StObject.set(x, "Move", js.Any.fromFunction2(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAction(value: String): Self = StObject.set(x, "OnAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasteFace(value: () => Unit): Self = StObject.set(x, "PasteFace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPushed(value: Boolean): Self = StObject.set(x, "Pushed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "Reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStatusBar(value: String): Self = StObject.set(x, "StatusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
