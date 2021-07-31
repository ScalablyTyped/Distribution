package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlkInfoBar extends StObject {
  
  var MouseIcon: StdPicture
  
  var MousePointer: OlMousePointer
  
  @JSName("Outlook.OlkInfoBar_typekey")
  var OutlookDotOlkInfoBar_typekey: OlkInfoBar
}
object OlkInfoBar {
  
  @scala.inline
  def apply(MouseIcon: StdPicture, MousePointer: OlMousePointer, OutlookDotOlkInfoBar_typekey: OlkInfoBar): OlkInfoBar = {
    val __obj = js.Dynamic.literal(MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkInfoBar_typekey")(OutlookDotOlkInfoBar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkInfoBar]
  }
  
  @scala.inline
  implicit class OlkInfoBarMutableBuilder[Self <: OlkInfoBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMouseIcon(value: StdPicture): Self = StObject.set(x, "MouseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousePointer(value: OlMousePointer): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotOlkInfoBar_typekey(value: OlkInfoBar): Self = StObject.set(x, "Outlook.OlkInfoBar_typekey", value.asInstanceOf[js.Any])
  }
}
