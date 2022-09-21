package typings.awsLambda.lexV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexV2ImageResponseCardButton extends StObject {
  
  var text: String
  
  var value: String
}
object LexV2ImageResponseCardButton {
  
  inline def apply(text: String, value: String): LexV2ImageResponseCardButton = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexV2ImageResponseCardButton]
  }
  
  extension [Self <: LexV2ImageResponseCardButton](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
