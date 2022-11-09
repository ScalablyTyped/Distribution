package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchOutput extends StObject {
  
  /**
    * The number of resources that match the query.
    */
  var Count: js.UndefOr[ResourceCount] = js.undefined
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[SearchOutputNextTokenString] = js.undefined
  
  /**
    * The list of structures that describe the resources that match the query.
    */
  var Resources: js.UndefOr[ResourceList] = js.undefined
  
  /**
    * The Amazon resource name (ARN) of the view that this operation used to perform the search.
    */
  var ViewArn: js.UndefOr[SearchOutputViewArnString] = js.undefined
}
object SearchOutput {
  
  inline def apply(): SearchOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOutput]
  }
  
  extension [Self <: SearchOutput](x: Self) {
    
    inline def setCount(value: ResourceCount): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setNextToken(value: SearchOutputNextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResources(value: ResourceList): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    inline def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "Resources", js.Array(value*))
    
    inline def setViewArn(value: SearchOutputViewArnString): Self = StObject.set(x, "ViewArn", value.asInstanceOf[js.Any])
    
    inline def setViewArnUndefined: Self = StObject.set(x, "ViewArn", js.undefined)
  }
}
