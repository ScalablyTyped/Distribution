package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabStops extends StObject {
  
  def Add(Type: PpTabStopType, Position: Double): TabStop
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Count: Double
  
  var DefaultSpacing: Double
  
  def Item(Index: Double): TabStop
  
  val Parent: js.Any
  
  /* private */ @JSName("PowerPoint.TabStops_typekey")
  var PowerPointDotTabStops_typekey: TabStops
}
object TabStops {
  
  inline def apply(
    Add: (PpTabStopType, Double) => TabStop,
    Application: Application,
    Count: Double,
    DefaultSpacing: Double,
    Item: Double => TabStop,
    Parent: js.Any,
    PowerPointDotTabStops_typekey: TabStops
  ): TabStops = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], DefaultSpacing = DefaultSpacing.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TabStops_typekey")(PowerPointDotTabStops_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStops]
  }
  
  extension [Self <: TabStops](x: Self) {
    
    inline def setAdd(value: (PpTabStopType, Double) => TabStop): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setDefaultSpacing(value: Double): Self = StObject.set(x, "DefaultSpacing", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => TabStop): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotTabStops_typekey(value: TabStops): Self = StObject.set(x, "PowerPoint.TabStops_typekey", value.asInstanceOf[js.Any])
  }
}
