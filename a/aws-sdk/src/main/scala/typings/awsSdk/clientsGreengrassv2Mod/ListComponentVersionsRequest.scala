package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListComponentVersionsRequest extends StObject {
  
  /**
    * The ARN of the component.
    */
  var arn: ComponentARN
  
  /**
    * The maximum number of results to be returned per paginated request.
    */
  var maxResults: js.UndefOr[DefaultMaxResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextTokenString] = js.undefined
}
object ListComponentVersionsRequest {
  
  inline def apply(arn: ComponentARN): ListComponentVersionsRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListComponentVersionsRequest]
  }
  
  extension [Self <: ListComponentVersionsRequest](x: Self) {
    
    inline def setArn(value: ComponentARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: DefaultMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
