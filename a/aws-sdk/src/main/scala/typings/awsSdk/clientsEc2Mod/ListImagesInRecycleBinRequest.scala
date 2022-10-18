package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImagesInRecycleBinRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IDs of the AMIs to list. Omit this parameter to list all of the AMIs that are in the Recycle Bin. You can specify up to 20 IDs in a single request.
    */
  var ImageIds: js.UndefOr[ImageIdStringList] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value. If you do not specify a value for MaxResults, the request returns 1,000 items per page by default. For more information, see  Pagination.
    */
  var MaxResults: js.UndefOr[ListImagesInRecycleBinMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListImagesInRecycleBinRequest {
  
  inline def apply(): ListImagesInRecycleBinRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImagesInRecycleBinRequest]
  }
  
  extension [Self <: ListImagesInRecycleBinRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setImageIds(value: ImageIdStringList): Self = StObject.set(x, "ImageIds", value.asInstanceOf[js.Any])
    
    inline def setImageIdsUndefined: Self = StObject.set(x, "ImageIds", js.undefined)
    
    inline def setImageIdsVarargs(value: ImageId*): Self = StObject.set(x, "ImageIds", js.Array(value*))
    
    inline def setMaxResults(value: ListImagesInRecycleBinMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
