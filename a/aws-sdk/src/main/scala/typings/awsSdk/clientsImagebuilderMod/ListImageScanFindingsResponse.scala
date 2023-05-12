package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImageScanFindingsResponse extends StObject {
  
  /**
    * The image scan findings for your account that meet your request filter criteria.
    */
  var findings: js.UndefOr[ImageScanFindingsList] = js.undefined
  
  /**
    * The next token used for paginated responses. When this field isn't empty, there are additional elements that the service has'ot included in this request. Use this token with the next request to retrieve additional objects.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object ListImageScanFindingsResponse {
  
  inline def apply(): ListImageScanFindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImageScanFindingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListImageScanFindingsResponse] (val x: Self) extends AnyVal {
    
    inline def setFindings(value: ImageScanFindingsList): Self = StObject.set(x, "findings", value.asInstanceOf[js.Any])
    
    inline def setFindingsUndefined: Self = StObject.set(x, "findings", js.undefined)
    
    inline def setFindingsVarargs(value: ImageScanFinding*): Self = StObject.set(x, "findings", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
