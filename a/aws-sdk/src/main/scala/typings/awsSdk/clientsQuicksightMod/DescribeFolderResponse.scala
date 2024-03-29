package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFolderResponse extends StObject {
  
  /**
    * Information about the folder.
    */
  var Folder: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Folder] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object DescribeFolderResponse {
  
  inline def apply(): DescribeFolderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFolderResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFolderResponse] (val x: Self) extends AnyVal {
    
    inline def setFolder(value: Folder): Self = StObject.set(x, "Folder", value.asInstanceOf[js.Any])
    
    inline def setFolderUndefined: Self = StObject.set(x, "Folder", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
