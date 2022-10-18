package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFolderResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the folder.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Arn] = js.undefined
  
  /**
    * The ID of the folder.
    */
  var FolderId: js.UndefOr[RestrictiveResourceId] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object UpdateFolderResponse {
  
  inline def apply(): UpdateFolderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFolderResponse]
  }
  
  extension [Self <: UpdateFolderResponse](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setFolderId(value: RestrictiveResourceId): Self = StObject.set(x, "FolderId", value.asInstanceOf[js.Any])
    
    inline def setFolderIdUndefined: Self = StObject.set(x, "FolderId", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
