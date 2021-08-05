package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Borders extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Count: Double
  
  def Item(BorderType: PpBorderType): LineFormat
  
  val Parent: js.Any
  
  /* private */ @JSName("PowerPoint.Borders_typekey")
  var PowerPointDotBorders_typekey: Borders
}
object Borders {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Item: PpBorderType => LineFormat,
    Parent: js.Any,
    PowerPointDotBorders_typekey: Borders
  ): Borders = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Borders_typekey")(PowerPointDotBorders_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Borders]
  }
  
  extension [Self <: Borders](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: PpBorderType => LineFormat): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotBorders_typekey(value: Borders): Self = StObject.set(x, "PowerPoint.Borders_typekey", value.asInstanceOf[js.Any])
  }
}
