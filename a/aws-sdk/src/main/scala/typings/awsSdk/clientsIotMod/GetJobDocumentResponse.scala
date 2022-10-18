package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobDocumentResponse extends StObject {
  
  /**
    * The job document content.
    */
  var document: js.UndefOr[JobDocument] = js.undefined
}
object GetJobDocumentResponse {
  
  inline def apply(): GetJobDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobDocumentResponse]
  }
  
  extension [Self <: GetJobDocumentResponse](x: Self) {
    
    inline def setDocument(value: JobDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
  }
}
