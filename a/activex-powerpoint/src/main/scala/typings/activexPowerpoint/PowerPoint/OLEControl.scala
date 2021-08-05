package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OLEControl extends StObject {
  
  var AltHTML: String
  
  var Height: Double
  
  var Left: Double
  
  var Name: String
  
  /* private */ @JSName("PowerPoint.OLEControl_typekey")
  var PowerPointDotOLEControl_typekey: OLEControl
  
  var Top: Double
  
  var Visible: Boolean
  
  var Width: Double
  
  val ZOrderPosition: Double
}
object OLEControl {
  
  inline def apply(
    AltHTML: String,
    Height: Double,
    Left: Double,
    Name: String,
    PowerPointDotOLEControl_typekey: OLEControl,
    Top: Double,
    Visible: Boolean,
    Width: Double,
    ZOrderPosition: Double
  ): OLEControl = {
    val __obj = js.Dynamic.literal(AltHTML = AltHTML.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], ZOrderPosition = ZOrderPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.OLEControl_typekey")(PowerPointDotOLEControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OLEControl]
  }
  
  extension [Self <: OLEControl](x: Self) {
    
    inline def setAltHTML(value: String): Self = StObject.set(x, "AltHTML", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotOLEControl_typekey(value: OLEControl): Self = StObject.set(x, "PowerPoint.OLEControl_typekey", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setZOrderPosition(value: Double): Self = StObject.set(x, "ZOrderPosition", value.asInstanceOf[js.Any])
  }
}
