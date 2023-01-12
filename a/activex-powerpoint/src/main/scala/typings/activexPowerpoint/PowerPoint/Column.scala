package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Cells: CellRange
  
  def Delete(): Unit
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.Column_typekey")
  var PowerPointDotColumn_typekey: Column
  
  def Select(): Unit
  
  var Width: Double
}
object Column {
  
  inline def apply(
    Application: Application,
    Cells: CellRange,
    Delete: () => Unit,
    Parent: Any,
    PowerPointDotColumn_typekey: Column,
    Select: () => Unit,
    Width: Double
  ): Column = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Cells = Cells.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Column_typekey")(PowerPointDotColumn_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCells(value: CellRange): Self = StObject.set(x, "Cells", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotColumn_typekey(value: Column): Self = StObject.set(x, "PowerPoint.Column_typekey", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
