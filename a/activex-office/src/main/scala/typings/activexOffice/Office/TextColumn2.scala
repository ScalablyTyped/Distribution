package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextColumn2 extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  var Number: Double
  
  /* private */ @JSName("Office.TextColumn2_typekey")
  var OfficeDotTextColumn2_typekey: TextColumn2
  
  var Spacing: Double
  
  var TextDirection: MsoTextDirection
}
object TextColumn2 {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    Number: Double,
    OfficeDotTextColumn2_typekey: TextColumn2,
    Spacing: Double,
    TextDirection: MsoTextDirection
  ): TextColumn2 = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], Spacing = Spacing.asInstanceOf[js.Any], TextDirection = TextDirection.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.TextColumn2_typekey")(OfficeDotTextColumn2_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextColumn2]
  }
  
  extension [Self <: TextColumn2](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotTextColumn2_typekey(value: TextColumn2): Self = StObject.set(x, "Office.TextColumn2_typekey", value.asInstanceOf[js.Any])
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "Spacing", value.asInstanceOf[js.Any])
    
    inline def setTextDirection(value: MsoTextDirection): Self = StObject.set(x, "TextDirection", value.asInstanceOf[js.Any])
  }
}
