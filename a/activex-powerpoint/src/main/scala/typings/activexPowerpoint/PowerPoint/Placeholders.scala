package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Placeholders extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Count: Double
  
  def FindByName(Index: Any): Shape
  
  def Item(Index: Double): Shape
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.Placeholders_typekey")
  var PowerPointDotPlaceholders_typekey: Placeholders
}
object Placeholders {
  
  inline def apply(
    Application: Application,
    Count: Double,
    FindByName: Any => Shape,
    Item: Double => Shape,
    Parent: Any,
    PowerPointDotPlaceholders_typekey: Placeholders
  ): Placeholders = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], FindByName = js.Any.fromFunction1(FindByName), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Placeholders_typekey")(PowerPointDotPlaceholders_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placeholders]
  }
  
  extension [Self <: Placeholders](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setFindByName(value: Any => Shape): Self = StObject.set(x, "FindByName", js.Any.fromFunction1(value))
    
    inline def setItem(value: Double => Shape): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotPlaceholders_typekey(value: Placeholders): Self = StObject.set(x, "PowerPoint.Placeholders_typekey", value.asInstanceOf[js.Any])
  }
}
