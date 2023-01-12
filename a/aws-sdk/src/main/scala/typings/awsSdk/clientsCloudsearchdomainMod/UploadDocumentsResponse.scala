package typings.awsSdk.clientsCloudsearchdomainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadDocumentsResponse extends StObject {
  
  /**
    * The number of documents that were added to the search domain.
    */
  var adds: js.UndefOr[Adds] = js.undefined
  
  /**
    * The number of documents that were deleted from the search domain.
    */
  var deletes: js.UndefOr[Deletes] = js.undefined
  
  /**
    * The status of an UploadDocumentsRequest.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * Any warnings returned by the document service about the documents being uploaded.
    */
  var warnings: js.UndefOr[DocumentServiceWarnings] = js.undefined
}
object UploadDocumentsResponse {
  
  inline def apply(): UploadDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadDocumentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadDocumentsResponse] (val x: Self) extends AnyVal {
    
    inline def setAdds(value: Adds): Self = StObject.set(x, "adds", value.asInstanceOf[js.Any])
    
    inline def setAddsUndefined: Self = StObject.set(x, "adds", js.undefined)
    
    inline def setDeletes(value: Deletes): Self = StObject.set(x, "deletes", value.asInstanceOf[js.Any])
    
    inline def setDeletesUndefined: Self = StObject.set(x, "deletes", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setWarnings(value: DocumentServiceWarnings): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: DocumentServiceWarning*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
