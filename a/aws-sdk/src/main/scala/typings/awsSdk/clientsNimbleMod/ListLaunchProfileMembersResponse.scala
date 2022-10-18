package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLaunchProfileMembersResponse extends StObject {
  
  /**
    * A list of members.
    */
  var members: js.UndefOr[LaunchProfileMembershipList] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListLaunchProfileMembersResponse {
  
  inline def apply(): ListLaunchProfileMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLaunchProfileMembersResponse]
  }
  
  extension [Self <: ListLaunchProfileMembersResponse](x: Self) {
    
    inline def setMembers(value: LaunchProfileMembershipList): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: LaunchProfileMembership*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
