package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourceSetsResponse extends StObject {
  
  /**
    * The token that identifies which batch of results you want to see.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * A list of resource sets associated with the account.
    */
  var ResourceSets: js.UndefOr[listOfResourceSetOutput] = js.undefined
}
object ListResourceSetsResponse {
  
  inline def apply(): ListResourceSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceSetsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResourceSetsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceSets(value: listOfResourceSetOutput): Self = StObject.set(x, "ResourceSets", value.asInstanceOf[js.Any])
    
    inline def setResourceSetsUndefined: Self = StObject.set(x, "ResourceSets", js.undefined)
    
    inline def setResourceSetsVarargs(value: ResourceSetOutput*): Self = StObject.set(x, "ResourceSets", js.Array(value*))
  }
}
