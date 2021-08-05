package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlkSenderPhoto extends StObject {
  
  var Enabled: Boolean
  
  var MouseIcon: StdPicture
  
  var MousePointer: OlMousePointer
  
  /* private */ @JSName("Outlook.OlkSenderPhoto_typekey")
  var OutlookDotOlkSenderPhoto_typekey: OlkSenderPhoto
  
  val PreferredHeight: Double
  
  val PreferredWidth: Double
}
object OlkSenderPhoto {
  
  inline def apply(
    Enabled: Boolean,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkSenderPhoto_typekey: OlkSenderPhoto,
    PreferredHeight: Double,
    PreferredWidth: Double
  ): OlkSenderPhoto = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], PreferredHeight = PreferredHeight.asInstanceOf[js.Any], PreferredWidth = PreferredWidth.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkSenderPhoto_typekey")(OutlookDotOlkSenderPhoto_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkSenderPhoto]
  }
  
  extension [Self <: OlkSenderPhoto](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setMouseIcon(value: StdPicture): Self = StObject.set(x, "MouseIcon", value.asInstanceOf[js.Any])
    
    inline def setMousePointer(value: OlMousePointer): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotOlkSenderPhoto_typekey(value: OlkSenderPhoto): Self = StObject.set(x, "Outlook.OlkSenderPhoto_typekey", value.asInstanceOf[js.Any])
    
    inline def setPreferredHeight(value: Double): Self = StObject.set(x, "PreferredHeight", value.asInstanceOf[js.Any])
    
    inline def setPreferredWidth(value: Double): Self = StObject.set(x, "PreferredWidth", value.asInstanceOf[js.Any])
  }
}
