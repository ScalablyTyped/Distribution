package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDocumentClassifiersResponse extends StObject {
  
  /**
    * A list containing the properties of each job returned.
    */
  var DocumentClassifierPropertiesList: js.UndefOr[typings.awsSdk.clientsComprehendMod.DocumentClassifierPropertiesList] = js.undefined
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListDocumentClassifiersResponse {
  
  inline def apply(): ListDocumentClassifiersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDocumentClassifiersResponse]
  }
  
  extension [Self <: ListDocumentClassifiersResponse](x: Self) {
    
    inline def setDocumentClassifierPropertiesList(value: DocumentClassifierPropertiesList): Self = StObject.set(x, "DocumentClassifierPropertiesList", value.asInstanceOf[js.Any])
    
    inline def setDocumentClassifierPropertiesListUndefined: Self = StObject.set(x, "DocumentClassifierPropertiesList", js.undefined)
    
    inline def setDocumentClassifierPropertiesListVarargs(value: DocumentClassifierProperties*): Self = StObject.set(x, "DocumentClassifierPropertiesList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
