package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLaunchProfilesResponse extends StObject {
  
  /**
    * A collection of launch profiles.
    */
  var launchProfiles: js.UndefOr[LaunchProfileList] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListLaunchProfilesResponse {
  
  inline def apply(): ListLaunchProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLaunchProfilesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLaunchProfilesResponse] (val x: Self) extends AnyVal {
    
    inline def setLaunchProfiles(value: LaunchProfileList): Self = StObject.set(x, "launchProfiles", value.asInstanceOf[js.Any])
    
    inline def setLaunchProfilesUndefined: Self = StObject.set(x, "launchProfiles", js.undefined)
    
    inline def setLaunchProfilesVarargs(value: LaunchProfile*): Self = StObject.set(x, "launchProfiles", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
