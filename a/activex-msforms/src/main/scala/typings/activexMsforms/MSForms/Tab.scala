package typings.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tab extends StObject {
  
  var Accelerator: String
  
  var Caption: String
  
  var ControlTipText: String
  
  var Enabled: Boolean
  
  var Index: Double
  
  /* private */ @JSName("MSForms.Tab_typekey")
  var MSFormsDotTab_typekey: Tab
  
  var Name: String
  
  var Tag: String
  
  var Visible: Boolean
}
object Tab {
  
  inline def apply(
    Accelerator: String,
    Caption: String,
    ControlTipText: String,
    Enabled: Boolean,
    Index: Double,
    MSFormsDotTab_typekey: Tab,
    Name: String,
    Tag: String,
    Visible: Boolean
  ): Tab = {
    val __obj = js.Dynamic.literal(Accelerator = Accelerator.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], ControlTipText = ControlTipText.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.Tab_typekey")(MSFormsDotTab_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tab] (val x: Self) extends AnyVal {
    
    inline def setAccelerator(value: String): Self = StObject.set(x, "Accelerator", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    inline def setControlTipText(value: String): Self = StObject.set(x, "ControlTipText", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setMSFormsDotTab_typekey(value: Tab): Self = StObject.set(x, "MSForms.Tab_typekey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
