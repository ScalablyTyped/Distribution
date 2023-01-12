package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConnectionsRequest extends StObject {
  
  /**
    * The state of the connection.
    */
  var ConnectionState: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.ConnectionState] = js.undefined
  
  /**
    * The maximum number of connections to return.
    */
  var Limit: js.UndefOr[LimitMax100] = js.undefined
  
  /**
    * A name prefix to filter results returned. Only connections with a name that starts with the prefix are returned.
    */
  var NamePrefix: js.UndefOr[ConnectionName] = js.undefined
  
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.NextToken] = js.undefined
}
object ListConnectionsRequest {
  
  inline def apply(): ListConnectionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListConnectionsRequest] (val x: Self) extends AnyVal {
    
    inline def setConnectionState(value: ConnectionState): Self = StObject.set(x, "ConnectionState", value.asInstanceOf[js.Any])
    
    inline def setConnectionStateUndefined: Self = StObject.set(x, "ConnectionState", js.undefined)
    
    inline def setLimit(value: LimitMax100): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNamePrefix(value: ConnectionName): Self = StObject.set(x, "NamePrefix", value.asInstanceOf[js.Any])
    
    inline def setNamePrefixUndefined: Self = StObject.set(x, "NamePrefix", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
