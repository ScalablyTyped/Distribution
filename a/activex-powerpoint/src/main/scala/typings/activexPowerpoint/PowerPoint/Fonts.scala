package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fonts extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Count: Double
  
  def Item(Index: Any): Font
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.Fonts_typekey")
  var PowerPointDotFonts_typekey: Fonts
  
  def Replace(Original: String, Replacement: String): Unit
}
object Fonts {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Item: Any => Font,
    Parent: Any,
    PowerPointDotFonts_typekey: Fonts,
    Replace: (String, String) => Unit
  ): Fonts = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Replace = js.Any.fromFunction2(Replace))
    __obj.updateDynamic("PowerPoint.Fonts_typekey")(PowerPointDotFonts_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fonts]
  }
  
  extension [Self <: Fonts](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => Font): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotFonts_typekey(value: Fonts): Self = StObject.set(x, "PowerPoint.Fonts_typekey", value.asInstanceOf[js.Any])
    
    inline def setReplace(value: (String, String) => Unit): Self = StObject.set(x, "Replace", js.Any.fromFunction2(value))
  }
}
