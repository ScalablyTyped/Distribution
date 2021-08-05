package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlkBusinessCardControl extends StObject {
  
  var MouseIcon: StdPicture
  
  var MousePointer: OlMousePointer
  
  /* private */ @JSName("Outlook.OlkBusinessCardControl_typekey")
  var OutlookDotOlkBusinessCardControl_typekey: OlkBusinessCardControl
}
object OlkBusinessCardControl {
  
  inline def apply(
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkBusinessCardControl_typekey: OlkBusinessCardControl
  ): OlkBusinessCardControl = {
    val __obj = js.Dynamic.literal(MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkBusinessCardControl_typekey")(OutlookDotOlkBusinessCardControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkBusinessCardControl]
  }
  
  extension [Self <: OlkBusinessCardControl](x: Self) {
    
    inline def setMouseIcon(value: StdPicture): Self = StObject.set(x, "MouseIcon", value.asInstanceOf[js.Any])
    
    inline def setMousePointer(value: OlMousePointer): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotOlkBusinessCardControl_typekey(value: OlkBusinessCardControl): Self = StObject.set(x, "Outlook.OlkBusinessCardControl_typekey", value.asInstanceOf[js.Any])
  }
}
