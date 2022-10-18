package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListThingGroupsForThingResponse extends StObject {
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The thing groups.
    */
  var thingGroups: js.UndefOr[ThingGroupNameAndArnList] = js.undefined
}
object ListThingGroupsForThingResponse {
  
  inline def apply(): ListThingGroupsForThingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingGroupsForThingResponse]
  }
  
  extension [Self <: ListThingGroupsForThingResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setThingGroups(value: ThingGroupNameAndArnList): Self = StObject.set(x, "thingGroups", value.asInstanceOf[js.Any])
    
    inline def setThingGroupsUndefined: Self = StObject.set(x, "thingGroups", js.undefined)
    
    inline def setThingGroupsVarargs(value: GroupNameAndArn*): Self = StObject.set(x, "thingGroups", js.Array(value*))
  }
}
