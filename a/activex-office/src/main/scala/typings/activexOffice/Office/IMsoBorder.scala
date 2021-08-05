package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMsoBorder extends StObject {
  
  val Application: js.Any
  
  var Color: js.Any
  
  var ColorIndex: js.Any
  
  val Creator: Double
  
  var LineStyle: js.Any
  
  /* private */ @JSName("Office.IMsoBorder_typekey")
  var OfficeDotIMsoBorder_typekey: IMsoBorder
  
  val Parent: js.Any
  
  var Weight: js.Any
}
object IMsoBorder {
  
  inline def apply(
    Application: js.Any,
    Color: js.Any,
    ColorIndex: js.Any,
    Creator: Double,
    LineStyle: js.Any,
    OfficeDotIMsoBorder_typekey: IMsoBorder,
    Parent: js.Any,
    Weight: js.Any
  ): IMsoBorder = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoBorder_typekey")(OfficeDotIMsoBorder_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoBorder]
  }
  
  extension [Self <: IMsoBorder](x: Self) {
    
    inline def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setColor(value: js.Any): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorIndex(value: js.Any): Self = StObject.set(x, "ColorIndex", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setLineStyle(value: js.Any): Self = StObject.set(x, "LineStyle", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotIMsoBorder_typekey(value: IMsoBorder): Self = StObject.set(x, "Office.IMsoBorder_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: js.Any): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
  }
}
