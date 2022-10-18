package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDocumentClassifierResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the document classifier.
    */
  var DocumentClassifierArn: js.UndefOr[typings.awsSdk.clientsComprehendMod.DocumentClassifierArn] = js.undefined
}
object CreateDocumentClassifierResponse {
  
  inline def apply(): CreateDocumentClassifierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDocumentClassifierResponse]
  }
  
  extension [Self <: CreateDocumentClassifierResponse](x: Self) {
    
    inline def setDocumentClassifierArn(value: DocumentClassifierArn): Self = StObject.set(x, "DocumentClassifierArn", value.asInstanceOf[js.Any])
    
    inline def setDocumentClassifierArnUndefined: Self = StObject.set(x, "DocumentClassifierArn", js.undefined)
  }
}
