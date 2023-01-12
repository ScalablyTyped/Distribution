package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InAppMessageBodyConfig extends StObject {
  
  /**
    * The alignment of the text. Valid values: LEFT, CENTER, RIGHT.
    */
  var Alignment: typings.awsSdk.clientsPinpointMod.Alignment
  
  /**
    * Message Body.
    */
  var Body: string
  
  /**
    * The text color.
    */
  var TextColor: string
}
object InAppMessageBodyConfig {
  
  inline def apply(Alignment: Alignment, Body: string, TextColor: string): InAppMessageBodyConfig = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any], TextColor = TextColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[InAppMessageBodyConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InAppMessageBodyConfig] (val x: Self) extends AnyVal {
    
    inline def setAlignment(value: Alignment): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    inline def setBody(value: string): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: string): Self = StObject.set(x, "TextColor", value.asInstanceOf[js.Any])
  }
}
