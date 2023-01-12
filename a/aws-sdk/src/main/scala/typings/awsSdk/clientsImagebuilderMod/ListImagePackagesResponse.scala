package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImagePackagesResponse extends StObject {
  
  /**
    * The list of Image Packages returned in the response.
    */
  var imagePackageList: js.UndefOr[ImagePackageList] = js.undefined
  
  /**
    * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object ListImagePackagesResponse {
  
  inline def apply(): ListImagePackagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImagePackagesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListImagePackagesResponse] (val x: Self) extends AnyVal {
    
    inline def setImagePackageList(value: ImagePackageList): Self = StObject.set(x, "imagePackageList", value.asInstanceOf[js.Any])
    
    inline def setImagePackageListUndefined: Self = StObject.set(x, "imagePackageList", js.undefined)
    
    inline def setImagePackageListVarargs(value: ImagePackage*): Self = StObject.set(x, "imagePackageList", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
