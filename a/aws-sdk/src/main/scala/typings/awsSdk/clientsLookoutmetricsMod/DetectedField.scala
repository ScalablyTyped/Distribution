package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectedField extends StObject {
  
  /**
    * The field's confidence.
    */
  var Confidence: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.Confidence] = js.undefined
  
  /**
    * The field's message.
    */
  var Message: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.Message] = js.undefined
  
  /**
    * The field's value.
    */
  var Value: js.UndefOr[AttributeValue] = js.undefined
}
object DetectedField {
  
  inline def apply(): DetectedField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectedField] (val x: Self) extends AnyVal {
    
    inline def setConfidence(value: Confidence): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setValue(value: AttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
