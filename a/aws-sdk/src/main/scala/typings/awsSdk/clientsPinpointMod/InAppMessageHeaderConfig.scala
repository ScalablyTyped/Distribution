package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InAppMessageHeaderConfig extends StObject {
  
  /**
    * The alignment of the text. Valid values: LEFT, CENTER, RIGHT.
    */
  var Alignment: typings.awsSdk.clientsPinpointMod.Alignment
  
  /**
    * Message Header.
    */
  var Header: string
  
  /**
    * The text color.
    */
  var TextColor: string
}
object InAppMessageHeaderConfig {
  
  inline def apply(Alignment: Alignment, Header: string, TextColor: string): InAppMessageHeaderConfig = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], TextColor = TextColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[InAppMessageHeaderConfig]
  }
  
  extension [Self <: InAppMessageHeaderConfig](x: Self) {
    
    inline def setAlignment(value: Alignment): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: string): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: string): Self = StObject.set(x, "TextColor", value.asInstanceOf[js.Any])
  }
}
