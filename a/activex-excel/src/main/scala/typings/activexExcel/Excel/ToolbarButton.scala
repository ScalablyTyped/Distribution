package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarButton extends js.Object {
  
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
  implicit class ToolbarButtonOps[Self <: ToolbarButton] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltIn(value: Boolean): Self = this.set("BuiltIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltInFace(value: Boolean): Self = this.set("BuiltInFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy(value: (Toolbar, Double) => Unit): Self = this.set("Copy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCopyFace(value: () => Unit): Self = this.set("CopyFace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEdit(value: () => Unit): Self = this.set("Edit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotToolbarButton_typekey(value: ToolbarButton): Self = this.set("Excel.ToolbarButton_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpContextID(value: Double): Self = this.set("HelpContextID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpFile(value: String): Self = this.set("HelpFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGap(value: Boolean): Self = this.set("IsGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMove(value: (Toolbar, Double) => Unit): Self = this.set("Move", js.Any.fromFunction2(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAction(value: String): Self = this.set("OnAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasteFace(value: () => Unit): Self = this.set("PasteFace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPushed(value: Boolean): Self = this.set("Pushed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("Reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStatusBar(value: String): Self = this.set("StatusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
  }
}
