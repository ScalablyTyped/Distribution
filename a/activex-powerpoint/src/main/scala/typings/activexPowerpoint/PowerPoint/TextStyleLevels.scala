package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStyleLevels extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Count: Double
  
  def Item(Level: Double): TextStyleLevel
  
  val Parent: js.Any
  
  /* private */ @JSName("PowerPoint.TextStyleLevels_typekey")
  var PowerPointDotTextStyleLevels_typekey: TextStyleLevels
}
object TextStyleLevels {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Item: Double => TextStyleLevel,
    Parent: js.Any,
    PowerPointDotTextStyleLevels_typekey: TextStyleLevels
  ): TextStyleLevels = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TextStyleLevels_typekey")(PowerPointDotTextStyleLevels_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyleLevels]
  }
  
  extension [Self <: TextStyleLevels](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => TextStyleLevel): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotTextStyleLevels_typekey(value: TextStyleLevels): Self = StObject.set(x, "PowerPoint.TextStyleLevels_typekey", value.asInstanceOf[js.Any])
  }
}
