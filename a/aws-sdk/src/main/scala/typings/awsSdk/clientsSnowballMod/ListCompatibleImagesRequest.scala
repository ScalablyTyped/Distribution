package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCompatibleImagesRequest extends StObject {
  
  /**
    * The maximum number of results for the list of compatible images. Currently, a Snowball Edge device can store 10 AMIs.
    */
  var MaxResults: js.UndefOr[ListLimit] = js.undefined
  
  /**
    * HTTP requests are stateless. To identify what object comes "next" in the list of compatible images, you can specify a value for NextToken as the starting point for your list of returned images.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListCompatibleImagesRequest {
  
  inline def apply(): ListCompatibleImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCompatibleImagesRequest]
  }
  
  extension [Self <: ListCompatibleImagesRequest](x: Self) {
    
    inline def setMaxResults(value: ListLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
