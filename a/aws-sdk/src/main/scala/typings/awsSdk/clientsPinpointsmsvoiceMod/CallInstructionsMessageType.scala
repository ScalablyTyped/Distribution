package typings.awsSdk.clientsPinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallInstructionsMessageType extends StObject {
  
  /**
    * The language to use when delivering the message. For a complete list of supported languages, see the Amazon Polly Developer Guide.
    */
  var Text: js.UndefOr[NonEmptyString] = js.undefined
}
object CallInstructionsMessageType {
  
  inline def apply(): CallInstructionsMessageType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallInstructionsMessageType]
  }
  
  extension [Self <: CallInstructionsMessageType](x: Self) {
    
    inline def setText(value: NonEmptyString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
  }
}
