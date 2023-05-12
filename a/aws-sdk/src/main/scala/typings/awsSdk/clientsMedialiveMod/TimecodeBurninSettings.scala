package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimecodeBurninSettings extends StObject {
  
  /**
    * Choose a timecode burn-in font size
    */
  var FontSize: TimecodeBurninFontSize
  
  /**
    * Choose a timecode burn-in output position
    */
  var Position: TimecodeBurninPosition
  
  /**
    * Create a timecode burn-in prefix (optional)
    */
  var Prefix: js.UndefOr[stringMax255] = js.undefined
}
object TimecodeBurninSettings {
  
  inline def apply(FontSize: TimecodeBurninFontSize, Position: TimecodeBurninPosition): TimecodeBurninSettings = {
    val __obj = js.Dynamic.literal(FontSize = FontSize.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimecodeBurninSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimecodeBurninSettings] (val x: Self) extends AnyVal {
    
    inline def setFontSize(value: TimecodeBurninFontSize): Self = StObject.set(x, "FontSize", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: TimecodeBurninPosition): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: stringMax255): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
