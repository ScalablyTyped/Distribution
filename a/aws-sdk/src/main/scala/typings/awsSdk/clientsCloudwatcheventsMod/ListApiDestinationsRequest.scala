package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApiDestinationsRequest extends StObject {
  
  /**
    * The ARN of the connection specified for the API destination.
    */
  var ConnectionArn: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.ConnectionArn] = js.undefined
  
  /**
    * The maximum number of API destinations to include in the response.
    */
  var Limit: js.UndefOr[LimitMax100] = js.undefined
  
  /**
    * A name prefix to filter results returned. Only API destinations with a name that starts with the prefix are returned.
    */
  var NamePrefix: js.UndefOr[ApiDestinationName] = js.undefined
  
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.NextToken] = js.undefined
}
object ListApiDestinationsRequest {
  
  inline def apply(): ListApiDestinationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApiDestinationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListApiDestinationsRequest] (val x: Self) extends AnyVal {
    
    inline def setConnectionArn(value: ConnectionArn): Self = StObject.set(x, "ConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setConnectionArnUndefined: Self = StObject.set(x, "ConnectionArn", js.undefined)
    
    inline def setLimit(value: LimitMax100): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNamePrefix(value: ApiDestinationName): Self = StObject.set(x, "NamePrefix", value.asInstanceOf[js.Any])
    
    inline def setNamePrefixUndefined: Self = StObject.set(x, "NamePrefix", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
