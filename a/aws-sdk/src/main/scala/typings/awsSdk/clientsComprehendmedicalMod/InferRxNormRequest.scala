package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferRxNormRequest extends StObject {
  
  /**
    * The input text used for analysis. The input for InferRxNorm is a string from 1 to 10000 characters.
    */
  var Text: OntologyLinkingBoundedLengthString
}
object InferRxNormRequest {
  
  inline def apply(Text: OntologyLinkingBoundedLengthString): InferRxNormRequest = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferRxNormRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InferRxNormRequest] (val x: Self) extends AnyVal {
    
    inline def setText(value: OntologyLinkingBoundedLengthString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
