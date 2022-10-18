package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceInput extends StObject {
  
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource for which you want to get information about tags, if any.
    */
  var resourceArn: ResourceArn
}
object ListTagsForResourceInput {
  
  inline def apply(resourceArn: ResourceArn): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
  
  extension [Self <: ListTagsForResourceInput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
