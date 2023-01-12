package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldValidationMessage extends StObject {
  
  /**
    * The message content.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * The field name.
    */
  var fieldName: js.UndefOr[String] = js.undefined
  
  /**
    * The message ID.
    */
  var identifier: js.UndefOr[String] = js.undefined
  
  /**
    * The message title.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The message type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object FieldValidationMessage {
  
  inline def apply(): FieldValidationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldValidationMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldValidationMessage] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
