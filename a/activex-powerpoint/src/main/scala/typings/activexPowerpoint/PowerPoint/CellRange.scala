package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellRange extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Borders: typings.activexPowerpoint.PowerPoint.Borders = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): Cell = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.CellRange_typekey")
  var PowerPointDotCellRange_typekey: CellRange = js.native
}
object CellRange {
  
  @scala.inline
  def apply(
    Application: Application,
    Borders: Borders,
    Count: Double,
    Item: Double => Cell,
    Parent: js.Any,
    PowerPointDotCellRange_typekey: CellRange
  ): CellRange = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.CellRange_typekey")(PowerPointDotCellRange_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellRange]
  }
  
  @scala.inline
  implicit class CellRangeMutableBuilder[Self <: CellRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorders(value: Borders): Self = StObject.set(x, "Borders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => Cell): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotCellRange_typekey(value: CellRange): Self = StObject.set(x, "PowerPoint.CellRange_typekey", value.asInstanceOf[js.Any])
  }
}
