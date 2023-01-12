package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectPHIRequest extends StObject {
  
  /**
    *  A UTF-8 text string containing the clinical content being examined for PHI entities. Each string must contain fewer than 20,000 bytes of characters.
    */
  var Text: BoundedLengthString
}
object DetectPHIRequest {
  
  inline def apply(Text: BoundedLengthString): DetectPHIRequest = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectPHIRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectPHIRequest] (val x: Self) extends AnyVal {
    
    inline def setText(value: BoundedLengthString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
