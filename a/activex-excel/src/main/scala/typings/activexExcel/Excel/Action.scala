package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Caption: String
  
  val Content: String
  
  val Coordinate: String
  
  val Creator: XlCreator
  
  @JSName("Excel.Action_typekey")
  var ExcelDotAction_typekey: Action
  
  def Execute(): Unit
  
  val Name: String
  
  val Parent: js.Any
  
  val Type: XlActionType
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
  implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinate(value: String): Self = StObject.set(x, "Coordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotAction_typekey(value: Action): Self = StObject.set(x, "Excel.Action_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecute(value: () => Unit): Self = StObject.set(x, "Execute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: XlActionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
