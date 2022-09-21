package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A string with formatting and styling.
  *
  * See https://developer.apple.com/documentation/foundation/attributedstring for more information.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait AttributedString extends StObject {
  
  /**
    * The formatting attributes.
    */
  var attributes: AttributeContainer
  
  /**
    * The string to display.
    */
  var string: String
}
object AttributedString {
  
  inline def apply(attributes: AttributeContainer, string: String): AttributedString = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributedString]
  }
  
  extension [Self <: AttributedString](x: Self) {
    
    inline def setAttributes(value: AttributeContainer): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
  }
}
