package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListParentsResponse extends StObject {
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.NextToken] = js.undefined
  
  /**
    * A list of parents for the specified child account or OU.
    */
  var Parents: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.Parents] = js.undefined
}
object ListParentsResponse {
  
  inline def apply(): ListParentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListParentsResponse]
  }
  
  extension [Self <: ListParentsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setParents(value: Parents): Self = StObject.set(x, "Parents", value.asInstanceOf[js.Any])
    
    inline def setParentsUndefined: Self = StObject.set(x, "Parents", js.undefined)
    
    inline def setParentsVarargs(value: Parent*): Self = StObject.set(x, "Parents", js.Array(value*))
  }
}
