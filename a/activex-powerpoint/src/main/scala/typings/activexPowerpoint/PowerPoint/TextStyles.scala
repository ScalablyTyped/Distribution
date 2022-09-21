package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStyles extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Count: Double
  
  def Item(Type: PpTextStyleType): TextStyle
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.TextStyles_typekey")
  var PowerPointDotTextStyles_typekey: TextStyles
}
object TextStyles {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Item: PpTextStyleType => TextStyle,
    Parent: Any,
    PowerPointDotTextStyles_typekey: TextStyles
  ): TextStyles = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TextStyles_typekey")(PowerPointDotTextStyles_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyles]
  }
  
  extension [Self <: TextStyles](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: PpTextStyleType => TextStyle): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotTextStyles_typekey(value: TextStyles): Self = StObject.set(x, "PowerPoint.TextStyles_typekey", value.asInstanceOf[js.Any])
  }
}
