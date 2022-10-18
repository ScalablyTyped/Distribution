package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDocumentClassifierRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the document classifier. 
    */
  var DocumentClassifierArn: typings.awsSdk.clientsComprehendMod.DocumentClassifierArn
}
object DeleteDocumentClassifierRequest {
  
  inline def apply(DocumentClassifierArn: DocumentClassifierArn): DeleteDocumentClassifierRequest = {
    val __obj = js.Dynamic.literal(DocumentClassifierArn = DocumentClassifierArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDocumentClassifierRequest]
  }
  
  extension [Self <: DeleteDocumentClassifierRequest](x: Self) {
    
    inline def setDocumentClassifierArn(value: DocumentClassifierArn): Self = StObject.set(x, "DocumentClassifierArn", value.asInstanceOf[js.Any])
  }
}
