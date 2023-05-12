package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateError extends StObject {
  
  /**
    * Description of the error type.
    */
  var Message: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Type of error.
    */
  var Type: js.UndefOr[TemplateErrorType] = js.undefined
  
  /**
    * An error path that shows which entities caused the template error.
    */
  var ViolatedEntities: js.UndefOr[EntityList] = js.undefined
}
object TemplateError {
  
  inline def apply(): TemplateError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateError] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: NonEmptyString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setType(value: TemplateErrorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setViolatedEntities(value: EntityList): Self = StObject.set(x, "ViolatedEntities", value.asInstanceOf[js.Any])
    
    inline def setViolatedEntitiesUndefined: Self = StObject.set(x, "ViolatedEntities", js.undefined)
    
    inline def setViolatedEntitiesVarargs(value: Entity*): Self = StObject.set(x, "ViolatedEntities", js.Array(value*))
  }
}
