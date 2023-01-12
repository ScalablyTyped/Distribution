package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlkContactPhoto extends StObject {
  
  var Enabled: Boolean
  
  var MouseIcon: StdPicture
  
  var MousePointer: OlMousePointer
  
  /* private */ @JSName("Outlook.OlkContactPhoto_typekey")
  var OutlookDotOlkContactPhoto_typekey: OlkContactPhoto
}
object OlkContactPhoto {
  
  inline def apply(
    Enabled: Boolean,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkContactPhoto_typekey: OlkContactPhoto
  ): OlkContactPhoto = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkContactPhoto_typekey")(OutlookDotOlkContactPhoto_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkContactPhoto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OlkContactPhoto] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setMouseIcon(value: StdPicture): Self = StObject.set(x, "MouseIcon", value.asInstanceOf[js.Any])
    
    inline def setMousePointer(value: OlMousePointer): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotOlkContactPhoto_typekey(value: OlkContactPhoto): Self = StObject.set(x, "Outlook.OlkContactPhoto_typekey", value.asInstanceOf[js.Any])
  }
}
