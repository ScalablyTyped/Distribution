package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends js.Object {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Caption: String = js.native
  
  val Content: String = js.native
  
  val Coordinate: String = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.Action_typekey")
  var ExcelDotAction_typekey: Action = js.native
  
  def Execute(): Unit = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  val Type: XlActionType = js.native
}
object Action {
  
  @scala.inline
  def apply(
    Application: Application,
    Caption: String,
    Content: String,
    Coordinate: String,
    Creator: XlCreator,
    ExcelDotAction_typekey: Action,
    Execute: () => Unit,
    Name: String,
    Parent: js.Any,
    Type: XlActionType
  ): Action = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], Coordinate = Coordinate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Execute = js.Any.fromFunction0(Execute), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Action_typekey")(ExcelDotAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
    
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
    def setCaption(value: String): Self = this.set("Caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = this.set("Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinate(value: String): Self = this.set("Coordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotAction_typekey(value: Action): Self = this.set("Excel.Action_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecute(value: () => Unit): Self = this.set("Execute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: XlActionType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
