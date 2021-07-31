package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OLEControl extends StObject {
  
  var AltHTML: String
  
  var Height: Double
  
  var Left: Double
  
  var Name: String
  
  @JSName("PowerPoint.OLEControl_typekey")
  var PowerPointDotOLEControl_typekey: OLEControl
  
  var Top: Double
  
  var Visible: Boolean
  
  var Width: Double
  
  val ZOrderPosition: Double
}
object OLEControl {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class OLEControlMutableBuilder[Self <: OLEControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltHTML(value: String): Self = StObject.set(x, "AltHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotOLEControl_typekey(value: OLEControl): Self = StObject.set(x, "PowerPoint.OLEControl_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZOrderPosition(value: Double): Self = StObject.set(x, "ZOrderPosition", value.asInstanceOf[js.Any])
  }
}
