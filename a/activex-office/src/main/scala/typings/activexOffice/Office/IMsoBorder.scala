package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMsoBorder extends StObject {
  
  val Application: js.Any = js.native
  
  var Color: js.Any = js.native
  
  var ColorIndex: js.Any = js.native
  
  val Creator: Double = js.native
  
  var LineStyle: js.Any = js.native
  
  @JSName("Office.IMsoBorder_typekey")
  var OfficeDotIMsoBorder_typekey: IMsoBorder = js.native
  
  val Parent: js.Any = js.native
  
  var Weight: js.Any = js.native
}
object IMsoBorder {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IMsoBorderMutableBuilder[Self <: IMsoBorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: js.Any): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIndex(value: js.Any): Self = StObject.set(x, "ColorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyle(value: js.Any): Self = StObject.set(x, "LineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotIMsoBorder_typekey(value: IMsoBorder): Self = StObject.set(x, "Office.IMsoBorder_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: js.Any): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
  }
}
