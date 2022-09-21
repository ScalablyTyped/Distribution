package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStyle extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Levels: TextStyleLevels
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.TextStyle_typekey")
  var PowerPointDotTextStyle_typekey: TextStyle
  
  val Ruler: typings.activexPowerpoint.PowerPoint.Ruler
  
  val TextFrame: typings.activexPowerpoint.PowerPoint.TextFrame
}
object TextStyle {
  
  inline def apply(
    Application: Application,
    Levels: TextStyleLevels,
    Parent: Any,
    PowerPointDotTextStyle_typekey: TextStyle,
    Ruler: Ruler,
    TextFrame: TextFrame
  ): TextStyle = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Levels = Levels.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Ruler = Ruler.asInstanceOf[js.Any], TextFrame = TextFrame.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TextStyle_typekey")(PowerPointDotTextStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyle]
  }
  
  extension [Self <: TextStyle](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setLevels(value: TextStyleLevels): Self = StObject.set(x, "Levels", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotTextStyle_typekey(value: TextStyle): Self = StObject.set(x, "PowerPoint.TextStyle_typekey", value.asInstanceOf[js.Any])
    
    inline def setRuler(value: Ruler): Self = StObject.set(x, "Ruler", value.asInstanceOf[js.Any])
    
    inline def setTextFrame(value: TextFrame): Self = StObject.set(x, "TextFrame", value.asInstanceOf[js.Any])
  }
}
