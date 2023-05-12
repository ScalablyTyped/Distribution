package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMultipartReadSetUploadsResponse extends StObject {
  
  /**
    *  Next token returned in the response of a previous ListMultipartReadSetUploads call. Used to get the next page of results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    *  An array of multipart uploads. 
    */
  var uploads: js.UndefOr[MultipartReadSetUploadList] = js.undefined
}
object ListMultipartReadSetUploadsResponse {
  
  inline def apply(): ListMultipartReadSetUploadsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMultipartReadSetUploadsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMultipartReadSetUploadsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setUploads(value: MultipartReadSetUploadList): Self = StObject.set(x, "uploads", value.asInstanceOf[js.Any])
    
    inline def setUploadsUndefined: Self = StObject.set(x, "uploads", js.undefined)
    
    inline def setUploadsVarargs(value: MultipartReadSetUploadListItem*): Self = StObject.set(x, "uploads", js.Array(value*))
  }
}
