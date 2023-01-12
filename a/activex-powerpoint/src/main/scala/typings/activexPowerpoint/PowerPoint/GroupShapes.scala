package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupShapes extends StObject {
  
  val Application: Any
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): Shape
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.GroupShapes_typekey")
  var PowerPointDotGroupShapes_typekey: GroupShapes
  
  def Range(Index: Any): ShapeRange
}
object GroupShapes {
  
  inline def apply(
    Application: Any,
    Count: Double,
    Creator: Double,
    Item: Any => Shape,
    Parent: Any,
    PowerPointDotGroupShapes_typekey: GroupShapes,
    Range: Any => ShapeRange
  ): GroupShapes = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Range = js.Any.fromFunction1(Range))
    __obj.updateDynamic("PowerPoint.GroupShapes_typekey")(PowerPointDotGroupShapes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupShapes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupShapes] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => Shape): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotGroupShapes_typekey(value: GroupShapes): Self = StObject.set(x, "PowerPoint.GroupShapes_typekey", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Any => ShapeRange): Self = StObject.set(x, "Range", js.Any.fromFunction1(value))
  }
}
