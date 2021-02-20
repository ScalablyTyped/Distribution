package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChannelMembershipsForAppInstanceUserRequest extends StObject {
  
  /**
    * The ARN of the app instance users
    */
  var AppInstanceUserArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The maximum number of users that you want returned. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.chimeMod.MaxResults] = js.native
  
  /**
    * The token returned from previous API requests until the number of channel memberships is reached.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimeMod.NextToken] = js.native
}
object ListChannelMembershipsForAppInstanceUserRequest {
  
  @scala.inline
  def apply(): ListChannelMembershipsForAppInstanceUserRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelMembershipsForAppInstanceUserRequest]
  }
  
  @scala.inline
  implicit class ListChannelMembershipsForAppInstanceUserRequestMutableBuilder[Self <: ListChannelMembershipsForAppInstanceUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceUserArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceUserArnUndefined: Self = StObject.set(x, "AppInstanceUserArn", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
