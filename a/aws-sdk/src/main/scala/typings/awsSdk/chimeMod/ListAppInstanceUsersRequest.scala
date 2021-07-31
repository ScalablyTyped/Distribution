package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppInstanceUsersRequest extends StObject {
  
  /**
    * The ARN of the app instance.
    */
  var AppInstanceArn: ChimeArn
  
  /**
    * The maximum number of requests that you want returned.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.chimeMod.MaxResults] = js.undefined
  
  /**
    * The token passed by previous API calls until all requested users are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimeMod.NextToken] = js.undefined
}
object ListAppInstanceUsersRequest {
  
  @scala.inline
  def apply(AppInstanceArn: ChimeArn): ListAppInstanceUsersRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppInstanceUsersRequest]
  }
  
  @scala.inline
  implicit class ListAppInstanceUsersRequestMutableBuilder[Self <: ListAppInstanceUsersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
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
