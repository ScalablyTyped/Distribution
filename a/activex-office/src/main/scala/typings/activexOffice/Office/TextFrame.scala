package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextFrame extends StObject {
  
  val Application: js.Any
  
  val Creator: Double
  
  var MarginBottom: Double
  
  var MarginLeft: Double
  
  var MarginRight: Double
  
  var MarginTop: Double
  
  @JSName("Office.TextFrame_typekey")
  var OfficeDotTextFrame_typekey: TextFrame
  
  var Orientation: MsoTextOrientation
  
  val Parent: js.Any
}
object TextFrame {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    MarginBottom: Double,
    MarginLeft: Double,
    MarginRight: Double,
    MarginTop: Double,
    OfficeDotTextFrame_typekey: TextFrame,
    Orientation: MsoTextOrientation,
    Parent: js.Any
  ): TextFrame = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], MarginBottom = MarginBottom.asInstanceOf[js.Any], MarginLeft = MarginLeft.asInstanceOf[js.Any], MarginRight = MarginRight.asInstanceOf[js.Any], MarginTop = MarginTop.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.TextFrame_typekey")(OfficeDotTextFrame_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFrame]
  }
  
  @scala.inline
  implicit class TextFrameMutableBuilder[Self <: TextFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottom(value: Double): Self = StObject.set(x, "MarginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeft(value: Double): Self = StObject.set(x, "MarginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginRight(value: Double): Self = StObject.set(x, "MarginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTop(value: Double): Self = StObject.set(x, "MarginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotTextFrame_typekey(value: TextFrame): Self = StObject.set(x, "Office.TextFrame_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: MsoTextOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
