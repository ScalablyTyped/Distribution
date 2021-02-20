package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Column extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Cells: CellRange = js.native
  
  def Delete(): Unit = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.Column_typekey")
  var PowerPointDotColumn_typekey: Column = js.native
  
  def Select(): Unit = js.native
  
  var Width: Double = js.native
}
object Column {
  
  @scala.inline
  def apply(
    Application: Application,
    Cells: CellRange,
    Delete: () => Unit,
    Parent: js.Any,
    PowerPointDotColumn_typekey: Column,
    Select: () => Unit,
    Width: Double
  ): Column = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Cells = Cells.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Column_typekey")(PowerPointDotColumn_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCells(value: CellRange): Self = StObject.set(x, "Cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotColumn_typekey(value: Column): Self = StObject.set(x, "PowerPoint.Column_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
