package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRotationsRequest extends StObject {
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.MaxResults] = js.undefined
  
  /**
    * A token to start the list. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * A filter to include rotations in list results based on their common prefix. For example, entering prod returns a list of all rotation names that begin with prod, such as production and prod-1.
    */
  var RotationNamePrefix: js.UndefOr[RotationName] = js.undefined
}
object ListRotationsRequest {
  
  inline def apply(): ListRotationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRotationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRotationsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRotationNamePrefix(value: RotationName): Self = StObject.set(x, "RotationNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setRotationNamePrefixUndefined: Self = StObject.set(x, "RotationNamePrefix", js.undefined)
  }
}
