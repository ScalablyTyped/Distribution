package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisError extends StObject {
  
  /**
    * The message associated with the analysis error.
    */
  var Message: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of the analysis error.
    */
  var Type: js.UndefOr[AnalysisErrorType] = js.undefined
  
  /**
    * Lists the violated entities that caused the analysis error
    */
  var ViolatedEntities: js.UndefOr[EntityList] = js.undefined
}
object AnalysisError {
  
  inline def apply(): AnalysisError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisError] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: NonEmptyString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setType(value: AnalysisErrorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setViolatedEntities(value: EntityList): Self = StObject.set(x, "ViolatedEntities", value.asInstanceOf[js.Any])
    
    inline def setViolatedEntitiesUndefined: Self = StObject.set(x, "ViolatedEntities", js.undefined)
    
    inline def setViolatedEntitiesVarargs(value: Entity*): Self = StObject.set(x, "ViolatedEntities", js.Array(value*))
  }
}
