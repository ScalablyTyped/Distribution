package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListThingGroupsResponse extends StObject {
  
  /**
    * The token to use to get the next set of results. Will not be returned if operation has returned all results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The thing groups.
    */
  var thingGroups: js.UndefOr[ThingGroupNameAndArnList] = js.undefined
}
object ListThingGroupsResponse {
  
  inline def apply(): ListThingGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingGroupsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListThingGroupsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setThingGroups(value: ThingGroupNameAndArnList): Self = StObject.set(x, "thingGroups", value.asInstanceOf[js.Any])
    
    inline def setThingGroupsUndefined: Self = StObject.set(x, "thingGroups", js.undefined)
    
    inline def setThingGroupsVarargs(value: GroupNameAndArn*): Self = StObject.set(x, "thingGroups", js.Array(value*))
  }
}
