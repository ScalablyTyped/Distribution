package typings.awsSdk.clientsCodestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConnectionsInput extends StObject {
  
  /**
    * Filters the list of connections to those associated with a specified host.
    */
  var HostArnFilter: js.UndefOr[HostArn] = js.undefined
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsCodestarconnectionsMod.MaxResults] = js.undefined
  
  /**
    * The token that was returned from the previous ListConnections call, which can be used to return the next set of connections in the list.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCodestarconnectionsMod.NextToken] = js.undefined
  
  /**
    * Filters the list of connections to those associated with a specified provider, such as Bitbucket.
    */
  var ProviderTypeFilter: js.UndefOr[ProviderType] = js.undefined
}
object ListConnectionsInput {
  
  inline def apply(): ListConnectionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectionsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListConnectionsInput] (val x: Self) extends AnyVal {
    
    inline def setHostArnFilter(value: HostArn): Self = StObject.set(x, "HostArnFilter", value.asInstanceOf[js.Any])
    
    inline def setHostArnFilterUndefined: Self = StObject.set(x, "HostArnFilter", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProviderTypeFilter(value: ProviderType): Self = StObject.set(x, "ProviderTypeFilter", value.asInstanceOf[js.Any])
    
    inline def setProviderTypeFilterUndefined: Self = StObject.set(x, "ProviderTypeFilter", js.undefined)
  }
}
