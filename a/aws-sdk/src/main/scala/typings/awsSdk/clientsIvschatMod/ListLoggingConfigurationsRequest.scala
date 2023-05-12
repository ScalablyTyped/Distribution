package typings.awsSdk.clientsIvschatMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLoggingConfigurationsRequest extends StObject {
  
  /**
    * Maximum number of logging configurations to return. Default: 50.
    */
  var maxResults: js.UndefOr[MaxLoggingConfigurationResults] = js.undefined
  
  /**
    * The first logging configurations to retrieve. This is used for pagination; see the nextToken response field.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListLoggingConfigurationsRequest {
  
  inline def apply(): ListLoggingConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLoggingConfigurationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLoggingConfigurationsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxLoggingConfigurationResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
