package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cell extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Borders: typings.activexPowerpoint.PowerPoint.Borders
  
  def Merge(MergeTo: Cell): Unit
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.Cell_typekey")
  var PowerPointDotCell_typekey: Cell
  
  def Select(): Unit
  
  val Selected: Boolean
  
  val Shape: typings.activexPowerpoint.PowerPoint.Shape
  
  def Split(NumRows: Double, NumColumns: Double): Unit
}
object Cell {
  
  inline def apply(
    Application: Application,
    Borders: Borders,
    Merge: Cell => Unit,
    Parent: Any,
    PowerPointDotCell_typekey: Cell,
    Select: () => Unit,
    Selected: Boolean,
    Shape: Shape,
    Split: (Double, Double) => Unit
  ): Cell = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], Merge = js.Any.fromFunction1(Merge), Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Selected = Selected.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any], Split = js.Any.fromFunction2(Split))
    __obj.updateDynamic("PowerPoint.Cell_typekey")(PowerPointDotCell_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cell] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorders(value: Borders): Self = StObject.set(x, "Borders", value.asInstanceOf[js.Any])
    
    inline def setMerge(value: Cell => Unit): Self = StObject.set(x, "Merge", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotCell_typekey(value: Cell): Self = StObject.set(x, "PowerPoint.Cell_typekey", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "Selected", value.asInstanceOf[js.Any])
    
    inline def setShape(value: Shape): Self = StObject.set(x, "Shape", value.asInstanceOf[js.Any])
    
    inline def setSplit(value: (Double, Double) => Unit): Self = StObject.set(x, "Split", js.Any.fromFunction2(value))
  }
}
