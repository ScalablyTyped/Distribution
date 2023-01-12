package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricDataError extends StObject {
  
  /**
    * The query error code. Can be one of:    INTERNAL_FAILURE – Amazon SES has failed to process one of the queries.    ACCESS_DENIED – You have insufficient access to retrieve metrics based on the given query.  
    */
  var Code: js.UndefOr[QueryErrorCode] = js.undefined
  
  /**
    * The query identifier.
    */
  var Id: js.UndefOr[QueryIdentifier] = js.undefined
  
  /**
    * The error message associated with the current query error.
    */
  var Message: js.UndefOr[QueryErrorMessage] = js.undefined
}
object MetricDataError {
  
  inline def apply(): MetricDataError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricDataError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricDataError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: QueryErrorCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setId(value: QueryIdentifier): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setMessage(value: QueryErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
