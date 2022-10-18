package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchChannelsRequest extends StObject {
  
  /**
    * The AppInstanceUserArn of the user making the API call.
    */
  var ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * A list of the Field objects in the channel being searched.
    */
  var Fields: SearchFields
  
  /**
    * The maximum number of channels that you want returned.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.MaxResults] = js.undefined
  
  /**
    * The token returned from previous API requests until the number of channels is reached.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.NextToken] = js.undefined
}
object SearchChannelsRequest {
  
  inline def apply(Fields: SearchFields): SearchChannelsRequest = {
    val __obj = js.Dynamic.literal(Fields = Fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchChannelsRequest]
  }
  
  extension [Self <: SearchChannelsRequest](x: Self) {
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
    
    inline def setChimeBearerUndefined: Self = StObject.set(x, "ChimeBearer", js.undefined)
    
    inline def setFields(value: SearchFields): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: SearchField*): Self = StObject.set(x, "Fields", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
