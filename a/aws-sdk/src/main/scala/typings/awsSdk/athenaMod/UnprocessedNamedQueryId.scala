package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnprocessedNamedQueryId extends StObject {
  
  /**
    * The error code returned when the processing request for the named query failed, if applicable.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.athenaMod.ErrorCode] = js.undefined
  
  /**
    * The error message returned when the processing request for the named query failed, if applicable.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.athenaMod.ErrorMessage] = js.undefined
  
  /**
    * The unique identifier of the named query.
    */
  var NamedQueryId: js.UndefOr[typings.awsSdk.athenaMod.NamedQueryId] = js.undefined
}
object UnprocessedNamedQueryId {
  
  inline def apply(): UnprocessedNamedQueryId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedNamedQueryId]
  }
  
  extension [Self <: UnprocessedNamedQueryId](x: Self) {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setNamedQueryId(value: NamedQueryId): Self = StObject.set(x, "NamedQueryId", value.asInstanceOf[js.Any])
    
    inline def setNamedQueryIdUndefined: Self = StObject.set(x, "NamedQueryId", js.undefined)
  }
}
