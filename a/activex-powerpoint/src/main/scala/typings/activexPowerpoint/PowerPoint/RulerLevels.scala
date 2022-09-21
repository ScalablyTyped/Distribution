package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulerLevels extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Count: Double
  
  def Item(Index: Double): RulerLevel
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.RulerLevels_typekey")
  var PowerPointDotRulerLevels_typekey: RulerLevels
}
object RulerLevels {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Item: Double => RulerLevel,
    Parent: Any,
    PowerPointDotRulerLevels_typekey: RulerLevels
  ): RulerLevels = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.RulerLevels_typekey")(PowerPointDotRulerLevels_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulerLevels]
  }
  
  extension [Self <: RulerLevels](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => RulerLevel): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotRulerLevels_typekey(value: RulerLevels): Self = StObject.set(x, "PowerPoint.RulerLevels_typekey", value.asInstanceOf[js.Any])
  }
}
