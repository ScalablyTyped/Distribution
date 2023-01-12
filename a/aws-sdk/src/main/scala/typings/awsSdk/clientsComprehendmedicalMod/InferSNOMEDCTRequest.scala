package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferSNOMEDCTRequest extends StObject {
  
  /**
    *  The input text to be analyzed using InferSNOMEDCT. The text should be a string with 1 to 10000 characters. 
    */
  var Text: OntologyLinkingBoundedLengthString
}
object InferSNOMEDCTRequest {
  
  inline def apply(Text: OntologyLinkingBoundedLengthString): InferSNOMEDCTRequest = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferSNOMEDCTRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InferSNOMEDCTRequest] (val x: Self) extends AnyVal {
    
    inline def setText(value: OntologyLinkingBoundedLengthString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
