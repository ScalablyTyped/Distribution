package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarButton extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val BuiltIn: Boolean = js.native
  
  var BuiltInFace: Boolean = js.native
  
  def Copy(Toolbar: Toolbar, Before: Double): Unit = js.native
  
  def CopyFace(): Unit = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  def Edit(): Unit = js.native
  
  var Enabled: Boolean = js.native
  
  @JSName("Excel.ToolbarButton_typekey")
  var ExcelDotToolbarButton_typekey: ToolbarButton = js.native
  
  var HelpContextID: Double = js.native
  
  var HelpFile: String = js.native
  
  val ID: Double = js.native
  
  val IsGap: Boolean = js.native
  
  def Move(Toolbar: Toolbar, Before: Double): Unit = js.native
  
  var Name: String = js.native
  
  var OnAction: String = js.native
  
  val Parent: js.Any = js.native
  
  def PasteFace(): Unit = js.native
  
  var Pushed: Boolean = js.native
  
  def Reset(): Unit = js.native
  
  var StatusBar: String = js.native
  
  var Width: Double = js.native
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
