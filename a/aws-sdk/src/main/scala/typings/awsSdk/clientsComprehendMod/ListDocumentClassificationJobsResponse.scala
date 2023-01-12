package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDocumentClassificationJobsResponse extends StObject {
  
  /**
    * A list containing the properties of each job returned.
    */
  var DocumentClassificationJobPropertiesList: js.UndefOr[typings.awsSdk.clientsComprehendMod.DocumentClassificationJobPropertiesList] = js.undefined
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListDocumentClassificationJobsResponse {
  
  inline def apply(): ListDocumentClassificationJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDocumentClassificationJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDocumentClassificationJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setDocumentClassificationJobPropertiesList(value: DocumentClassificationJobPropertiesList): Self = StObject.set(x, "DocumentClassificationJobPropertiesList", value.asInstanceOf[js.Any])
    
    inline def setDocumentClassificationJobPropertiesListUndefined: Self = StObject.set(x, "DocumentClassificationJobPropertiesList", js.undefined)
    
    inline def setDocumentClassificationJobPropertiesListVarargs(value: DocumentClassificationJobProperties*): Self = StObject.set(x, "DocumentClassificationJobPropertiesList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
