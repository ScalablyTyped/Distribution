package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelMembershipsForAppInstanceUserRequest extends StObject {
  
  /**
    * The ARN of the AppInstanceUsers
    */
  var AppInstanceUserArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The AppInstanceUserArn of the user that makes the API call.
    */
  var ChimeBearer: ChimeArn
  
  /**
    * The maximum number of users that you want returned.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.MaxResults] = js.undefined
  
  /**
    * The token returned from previous API requests until the number of channel memberships is reached.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.NextToken] = js.undefined
}
object ListChannelMembershipsForAppInstanceUserRequest {
  
  inline def apply(ChimeBearer: ChimeArn): ListChannelMembershipsForAppInstanceUserRequest = {
    val __obj = js.Dynamic.literal(ChimeBearer = ChimeBearer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelMembershipsForAppInstanceUserRequest]
  }
  
  extension [Self <: ListChannelMembershipsForAppInstanceUserRequest](x: Self) {
    
    inline def setAppInstanceUserArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceUserArnUndefined: Self = StObject.set(x, "AppInstanceUserArn", js.undefined)
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
