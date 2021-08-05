package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OLEControl extends StObject {
  
  def Activate(): Unit
  
  var AltHTML: String
  
  val Automation: js.Any
  
  def Copy(): Unit
  
  def Cut(): Unit
  
  def Delete(): Unit
  
  var Height: Double
  
  var Left: Double
  
  var Name: String
  
  def Select(): Unit
  
  var Top: Double
  
  var Width: Double
  
  /* private */ @JSName("Word.OLEControl_typekey")
  var WordDotOLEControl_typekey: OLEControl
}
object OLEControl {
  
  inline def apply(
    Activate: () => Unit,
    AltHTML: String,
    Automation: js.Any,
    Copy: () => Unit,
    Cut: () => Unit,
    Delete: () => Unit,
    Height: Double,
    Left: Double,
    Name: String,
    Select: () => Unit,
    Top: Double,
    Width: Double,
    WordDotOLEControl_typekey: OLEControl
  ): OLEControl = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), AltHTML = AltHTML.asInstanceOf[js.Any], Automation = Automation.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), Cut = js.Any.fromFunction0(Cut), Delete = js.Any.fromFunction0(Delete), Height = Height.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OLEControl_typekey")(WordDotOLEControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OLEControl]
  }
  
  extension [Self <: OLEControl](x: Self) {
    
    inline def setActivate(value: () => Unit): Self = StObject.set(x, "Activate", js.Any.fromFunction0(value))
    
    inline def setAltHTML(value: String): Self = StObject.set(x, "AltHTML", value.asInstanceOf[js.Any])
    
    inline def setAutomation(value: js.Any): Self = StObject.set(x, "Automation", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: () => Unit): Self = StObject.set(x, "Copy", js.Any.fromFunction0(value))
    
    inline def setCut(value: () => Unit): Self = StObject.set(x, "Cut", js.Any.fromFunction0(value))
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    inline def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWordDotOLEControl_typekey(value: OLEControl): Self = StObject.set(x, "Word.OLEControl_typekey", value.asInstanceOf[js.Any])
  }
}
