package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintRanges extends StObject {
  
  def Add(Start: Double, End: Double): PrintRange
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  def ClearAll(): Unit
  
  val Count: Double
  
  def Item(Index: Double): PrintRange
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.PrintRanges_typekey")
  var PowerPointDotPrintRanges_typekey: PrintRanges
}
object PrintRanges {
  
  inline def apply(
    Add: (Double, Double) => PrintRange,
    Application: Application,
    ClearAll: () => Unit,
    Count: Double,
    Item: Double => PrintRange,
    Parent: Any,
    PowerPointDotPrintRanges_typekey: PrintRanges
  ): PrintRanges = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], ClearAll = js.Any.fromFunction0(ClearAll), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PrintRanges_typekey")(PowerPointDotPrintRanges_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintRanges]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintRanges] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (Double, Double) => PrintRange): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClearAll(value: () => Unit): Self = StObject.set(x, "ClearAll", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => PrintRange): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotPrintRanges_typekey(value: PrintRanges): Self = StObject.set(x, "PowerPoint.PrintRanges_typekey", value.asInstanceOf[js.Any])
  }
}
