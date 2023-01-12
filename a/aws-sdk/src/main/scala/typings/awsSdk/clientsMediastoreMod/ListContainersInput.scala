package typings.awsSdk.clientsMediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContainersInput extends StObject {
  
  /**
    * Enter the maximum number of containers in the response. Use from 1 to 255 characters. 
    */
  var MaxResults: js.UndefOr[ContainerListLimit] = js.undefined
  
  /**
    * Only if you used MaxResults in the first command, enter the token (which was included in the previous response) to obtain the next set of containers. This token is included in a response only if there actually are more containers to list.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListContainersInput {
  
  inline def apply(): ListContainersInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContainersInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListContainersInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ContainerListLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
