package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChildrenResponse extends StObject {
  
  /**
    * The list of children of the specified parent container.
    */
  var Children: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.Children] = js.undefined
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.NextToken] = js.undefined
}
object ListChildrenResponse {
  
  inline def apply(): ListChildrenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChildrenResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListChildrenResponse] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Children): Self = StObject.set(x, "Children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "Children", js.undefined)
    
    inline def setChildrenVarargs(value: Child*): Self = StObject.set(x, "Children", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
