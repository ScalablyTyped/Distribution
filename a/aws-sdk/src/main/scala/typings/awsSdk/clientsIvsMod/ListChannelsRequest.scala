package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelsRequest extends StObject {
  
  /**
    * Filters the channel list to match the specified name.
    */
  var filterByName: js.UndefOr[ChannelName] = js.undefined
  
  /**
    * Filters the channel list to match the specified recording-configuration ARN.
    */
  var filterByRecordingConfigurationArn: js.UndefOr[ChannelRecordingConfigurationArn] = js.undefined
  
  /**
    * Maximum number of channels to return. Default: 100.
    */
  var maxResults: js.UndefOr[MaxChannelResults] = js.undefined
  
  /**
    * The first channel to retrieve. This is used for pagination; see the nextToken response field.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListChannelsRequest {
  
  inline def apply(): ListChannelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelsRequest]
  }
  
  extension [Self <: ListChannelsRequest](x: Self) {
    
    inline def setFilterByName(value: ChannelName): Self = StObject.set(x, "filterByName", value.asInstanceOf[js.Any])
    
    inline def setFilterByNameUndefined: Self = StObject.set(x, "filterByName", js.undefined)
    
    inline def setFilterByRecordingConfigurationArn(value: ChannelRecordingConfigurationArn): Self = StObject.set(x, "filterByRecordingConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setFilterByRecordingConfigurationArnUndefined: Self = StObject.set(x, "filterByRecordingConfigurationArn", js.undefined)
    
    inline def setMaxResults(value: MaxChannelResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
