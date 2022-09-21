package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Row extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Cells: CellRange
  
  def Delete(): Unit
  
  var Height: Double
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.Row_typekey")
  var PowerPointDotRow_typekey: Row
  
  def Select(): Unit
}
object Row {
  
  inline def apply(
    Application: Application,
    Cells: CellRange,
    Delete: () => Unit,
    Height: Double,
    Parent: Any,
    PowerPointDotRow_typekey: Row,
    Select: () => Unit
  ): Row = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Cells = Cells.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Height = Height.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("PowerPoint.Row_typekey")(PowerPointDotRow_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row]
  }
  
  extension [Self <: Row](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCells(value: CellRange): Self = StObject.set(x, "Cells", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotRow_typekey(value: Row): Self = StObject.set(x, "PowerPoint.Row_typekey", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
  }
}
